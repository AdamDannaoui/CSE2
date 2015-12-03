//Adam Dannaoui lab 10
//program asks the user for the number of values that are 
//to be stored in an array of integers
//importing the scanner class 
import java.util.Scanner
//class and main method
public class arrayAverage{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //asking for user input
        System.out.println("What size would you like the array to be?");
        //creating the array
        int arraySize = scan.nextInt();
        int[] anArray;
        anArray = new int[arraySize];
        //for loop to initialize the array with n random numbers 
        for(int i = 0; i<arraySize; i++){
            //generating random numbers 
            anArray[i] = (int)(Math.random()*100);
            //printing the value
            System.out.println("Array at "+i+" = " + anArray[i]);
        }
        //declaring the variables
        int sum = 0;
        //for loop to iterate through the array to print all the values
        for(int k = 0; k<arraySize; k++){
            sum = sum + anArray[k];
        }
        //printing the values
        System.out.println("Sum =" + sum);
        int avg = sum/arraySize;
        System.out.println("The average is " + (avg));
        System.out.print("The numbers equal or greater than the average are");
        //loop to find the sum of the values in the array 
        for(int j = 0; j < arraySize; j++){
            if(anArray[j] >= avg){
            //printing the average
                System.out.print(" "+anArray[j]+" ");
            }
        }
    }

}