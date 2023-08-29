import java.util.*;
public class MinuteSecond {
    public static void main(String args[]){
   //Convert minute into second
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value of minute");
   int minute=sc.nextInt();
   int InSecond= minute*60;
   System.out.println("The value in InSecond");
   System.out.println(InSecond);
}
}
