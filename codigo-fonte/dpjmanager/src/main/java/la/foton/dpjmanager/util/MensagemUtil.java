
package la.foton.dpjmanager.util;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import la.foton.dpjmanager.enums.TipoMensagem;

@Component
public class MensagemUtil
{

   @Autowired
   private MessageSource messageSource;

   public void adicionarMensagemErro(RedirectAttributes redirectAttributes, Locale locale, String chaveMensagem, Object... parametros)
   {
      adicionarMensagem(redirectAttributes, locale, chaveMensagem, TipoMensagem.MENSAGEM_ERRO, parametros);
   }

   public void adicionarMensagemAlerta(RedirectAttributes redirectAttributes, Locale locale, String chaveMensagem, Object... parametros)
   {
      adicionarMensagem(redirectAttributes, locale, chaveMensagem, TipoMensagem.MENSAGEM_ALERTA, parametros);
   }

   public void adicionarMensagemSucesso(RedirectAttributes redirectAttributes, Locale locale, String chaveMensagem, Object... parametros)
   {
      adicionarMensagem(redirectAttributes, locale, chaveMensagem, TipoMensagem.MENSAGEM_SUCESSO, parametros);
   }

   private void adicionarMensagem(RedirectAttributes redirectAttributes, Locale locale, String chaveMensagem, TipoMensagem tipoMensagem,
      Object... parametros)
   {
      redirectAttributes.addFlashAttribute(tipoMensagem.getNomeTipoMensagem(), messageSource.getMessage(chaveMensagem, parametros, locale));
   }
}
