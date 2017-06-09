
package br.com.dpjmanager.exception;

import lombok.Getter;

/**
 * Classe para tratamento de exceções referentes a regras de negócio.
 * 
 * @author Agosto/2016: Ivan Dias <DD>
 */
public class BusinessException extends Exception
{

   private static final long serialVersionUID = -2521195566138930601L;

   @Getter
   private String codigoErro;

   /**
    * Cria uma nova instância do tipo BusinessException.
    * <P>
    * 
    * @param codigoErro
    */
   public BusinessException(String codigoErro)
   {
      super(codigoErro);
      this.codigoErro = codigoErro;
   }

}
