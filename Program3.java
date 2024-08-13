//Program 3

//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input
public class Program3{
    public static void main(String[] args){
     Scanner numScanner = new Scanner(System.in);
     //Declare variables
       System.out.println("Enter the length: ");
       int length = numScanner.nextInt();
       System.out.println("Enter the width: ");
       int width = numScanner.nextInt();
        int area = length * width;
        int perimeter = (2*length) + (2*width);
         System.out.println("The length is: " + length);
        System.out.println("The width is: " + width);
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);
        
    }
}




//Paste console output below:
/*
Enter the length: 
7
Enter the width: 
8
The length is: 7
The width is: 8
The area is: 56
The perimeter is: 30


*/
