//Adam Dannaoui lab06 10/1/15
//program will ask user for the number of employee time sheets that will be read
//based off of the hourly pay in cents and the amount of hours worked in a week
//(monday-friday) for each worker the program will add the income of each 
//employee and print the total income 
import java.util.Scanner;
//importing the scanner class
public class timeSheets {
    public static void main(String[]args){
//naming the class and main method
        Scanner myScanner = new Scanner (System.in);
//initializing the scanner class
//declaring the variables
        int numberEmp;
        double pay=0;
        double hours=0;
        int hoursMon=0;
        int hoursTues=0;
        int hoursWed=0;
        int hoursThurs=0;
        int hoursFri=0;
//asking for user input
        System.out.println("Enter a non negative number for the # of employee timesheets to be read");
//accepting user input
        numberEmp=myScanner.nextInt();
//loop that will ask for the hourly pay 
        for (int k = 0;k<numberEmp;k++){
//asking for user input
        System.out.println("enter the hourly pay in cents for one employee");
//accepting user input
        pay=myScanner.nextDouble();
        }
//loop that will ask for the amount of hours worked on each day of the week
        for (int i=0;i<numberEmp;i++){
        System.out.println("Enter the amount of hours worked for monday");
        hoursMon=myScanner.nextInt();
        System.out.println("Enter the amount of hours worked for tuesday");
        hoursTues=myScanner.nextInt();
        System.out.println("Enter the amount of hours worked for wednesday");
        hoursWed=myScanner.nextInt();
        System.out.println("Enter the amount of hours worked for thursday");
        hoursThurs=myScanner.nextInt();
        System.out.println("Enter the amount of hours worked for friday");
        hoursFri=myScanner.nextInt();
        }
//Declaring new variables for total pay and total hours 
       double totalPay=0;
       double totalHours=0;
//loop that will compute the total pay and total hours
       for(int j=0;j<numberEmp;j++){
//calculations for total hours and total pay 
    	   totalHours=(hoursMon+hoursTues+hoursWed+hoursThurs+hoursFri);
    	   totalPay=(totalHours*pay);
       }
//printing the total pay in cents 
    	   System.out.println("the total pay is " + totalPay + " cents");
       }

    }

