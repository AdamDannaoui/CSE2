//Adam Dannaoui 9/17/15 lab 04 
//Will be creating a calculator program that can compute the following
//a+b a*b a-b and a/b (a and b both being integers provided by the user)
//Your calculator should ask user for input until they reply “n” or “N”
//to the question “Type n or N to stop”.
import java.util.Scanner;
//importing the scanner
public class CalculatorSpecial{
//naming the class
    public static void main(String[] args){
//main method
Scanner myScanner = new Scanner (System.in);
//declaring the scanner object
System.out.print("enter a character for x: ");
//asking user for input
char x = myScanner.next().charAt(0);
//accepting user input
//while statement that keeps the loop going if character plugged 
//in does not equal n or N
while ( x != 'n' && x != 'N' ) {
    String operator;
//declaring operator variable
System.out.print("enter a value for a: ");
//asking user for input of a
double a = myScanner.nextDouble();
//accepting user input
System.out.print("enter an operator: ");
//asking user for operator
operator = myScanner.next();
//accepting user input
System.out.print("enter a value for b: ");
//asking user for value of b
double b = myScanner.nextDouble();
//accepting user input
//switch statement that computes the variales a and b with the following
//operators (+,-,/,*) if invalid operator is given illegal operator will
//be printed
        switch (operator){
    case "+":
        System.out.println(a+b);
        break;
    case "-":
        System.out.println(a-b);
        break;
    case "*":
        System.out.println(a*b);
        break;
    case "/":
        System.out.println(a/b);
        break;
    default:
        System.out.println("illegal operator");
        break;
        }
//asking user for second character prompting whether or not the loop will break
//if the character is n or N
        System.out.print("enter a character for y: ");
        char y = myScanner.next().charAt(0);
        if (y == 'n' || y == 'N') {
            break;
        }
        }
    }
}
        
    