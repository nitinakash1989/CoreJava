public class EvenOddFinder{

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
