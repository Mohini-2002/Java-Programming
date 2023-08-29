//Return the first element in an array
//Creat a function that takes an array containings only numbers and return the first element 
import java.util.*;
import java.lang.*;
public class ReturnEleArray {
  public static int ReturnElement(int arr[]){
   return arr[0];
  } 
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of the array");
  int n=sc.nextInt();
  int array[]=new int[n];
  System.out.println("Enter the elements of the array");
  for(int i=0;i<n;i++){
    array[i]=sc.nextInt();
  }
  System.out.println("The first element of the array is : "+ReturnElement(array[n]));
  } 
}
