import java.lang.Math.*;

/*
  Calculate area of a circle.
*/
class CircleArea{
  public static void main(String[] args){
    double area;
    double r = Double.parseDouble(args[0]);
    area = Math.PI * r * r;
    System.out.print("Radius:"+ r + "\tArea of cirle:"+area);
  }
}
