
package testcertificateofdepositarray;

import java.util.GregorianCalendar;
import java.util.Scanner;
public class TestCertificateOfDepositArray {
    
    public static void main(String[] args) 
    {
    CertificateOfDeposit[] certArray = new CertificateOfDeposit[1];
  
    int certNum1, certNum2, year1, year2, month1, month2, day1, day2;
    double bal1, bal2;
    String name1, name2;
    Scanner key = new Scanner(System.in);
   
    for (int i = 0; i < certArray.length; i++)
    { 
      System.out.println( (i + 1) + " numero de certificado: ");
      certNum1 = key.nextInt();
      key.nextLine();
      System.out.println((i + 1) + " apellido");
      name1 = key.nextLine();
      System.out.println((i + 1) + " balalce: ");
      bal1 = key.nextDouble();
      System.out.println((i + 1) + " año: ");
      year1 = key.nextInt();
      System.out.println((i + 1) + " mes: ");
      month1 = key.nextInt();
      System.out.println((i + 1) + " dia: ");
      day1 = key.nextInt();
   
      certArray[i] = new CertificateOfDeposit(certNum1, name1, bal1, year1, month1, day1);
    }
    for (int j = 0; j < certArray.length; j++)
    {
      System.out.println("informacion del certificado: " + (j + 1) + "\n\tNumero:  "
      + certArray[j].getCertificateNumber() + "\n\t apellido del titular: " + 
      certArray[j].getHoldersLastName() + "\n\tBalance: " + certArray[j].getBalance() 
      + "\n\tfecha de ingreso: " + certArray[j].getIssueDate() + "\n\tfecha de vencimiento: " + 
      certArray[j].getMaturityDate());
    }  
  }
  }
