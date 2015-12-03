//Adam Dannaoui lab 08 10/16/15 
//program will ask the user for 10 numbers
//program will then calculate the mean, median 
//and a void print method that prints the results
import java.util.Scanner;
//importing the scanner class
//naming the class
public class Methods{
        //method for solving mean
        public static double mean(double x){
                double tot = x/10;
                return tot;
        }
        //method for solving median
        public static double median(double x, double y){
                double med = (x+y)/2;
                return med;
        }
        //method for printing the values
        public static void print(double x, double y){
                //printing the values
                System.out.println("The mean of the set is " + x + ", and the median is " + y + ".");
        }
        public static void main(String[] args){
                Scanner scan = new Scanner(System.in);
                 //initializing the scanner class
                //asking the user for input
                System.out.println("Enter 10 numbers in ascending order.");
                //declaring and intializing the variables
                double first = scan.nextDouble();
                double second = scan.nextDouble();
                double third = scan.nextDouble();
                double fourth = scan.nextDouble();
                double fifth = scan.nextDouble();
                double sixth = scan.nextDouble();
                double seventh = scan.nextDouble();
                double eighth = scan.nextDouble();
                double ninth = scan.nextDouble();
                double tenth = scan.nextDouble();
                //how to calculate the total
                double total = (first+second+third+fourth+fifth+sixth+seventh+eighth+ninth+tenth);
                //how to calculate the mean and median
                double meanRes = mean(total);
                double mediRes = median(fifth, sixth);
                print(meanRes, mediRes);
    }
}