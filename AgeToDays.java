import java.util.*;
import java.lang.*;
public class AgeToDays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age in years ");
        int age=sc.nextInt();
        int AgeInDays= age*365;
        System.out.println("The age in days is: "+AgeInDays);
    }
}
