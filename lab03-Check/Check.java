// Adam Dannaoui 9/11/15
// Will write a program that will obtain original cost, 
// the percentage tip, and the number of ways the check will be split
import java.util.Scanner; 
  public class Check { 
//main method required for every java program 
   public static void main(String[] args){
//importing the scanner class
       Scanner myScanner= new Scanner (System.in); 
//declaring the scanner object     
       System.out.print ("Enter the original cost of the check in the form xx.xx: ");
//entering the statement that provides the original cost of the check
       double checkCost= myScanner.nextDouble();
//accepting the user input for check cost
       System.out.print ("Enter the percentage tip that you wish to pay as a whole number (in the form xx):");
//providing the statment that provides the percentage tip 
       double tipPercent=myScanner.nextDouble();
//accepting the user input for tip percentage
       tipPercent /= 100; 
//convert percentage into a decimal value
       System.out.print ("people") ;
//printing the statement for the amount of people in the party
       int numPeople = myScanner.nextInt ();
//accepting user input for the amount of people in the party
       double totalCost;
//declaring variable
       double costPerPerson;
//declaring the variable      
       int dollars, ;
//whole dollar amount of cost
       dimes, pennies; 
//for storing digits to the right of the decimal point
       totalCost= (checkCost*(1+tipPercent));
//calculating total cost
       costPerPerson = (totalCost/ numPeople) ;
//calculating the cost per person
//getting a whole number to drop the decimal fraction, 
       dollars=(int)(costPerPerson) ;
//get the dimes amount
       dimes=(int)(costPerPerson * 10) %10;
//Calculations for how 
       pennies=(int)(costPerPerson* 100) %10;
       System.out.println("each person in the group owes"+dollars+'.'+ dimes + pennies);
//Printing the statement which provides how much each person should pay
    }
  
  }