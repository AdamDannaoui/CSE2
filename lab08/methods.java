//Adam Dannaoui lab 08 10/16/15 
//program will ask the user for 10 numbers
//program will then calculate the mean, median 
//and a void print method that prints the results 
import java.util.Scanner;
//importing the scanner class
//naming the class
public class methods{
//writing the method to calculate the mean
    public static double mean(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j){
        double avg = (a+b+c+d+e+f+g+h+i+j)/10;
        return avg;
    }
//writing the method to calculate the median 
    public static double median ( double e, double f ) {
    	double med = ((e+f)/2);
        return med; 
    }
//declaring the main method
public static void main (String[]args){
//initializing the scanner class
	Scanner myScanner = new Scanner (System.in);
//declaring the variables
    double a; 
	double b;
	double c;
	double d;
	double e;
	double f;
	double g;
	double h;
	double i;
	double j;
//prompting the user for input and then initializing the variables after
//done for variables a-j
System.out.print("enter a value for a");
	a=myScanner.nextDouble();
	System.out.print("enter a value for b");
	b=myScanner.nextDouble();
	System.out.print("enter a value for c");
	c=myScanner.nextDouble();
	System.out.print("enter a value for d");
	d=myScanner.nextDouble();
	System.out.print("enter a value for e");
	e=myScanner.nextDouble();
	System.out.print("enter a value for f");
	f=myScanner.nextDouble();
	System.out.print("enter a value for g");
	g=myScanner.nextDouble();
	System.out.print("enter a value for h");
	h=myScanner.nextDouble();
	System.out.print("enter a value for i");
	i=myScanner.nextDouble();
	System.out.print("enter a value for j");
	j=myScanner.nextDouble();
//printing the mean and median while using the methods that i created
	System.out.println("the mean is "+mean(a,b,c,d,e,f,g,h,i,j));
	System.out.println("the median is "+median(e,f));
}
	}
