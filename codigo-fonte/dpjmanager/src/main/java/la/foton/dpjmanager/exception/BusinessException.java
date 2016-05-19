
package la.foton.dpjmanager.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class BusinessException extends Exception
{

   private static final long serialVersionUID = -2521195566138930601L;

   @Getter
   private String codigoErro;
}
