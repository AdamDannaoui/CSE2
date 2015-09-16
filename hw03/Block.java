//Adam Dannaoui 09/15/15 hw03 
//Calculate volume and surface area with the input 
//of length height and width
import java.util.Scanner;
//identifying the class and main method
public class Block{
    public static void main(String[]args){
    Scanner myScanner=new Scanner(System.in);
    //scanner class for user input
    System.out.print("Enter block width");
    //printing statement for user to provide block width
    double blockWidth=myScanner.nextDouble();
    //accepting user input
    System.out.print("Enter block height");
    //Printing statement for user to provide block height
    double blockHeight=myScanner.nextDouble();
    //accepting user input
    System.out.print("enter block length");
    //printing the statement for user to provide block length
    double blockLength=myScanner.nextDouble();
    //accepting user input
    double surfaceArea=((blockLength*blockHeight)*6);
    //declaring variable for surface area and providing formula
    double blockVolume=(blockLength*blockWidth*blockHeight);
    //declaring variable for block volume and providing formula
   System.out.println("The surface area of the block of dimensions "+blockLength+" x "// print out the calculated value of the surface area of the block in a sentence
   System.out.println("The volume of the block of dimensions "+blockLength+" x "+blockWidth+" x "+blockHeight+" is "+blockVolume+".");
   //printing the final two statements which provide the volume and surface area of the block

    }
}
