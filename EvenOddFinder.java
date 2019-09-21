public class EvenOddFinder{

  /*
  Write a program to accept a number and display whether a number is odd
  or even using the ternary operator.
  */
  public static boolean isEven(int number){
     return number%2==0?true:false;
  }
  public static void main(String args[]){

    System.out.println(">>>>>Please enter integer number<<<<<");
    int number = InputReader.readInt();

    System.out.println("=======================================");
    if(isEven(number)){
      System.out.println("Input value :" + number + " is even");
    }
    else{
      System.out.println("Input value :" + number + " is odd");
    }
  }
}
