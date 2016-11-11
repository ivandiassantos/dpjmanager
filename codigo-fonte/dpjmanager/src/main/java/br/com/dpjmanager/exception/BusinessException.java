
package br.com.dpjmanager.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Classe para tratamento de exceções referentes a regras de negócio.
 * 
 * @author Agosto/2016: Ivan Dias <DD>
 */
@AllArgsConstructor
@NoArgsConstructor
public class BusinessException extends Exception
{

   private static final long serialVersionUID = -2521195566138930601L;

   @Getter
   private String codigoErro;
}
