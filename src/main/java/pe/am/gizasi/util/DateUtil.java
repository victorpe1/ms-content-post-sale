package pe.am.gizasi.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtil {
  public static LocalDateTime parseStringToDateTime(String dateStr) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    return LocalDateTime.parse(dateStr, formatter);
  }

  public static Date parseStringToDate(String dateStr) {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    try {
      return formatter.parse(dateStr);
    } catch (ParseException e) {
      e.printStackTrace();
      return null; // Manejar la excepción según sea necesario
    }
  }
}
