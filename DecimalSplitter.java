/*
  Author: Nitin Akash
  Class: DecimalSplitter
  Write a program to extract the whole and decimal parts of a fractional
  number by developing a ‘DecimalSplitter’ class with methods:
*/
import java.math.BigDecimal;
public class DecimalSplitter{

  public static int getWhole(double d){
    /*
      Function to get whole number from decimal.
    */
    BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
    return bigDecimal.intValue();
  }
  public static BigDecimal getFraction(double d){
    /*
      Function to get fractional part from decimal.
    */
    BigDecimal bigDecimal = new BigDecimal(String.valueOf(d));
    int intValue = bigDecimal.intValue();
    return bigDecimal.subtract(new BigDecimal(intValue));
  }

  public static void main(String args[]){
    System.out.println(">>>>>>"+"Please enter the number"+"<<<<<<");

    double input = InputReader.readDouble();
    System.out.println("======================");
    System.out.println("Whole Number: "+ getWhole(input) + "\tFractional Part: " + getFraction(input));
  }
}
