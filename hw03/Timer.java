//Adam Dannaoui hw03 9/15/15
//Program will prompt user for the time, dinner time
//and time left until they eat
//Time will be recorded in military time
import java.util.Scanner;
//Identifying class and main method
public class Timer{
    public static void main(String[]args){
        Scanner myScanner = new Scanner (System.in);
        //scanner class for user input
        System.out.print("Enter requested dinner time in military time");
        //Printing the statement for the user to provide the dinner time
        int dinnerTime=myScanner.nextInt();
        //Accepting user input
        System.out.print("Enter current time in military time");
        //Printinf the statement for the user to provide the current time
        int currentTime=myScanner.nextInt();
        //accepting user input
        int waitTimeHours=((dinnerTime-currentTime)/100);
        //declare variable and 
        //formula for calculating the wait time in hours
        int waitTimeMinutes=((dinnerTime-currentTime) %60);
        //declaring variable and 
        //formula for calculating the wait time in minutes
        System.out.println("There is"+ waitTimeHours+"hours and"+waitTimeMinutes+"minutes until dinner begins");
        //Printing the statement that gives the user the 
        //time until dinner
    }
}

