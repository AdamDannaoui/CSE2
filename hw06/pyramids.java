//Adam Dannaoui 10/6/15
//Program will produce pyramids based on the size the user provides
import java.util.Scanner;
//importing the scanner class
public class pyramids {
public static void main(String[] args) {
//defining the class and the main method
Scanner myScanner = new Scanner (System.in);
//initializing the scanner class
		System.out.println("enter a size for the pyramid");
//asking for the user input
		int size;
//declaring the variable for the size of the pyramid
		size= myScanner.nextInt();
//accepting user input
//loop and print statement for the rows and columns which produces spaces
		for(int row=0;row<size;row++) {
		for(int column=0;column<=size-row;column++) {
		        System.out.print(" ");
//loop and print statement for the *s in the pyramid
		    }
		   for (int stars=0;stars<=row*2;stars++){
		 
			   System.out.print("*");
//print statement which prints to the next line		
		   }
		   System.out.println("");  
		}
			}
}