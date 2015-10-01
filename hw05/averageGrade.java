//Adam Dannaoui hw05 9/29/15
//Program will calculate the average grades of the input given 
//by the user, if grade is lower than 0 or higher than 100 
//invalid grade will be responded. Once the user inputs 999 
//the loop will end and the average of the grades will be given
import java.util.Scanner;
//importing the scanner class
public class averageGrade{
    public static void main(String[]args){
        Scanner myScanner = new Scanner (System.in);
        int grade = 1;
        int number = 0;
        double gradeTotal = 0; 
        double gradeAverage = 0;
        int gradeCounter = 0;
while ( number == 0 ) {
    if ( grade > 0 && grade < 100 ) {
        System.out.print("enter a value for grade: ");
        grade = myScanner.nextInt();
        gradeTotal = gradeTotal + grade;
        gradeCounter = (gradeCounter + 1);
        System.out.print("enter 999 to print the grade average or enter 1-99 to enter the next grade ");
        grade = myScanner.nextInt();
    }
    else if ( grade < 0 || grade > 100 && grade != 999) {
        System.out.println("An invalid grade has been entered.");
        number++;
        }
    else if ( grade == 999) {
        gradeAverage = (gradeTotal / gradeCounter);
        System.out.println("The average grade is "+ gradeAverage +".");
        number++;
     }
    }
   }
}
