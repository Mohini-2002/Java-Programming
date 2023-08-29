//Write a function which return the hour in second 
import java.util.*;
public class HourInSecondFunction {
public static int TimeConvert(int Hour){
    return Hour*60*60;
}

    public static void main(String agrs[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the time in hour:");
    int hour=sc.nextInt();
    System.out.println("The time in second is : "+TimeConvert(hour));
  }  
}
