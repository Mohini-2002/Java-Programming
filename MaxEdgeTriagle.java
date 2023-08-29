//Write a program that will find out the maximum range of triangle edge

import java.util.*;

import javafx.scene.effect.Light.Spot;

import java.lang.*;
public class MaxEdgeTriagle {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first edge of the triangle:");
    int E1=sc.nextInt();
    System.out.println("Enter the second edge of the triangle: ");
    int E2=sc.nextInt();
    System.out.println("Enter the third edge of the triangle: ");
    int E3=sc.nextInt();
    if(E1>E2){
        if(E1>E3){
            System.out.println("The maximum range of the triangle is :"+ E1);
        }
    }
    else if(E2>E3){
        System.out.println("The maximum range of the triangle is :"+E2);
    }
    else{
        System.out.println("The maximum range of the triangle is :"+E3);
    }
  }  
}
