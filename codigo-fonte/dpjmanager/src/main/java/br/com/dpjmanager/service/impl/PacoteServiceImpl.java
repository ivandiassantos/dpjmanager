
package br.com.dpjmanager.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.dpjmanager.dao.PacoteDAO;
import br.com.dpjmanager.dto.PacoteDTO;
import br.com.dpjmanager.dto.SolicitacaoDTO;
import br.com.dpjmanager.entidades.cq.Solicitacao;
import br.com.dpjmanager.entidades.dpjmanager.Pacote;
import br.com.dpjmanager.entidades.dpjmanager.PacoteSolicitacao;
import br.com.dpjmanager.enums.ChaveMensagem;
import br.com.dpjmanager.exception.BusinessException;
import br.com.dpjmanager.service.PacoteService;
import br.com.dpjmanager.service.PacoteSolicitacaoService;
import br.com.dpjmanager.service.SolicitacaoService;

/**
 * Classe de serviço para funcionalidades relacionadas a pacote.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
@Service("pacoteService")
public class PacoteServiceImpl implements PacoteService
{

   @Autowired
   private PacoteDAO pacoteDAO;
   @Autowired
   private PacoteSolicitacaoService pacoteSolicitacaoService;
   @Autowired
   private SolicitacaoService solicitacaoService;

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.PacoteService#incluirPacote(br.com.dpjmanager.entidades.dpjmanager.Pacote, java.lang.String)
    */
   @Transactional(propagation = Propagation.REQUIRES_NEW, transactionManager = "transactionManagerDpjManager")
   @Override
   public void incluirPacote(Pacote pacote, String solicitacoes) throws BusinessException
   {
      validarNomePacote(pacote);
      String[] arraySolicitacoes = obtemArraySolicitacoes(solicitacoes);
      pacote.setDataCriacao(new Date());
      pacoteDAO.salvar(pacote);
      for (String idSolicitacao : arraySolicitacoes)
      {
         PacoteSolicitacao pacoteSolicitacao = new PacoteSolicitacao();
         pacoteSolicitacao.setDataInclusao(new Date());
         pacoteSolicitacao.setIdSolicitacao(idSolicitacao);
         pacoteSolicitacao.setPacote(pacote);
         salvaPacoteSolicitacao(pacoteSolicitacao);
      }
   }

   /**
    * Verifica se existe um pacote cadastrado com o mesmo nome.
    * 
    * @param pacote
    * @throws BusinessException
    */
   private void validarNomePacote(Pacote pacote) throws BusinessException
   {
      Long qtdRegistros = pacoteDAO.validaNomePacote(pacote);
      if (qtdRegistros > 0)
      {
         throw new BusinessException(ChaveMensagem.ERRO_NOME_PACOTE_EXISTENTE.getChave());
      }
   }

   /**
    * Obtém um array a partir das solicitações informadas.
    * 
    * @param solicitacoes
    * @return numerosSolicitacoes
    */
   private String[] obtemArraySolicitacoes(String solicitacoes)
   {
      String numerosSolicitacoes = solicitacoes.replaceAll("[^0-9a-zA-Z,]", "");
      return numerosSolicitacoes.split(",");
   }

   /**
    * Salva o relacionamento entre pacote e solicitação.
    * 
    * @param pacoteSolicitacao
    */
   @Transactional(propagation = Propagation.NESTED, transactionManager = "transactionManagerDpjManager")
   private void salvaPacoteSolicitacao(PacoteSolicitacao pacoteSolicitacao)
   {
      pacoteSolicitacaoService.incluirPacoteSolicitacao(pacoteSolicitacao);
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.PacoteService#listarPacotes()
    */
   @Override
   public List<PacoteDTO> listarPacotes()
   {
      List<PacoteDTO> listaPacotes = new ArrayList<>();
      List<Pacote> pacotes = pacoteDAO.listarPacotes();
      for (Pacote pacote : pacotes)
      {
         PacoteDTO pacoteDTO = new PacoteDTO();
         pacoteDTO.setCodPacote(pacote.getCodPacote());
         pacoteDTO.setNomePacote(pacote.getNomePacote());
         pacoteDTO.setDataInicio(pacote.getDataInicio());
         pacoteDTO.setDataFinal(pacote.getDataFinal());
         pacoteDTO.setSolicitacoes(new ArrayList<SolicitacaoDTO>());
         for (PacoteSolicitacao pacoteSolicitacao : pacote.getPacotesSolicitacao())
         {
            Solicitacao solicitacao = solicitacaoService.obtemPorId(pacoteSolicitacao.getIdSolicitacao());
            pacoteDTO.getSolicitacoes().add(new SolicitacaoDTO(solicitacao.getIdSolicitacao(), solicitacao.getDescricaoSolicitacao()));
         }
         listaPacotes.add(pacoteDTO);
      }
      return listaPacotes;
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.PacoteService#obtemPorId(java.lang.Long)
    */
   @Override
   public Pacote obtemPorId(Long codPacote)
   {
      return pacoteDAO.obtemPorId(codPacote);
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @throws BusinessException
    * @see br.com.dpjmanager.service.PacoteService#editarPacote(br.com.dpjmanager.entidades.dpjmanager.Pacote, java.lang.String)
    */
   @Transactional(propagation = Propagation.REQUIRED, transactionManager = "transactionManagerDpjManager")
   @Override
   public void editarPacote(Pacote pacote, String solicitacoes) throws BusinessException
   {
      validaNomePacote(pacote.getNomePacote(), pacote.getCodPacote());
      pacoteDAO.editar(pacote);
      pacoteSolicitacaoService.removerPorCodigoPacote(pacote.getCodPacote());
      String[] arraySolicitacoes = obtemArraySolicitacoes(solicitacoes);
      for (String idSolicitacao : arraySolicitacoes)
      {
         PacoteSolicitacao pacoteSolicitacao = new PacoteSolicitacao();
         pacoteSolicitacao.setDataInclusao(new Date());
         pacoteSolicitacao.setIdSolicitacao(idSolicitacao);
         pacoteSolicitacao.setPacote(pacote);
         salvaPacoteSolicitacao(pacoteSolicitacao);
      }
   }

   /**
    * Verifica se já existe um pacote cadastrado com o mesmo nome.
    * 
    * @param nomePacote
    * @param codPacote
    * @throws BusinessException
    */
   private void validaNomePacote(String nomePacote, Long codPacote) throws BusinessException
   {
      Long qtdPacotesMesmoNomeCodigo = pacoteDAO.buscaQtdPacotesPorNomeCodigo(nomePacote, codPacote);
      if (qtdPacotesMesmoNomeCodigo > 0)
      {
         throw new BusinessException(ChaveMensagem.ERRO_NOME_PACOTE_EXISTENTE.getChave());
      }
   }

}
