import java.util.*;

public class SubTwo {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number:");
    int n1=sc.nextInt();
    System.out.println("Enter the second number:");
    int n2=sc.nextInt();
    int sub=n1-n2;
    System.out.println("The result of subtraction is:"+sub);
    sc.close();
   } 
}
