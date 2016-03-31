
package la.foton.dpjmanager.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil
{

   public static Date converteStringParaDate(String formato, String valor) throws ParseException
   {
      SimpleDateFormat formatter = new SimpleDateFormat(formato);
      Date date = formatter.parse(valor);
      return date;
   }
}
