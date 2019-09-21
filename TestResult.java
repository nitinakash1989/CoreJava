/** This program is to demonstrate the use of conditional statement
@author Nitin Akash

Display a student’s result by:
developing a class ‘TestResult’ with the following method
  public String getResult( int marks, int marks2, int marks3).
    Write the logic of returning the result as
    ‘First Class’,
    ‘Second Class’,
    ‘Pass Class’, or
    ‘Fails’ based on the average marks secured.
*/
public class TestResult
{
  public static int average = 0;
  public static int marks1 = 0;
  public static int marks2 = 0;
  public static int marks3 = 0;

  public static String getResult( int marks1, int marks2, int marks3)
  {
    average = Math.round((marks1 + marks2 + marks3)/3);

    if(average>60)
    {
      return "First Class";
    }
    else if(average>=50)
    {
      return "Second Class";
    }
    else if(average>=40)
    {
      return "Pass Class";
    }
    else
    {
      return "Fail";
    }

  }
  public static void main(String[] args)
  {
    System.out.println(">>>>>Please Enter marks of subject-1<<<<<");
    marks1 = InputReader.readInt();

    System.out.println(">>>>>Please Enter marks of subject-2<<<<<");
    marks2 = InputReader.readInt();

    System.out.println(">>>>>Please Enter marks of subject-3<<<<<");
    marks3 = InputReader.readInt();
    System.out.println("============================");
    System.out.println("Student Result:" + getResult(marks1, marks2, marks3));
  }
}
