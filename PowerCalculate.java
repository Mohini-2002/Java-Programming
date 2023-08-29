//Calculate the power of the bettery you have given voltage and current by the user

import java.util.*;
import java.lang.*;
public class PowerCalculate {
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the voltage :");
 int voltage=sc.nextInt();
 System.out.println("Enter the current:");
 int i=sc.nextInt();
 int p=voltage*i;
 System.out.println("The power of the bettery is : "+p);
 }   
}
