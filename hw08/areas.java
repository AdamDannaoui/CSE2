//Adam Dannaoui hw08 10/26/15
//program will ask the user what shape they wanna calculate the area for
//(circle, rectangle and trapazoid) Program will then calculate and print 
//the area respectively to what shape they chose
//importing the scanner class
import java.util.Scanner;
public class areas {
//starting the class
public static double inputCheck(String shape){
Scanner myScanner = new Scanner(System.in);
// initializing the scanner class
double area = 0;
if(shape.equals("rectangle")){
System.out.print("Enter a value for the height: ");
// prompt the user for input 
double height;
// accept user input 
while (true) {
if (!myScanner.hasNextDouble()) {
System.out.print("Sorry, you did not enter a double number. Try again: ");
myScanner.next();
}
else {
height = myScanner.nextDouble();
if (height < 0) {
System.out.print("Please only enter numbers greater than 0. Try again: ");
}
else {
break;                    
}
}
}
//a while loop with nested if statements to prevent invalid inputs for height
System.out.print("Enter a value for the base: ");
// prompt the user to input
double base;
// accept user input
while (true) {
if (!myScanner.hasNextDouble()) {
System.out.print("Sorry, you did not enter a double value. Try again: ");
myScanner.next();
}
else {
base = myScanner.nextDouble();
if (base < 0) {
System.out.print("Please only enter numbers greater than 0. Try again: ");
}
else {
break;                    
}
}
}
// use a while loop with nested if statements to prevent invalid inputs for base
area = rectangleA(height, base);
}
else if(shape.equals("trapazoid")) {
System.out.print("Enter a value for the height: ");
// prompt the user for input
double height;
// accept user input
while (true) {
if (!myScanner.hasNextDouble()) {
System.out.print("Sorry, you did not enter a double value. Try again: ");
myScanner.next();
}
else {
height = myScanner.nextDouble();
if (height < 0) {
System.out.print(" Please only enter numbers greater than 0. Try again: ");
}
else {
break;                    
}
}
}
//a while loop with nested if statements to prevent invalid inputs for height
System.out.print("Enter a value for base1 ");
//prompt the user for input 
double base1;
// accept user input 
while (true) {
if (!myScanner.hasNextDouble()) {
System.out.print("Sorry, you did not enter a double value. Try again: ");
myScanner.next();
}
else {
base1 = myScanner.nextDouble();
if (base1 < 0) {
System.out.print(" Please only enter numbers greater than 0. Try again: ");
}
else {
break;                    
}
}
}
//a while loop with nested if statements to prevent invalid inputs for base1
System.out.print("Enter a value for the base2 ");
//prompt the user for input
double base2 = 0;
//accept user input 
while (true) {
if (!myScanner.hasNextDouble()) {
System.out.print("Sorry, you did not enter a double value. Try again: ");
myScanner.next();
}
else {
base2 = myScanner.nextDouble();
if (base2 < 0) {
System.out.print(" Please only enter numbers greater than 0. Try again: ");
}
else {
break;   
}
}
}
// use a while loop with nested if statements to prevent invalid inputs for base2
area = trapazoidA (height, base1, base2);
}
else if(shape.equals("circle")) {
System.out.print("Enter a value for the radius: ");
// prompt the user for input
double radius;
// accept user input
while (true) {
if (!myScanner.hasNextDouble()) {
System.out.print("Sorry, you did not enter a double number. Try again: ");
myScanner.next();
}
else {
radius = myScanner.nextDouble();
if (radius < 0) {
System.out.print(" Please only enter numbers greater than 0. Try again: ");
}
else {
break;                    
}
}
}
area = circleA(radius);
}
return area;
}
//create input check method that will calculate area and check inputs 
public static double rectangleA(double a, double b) {
return a*b;
}
public static double circleA(double c) {
return (3.14*(c*c));
}
public static double trapazoidA(double e, double f, double g) {
return (0.5*((f+g)*e));
}
public static void main(String[] args) {
Scanner myScanner = new Scanner(System.in);
// intializing the scanner class
System.out.print("What shape do you want to calculate? ");
// prompt the user for a shape
String shape;
// accept user input
while (true) {
if (!myScanner.hasNextLine()) {
System.out.print("Sorry, you did not enter a String variable. Try again: ");
myScanner.next();
}
else {
shape = myScanner.nextLine();
if (!shape.equals("rectangle") && !shape.equals("circle") && !shape.equals("trapazoid")) {
System.out.print(" You must choose among a rectangle, a circle, and a trapazoid. Try again: ");
}
else {
break;                    
}
}
}
// use a while loop with nested if statements to prevent invalid inputs
if (shape.equals("rectangle")) {
double area = inputCheck(shape);
System.out.println("The area of the rectangle is "+area+".");
}
//print out area of rectangle if shape is a rectangle
else if (shape.equals("circle")) {
double area = inputCheck(shape);
System.out.println("The area of the circle is "+area+".");
}
//print out the area of a circle if shape is a circle
else if (shape.equals("trapazoid")) {
double area = inputCheck(shape);
System.out.println("The area of the trapazoid is "+area+".");
}
//print out the area of a trapazoid if shape is a trapazoid
} //end of main method
} //end of public class Area

