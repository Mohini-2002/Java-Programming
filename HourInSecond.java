//Write a program that convert hour into seconds

import java.util.*;
import java.lang.*;
public class HourInSecond {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the time in hour:");
    int hour=sc.nextInt();
    int InSecond = hour*60*60;
    System.out.println("The time in second is :"+InSecond);
  }  
}
