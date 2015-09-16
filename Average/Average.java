// program to ask user to provide 3 numbers and then compute the average

import java.util.Scanner;

public class Average {

public static void main(String[] args) {

Scanner myScanner = new Scanner( System.in );

double numOne = myScanner.nextDouble();

System.out.print("Enter the value of number one");

double numTwo = myScanner.nextDouble();

System.out.print("Enter the value of number two");

double numThree = myScanner.nextDouble();

System.out.print("Enter the value of number three");

double averageNumber = (numOne + numTwo + numThree);

System.out.println("The Average is "+averageNumber+".");