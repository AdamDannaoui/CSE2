//Adam Dannaoui 9/17/15 lab 04 
//Will be creating a calculator program that can compute the following
//a+b a*b a-b and a/b (a and b both being integers provided by the user)
import java.util.Scanner;
//importing the scanner
public class Calculator{
//naming the class
    public static void main(String[] args){
//main method
Scanner myScanner = new Scanner (System.in);
//declaring the scanner object
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
}
}
        
    
    
