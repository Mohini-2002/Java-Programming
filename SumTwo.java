import java.util.*;
public class SumTwo {
  public static void main(String agrs[]){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the first number:");
    int n1=sc.nextInt();
    System.out.println("Enter the second number:");
    int n2=sc.nextInt();
    int sum=n1+n2;
    System.out.println("The output of two numbers is :"+sum);
    sc.close();
  }  
}
