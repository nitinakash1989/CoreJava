//import InputReader;

public class Swapper{
  public static void main(String[] args){
    /*
      Author: Nitin Akash
      This class is used to swap two numbers.
    */
    int num1 = 55;
    int num2 = 90;
    System.out.println("Please enter first number");
    num1 = InputReader.readInt();

    System.out.println("Please enter second number");
    num2 = InputReader.readInt();

    System.out.println("Before Swaping");
    System.out.println("num1:"+ num1 + "\tnum2:" + num2);
    System.out.println("==============================");
    num1 = num1+num2;
    num2 = num1-num2;
    num1 = num1-num2;
    System.out.println("After Swaping");
    System.out.println("num1:"+ num1 + "\tnum2:" + num2);
    System.out.println("==============================");
  }
}
