//Return the remainder from the two numbers
//Two numbers are passed as parameters first parameter is divided by the second parameter will have a remainder, possibly zero return that value. Examples remaindr (1,5)=> remainder 1 , (2,4)=> remainder 2
import java.util.*;
public class ReturnRemainder {
    public static int Remainder(int n1,int n2){
        return (n1%n2);
    }
   public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the first number:");
   int n1=sc.nextInt();
   System.out.println("Enter the second number:");
   int n2=sc.nextInt();
   System.out.println("The remainder of two numbers is:"+Remainder(n1,n2));
   } 
}
