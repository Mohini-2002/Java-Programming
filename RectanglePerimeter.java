//Find the perimeter of a rectangle of a perimeter
//Create a function that takes lenght and width and return the perimeter of a rectangle . Example Perimeter(3,4)=>14, Perimeter(5,7)=>24
import java.util.*;
public class RectanglePerimeter {
    public static int Perimeter(int l, int w){
        return 2*(l+w);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length=sc.nextInt();
        System.out.println("Enter the width of the rectangle:");
        int width=sc.nextInt();
        System.out.println("The perimeter of the Rectangle is:"+Perimeter(length,width));

    }
}
