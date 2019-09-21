import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Author: Nitin Akash
Reader class to convert user input to int, double etc.
*/

public class InputReader{

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static String s;
  public static int readInt(){
    /*
      Function to read integer
    */
    try{
      s = br.readLine();
    }
    catch(Exception e){
      e.printStackTrace();
    }

    return Integer.parseInt(s);
  }

  public static float readFloat(){
    /*
      Function to read Float
    */
    try{
      s = br.readLine();
    }
    catch(Exception e){
      e.printStackTrace();
    }
    return Float.parseFloat(s);
  }

  public static double readDouble(){
    /*
      Function to read Double
    */
    try{
      s = br.readLine();
    }
    catch(Exception e){
      e.printStackTrace();
    }
    return Double.parseDouble(s);
  }

  public static String readString(){
    /*
      Function to read String
    */
    try{
      s = br.readLine();
    }
    catch(Exception e){
      e.printStackTrace();
    }
    return s;
  }
}
