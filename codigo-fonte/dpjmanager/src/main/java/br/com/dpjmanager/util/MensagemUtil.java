
package br.com.dpjmanager.util;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import br.com.dpjmanager.enums.TipoMensagem;

/**
 * Classe utilitária para obtenção de mensagens.
 * 
 * @author Agosto/2016: Ivan Dias <DD>
 */
@Component
public class MensagemUtil
{

   @Autowired
   private MessageSource messageSource;

   /**
    * Adiciona uma mensagem de erro.
    * 
    * @param redirectAttributes
    * @param locale
    * @param chaveMensagem
    * @param parametros
    */
   public void adicionarMensagemErro(RedirectAttributes redirectAttributes, Locale locale, String chaveMensagem, Object... parametros)
   {
      adicionarMensagem(redirectAttributes, locale, chaveMensagem, TipoMensagem.MENSAGEM_ERRO, parametros);
   }

   /**
    * Adiciona uma mensagem de alerta.
    * 
    * @param redirectAttributes
    * @param locale
    * @param chaveMensagem
    * @param parametros
    */
   public void adicionarMensagemAlerta(RedirectAttributes redirectAttributes, Locale locale, String chaveMensagem, Object... parametros)
   {
      adicionarMensagem(redirectAttributes, locale, chaveMensagem, TipoMensagem.MENSAGEM_ALERTA, parametros);
   }

   /**
    * Adiciona uma mensagem de sucesso.
    * 
    * @param redirectAttributes
    * @param locale
    * @param chaveMensagem
    * @param parametros
    */
   public void adicionarMensagemSucesso(RedirectAttributes redirectAttributes, Locale locale, String chaveMensagem, Object... parametros)
   {
      adicionarMensagem(redirectAttributes, locale, chaveMensagem, TipoMensagem.MENSAGEM_SUCESSO, parametros);
   }

   /**
    * Adiciona uma mensagem ao contexto da aplicação.
    * 
    * @param redirectAttributes
    * @param locale
    * @param chaveMensagem
    * @param tipoMensagem
    * @param parametros
    */
   private void adicionarMensagem(RedirectAttributes redirectAttributes, Locale locale, String chaveMensagem, TipoMensagem tipoMensagem,
      Object... parametros)
   {
      redirectAttributes.addFlashAttribute(tipoMensagem.getNomeTipoMensagem(), messageSource.getMessage(chaveMensagem, parametros, locale));
   }
}
