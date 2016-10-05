package br.com.dpjmanager.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.dpjmanager.dao.UsuarioDAO;
import br.com.dpjmanager.entidades.dpjmanager.Usuario;
import br.com.dpjmanager.enums.ChaveMensagem;
import br.com.dpjmanager.exception.BusinessException;
import br.com.dpjmanager.service.UsuarioService;

/**
 * Implementação da Interface de serviço para as funcionalidades que envolvem o usuário.
 * 
 * @author Agosto/2016: Ivan Dias <DD>
 */
@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService
{

   @Autowired
   private UsuarioDAO usuarioDAO;

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.UsuarioService#obtemPorLogin(java.lang.String)
    */
   @Override
   public Usuario obtemPorLogin(String login)
   {
      return usuarioDAO.obtemUsuarioPorLogin(login);
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.UsuarioService#atualizar(br.com.dpjmanager.entidades.dpjmanager.Usuario)
    */
   @Override
   public void atualizar(Usuario usuario)
   {
      usuarioDAO.atualizar(usuario);
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @throws BusinessException
    * @see br.com.dpjmanager.service.UsuarioService#alterarSenhaPrimeiroAcessoUsuario(java.lang.String, java.lang.String, java.lang.String,
    *      java.lang.String)
    */
   @Override
   @Transactional(propagation = Propagation.REQUIRES_NEW, transactionManager = "transactionManagerDpjManager")
   public void alterarSenhaPrimeiroAcessoUsuario(String login, String senhaAtual, String novaSenha, String confirmacaoNovaSenha)
      throws BusinessException
   {
      if (StringUtils.equalsIgnoreCase(senhaAtual, novaSenha))
      {
         throw new BusinessException(ChaveMensagem.ERRO_NOVA_SENHA_DEVE_SER_DIFERENTE_ATUAL.getChave());
      }
      if (!StringUtils.equals(novaSenha, confirmacaoNovaSenha))
      {
         throw new BusinessException(ChaveMensagem.ERRO_NOVA_SENHA_E_SUA_CONFIRMACAO_DEVEM_SER_IGUAIS.getChave());
      }
      Usuario usuario = obtemPorLogin(login);
      if (usuario == null)
      {
         throw new BusinessException(ChaveMensagem.ERRO_LOGIN_INVALIDO.getChave());
      }
      BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
      if (!encoder.matches(senhaAtual, usuario.getSenha()))
      {
         throw new BusinessException(ChaveMensagem.ERRO_SENHA_ATUAL_NAO_CONFERE.getChave());
      }
      usuario.setPrimeiroAcesso(false);
      usuario.setSenha(new BCryptPasswordEncoder().encode(novaSenha));
      atualizar(usuario);
   }

}
