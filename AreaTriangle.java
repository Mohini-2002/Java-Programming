import java.util.*;
import java.lang.*;
public class AreaTriangle {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    //formula for triangle 1/2(length*height)
    System.out.println("Enter the base of the triangle");
    double base=sc.nextDouble();
    System.out.println("Enter the height of the triangle:");
    Double height=sc.nextDouble();
    Double Area=(base*height)/2;
    System.out.println("The Area of the Triangle is :"+Area);
   } 
}
