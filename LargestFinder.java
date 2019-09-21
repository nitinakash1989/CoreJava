public class LargestFinder{
/*
  Author: Nitin Akash
  Find the largest of three numbers using ternary operator:
*/
  public static int getLargest(int num1, int num2, int num3){
     return (num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
  }
  public static void main(String args[]){
    int largestNumber;
    System.out.println(">>>>>Please enter three numbers<<<<<");
    int num1 = InputReader.readInt();
    int num2 = InputReader.readInt();
    int num3 = InputReader.readInt();


    System.out.println("=======================================");
    largestNumber = getLargest(num1, num2, num3);
    System.out.println("Largest Number is: " + largestNumber);
  }
}
