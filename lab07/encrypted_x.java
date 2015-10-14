//Adam Dannaoui lab 07 10/13/15
//program will print the output of a "secret" X
import java.util.Scanner;
//Importing the scanner class
public class encrypted_x{
    public static void main (String[] args){
        //main method and naming the class
        Scanner myScanner = new Scanner(System.in);
        //initializing the scanner class
        //prompting user for input 
        System.out.print("Enter a size for the X" );
        int size;
        size = myScanner.nextInt();
        //Asking for the input
        //declaring and initializing the user input
        if(size>100 || size<1){
            System.out.println("size invalid");
            System.exit(-1);
            //loop thatll provide whether or 
            //not an invalid size was given
        }
        //loop to print spaces for the X
        for (int k=0; k<size; k++){
            for(int i=0; i<size; i++){
                if ((size-k) == i + 1){
                    System.out.print(" ");
                }
                else if (k==i){
                    System.out.print(" ");
                }
                //loop for printing the stars around the spaces.
                else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        
    }
}