import java.util.*;
import java.lang.*;
public class AreaTriangleFunction {
  static double Area(double base,double height){
   return (base*height)/2;
  } 
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the base of the triangle");
    double b=sc.nextInt();
    System.out.println("Enter the height of the triangle");
    double h=sc.nextInt();
    System.out.println("The Area of the triangle is:"+Area(b,h));
  } 
}
