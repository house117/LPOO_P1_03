
package convertdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ConvertDate {
    public static Boolean inputDayInvalid = false;
  public static Boolean inputMonthInvalid = false;
  public static Boolean leapYear = false;
  public static int mes = 1;
  public static int dia = 1;
  public static int anio = 1;
  public static int[] diasmes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  
 
  public static void main(String[] args)
  {
   
    String userDate;
    String[] monthNames = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
      "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    Scanner in = new Scanner(System.in);
    
    System.out.println("ingrese la fecha:  >>");
    userDate = in.nextLine();
    checkInput(userDate);
    while (inputDayInvalid || inputMonthInvalid)
    { 
      if (inputDayInvalid && !inputMonthInvalid)
        System.out.println("Error: dia invalido");
      else if (inputMonthInvalid && !inputDayInvalid)
        System.out.println("Error: mes invalido");
      else
        System.out.println("Error: dia y mes invalidos"); 
      System.out.println("ingrese la fecha:  >>");
      userDate = in.nextLine();
      checkInput(userDate);
    }
    
    Calendar userCalendar = new GregorianCalendar(anio, (mes - 1), dia);
    int ordinalDay = userCalendar.get(Calendar.DAY_OF_YEAR);
    System.out.println("ingreso: " + monthNames[mes - 1] + " " + dia 
      + ", " + anio + "\nes el dia " + ordinalDay + "del año");
    
  }
  // Method converts input to integers and checks if input is valid
  public static void checkInput(String date)
  {
    int count = 0;
    int j = 0;
    for (int i = 0; i < date.length(); i++)
    {
      if (date.charAt(i) == '/' && count == 0)
      {
        mes = Integer.parseInt(date.substring(0, i));
        j = (i += 1);
        count++;
      }
      if (date.charAt(i) == '/' && count == 1)
      {
        dia = Integer.parseInt(date.substring(j, i));
        anio = Integer.parseInt(date.substring(i + 1));
      }
    }
    // Check if month entry is valid
    if (mes < 1 || mes > 12)
      inputMonthInvalid = true;
    else 
      inputMonthInvalid = false;
    // Check if leap year
    if (anio % 400 == 0)
      leapYear = true;
    else if (anio % 4 == 0 && anio % 100 != 0)
      leapYear = true;
    else 
      leapYear = false;
    // Check if days entry is valid
    if (leapYear && mes == 2)
    { 
      if (dia < 1 || dia > 29)
        inputDayInvalid = true;
      else
        inputDayInvalid = false;
    }    
    else if (dia < 1 || dia > diasmes[mes - 1])
      inputDayInvalid = true;
    else 
      inputDayInvalid = false;
  }   
    
}
