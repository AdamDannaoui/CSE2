//Adam Dannaoui lab 09
//Write a method that uses random numbers to simulate a flip coin
import java.util.Scanner;
import java.util.Random; 
//importing the scanner and random classes
//naming the class and method that establishes the coin flip
public class flip{
    public static int flip(int a){
    Random rand = new Random();
    int tailSum = 0;
    int headSum = 0;
        for(int i=1; i<=a; i++){
            int random = rand.nextInt(2);
                if(random == 0){
                    tailSum++;
                }else if(random == 1){
                    headSum++;
                }
        }
        //printing the output of the coin flip
        System.out.println("Tails =  " + tailSum + ".");
        System.out.println("Heads = " + headSum + ".");
        return 1;
    }
    //method that callls the first method to simulate n flips of a coin
    public static void flip2(){
    Random rand = new Random();
        int random = rand.nextInt(2);
            if(random == 0){
                //printing the total number of heads and tails
                System.out.println("Tail " + random + ".");
            }else if(random == 1){
                System.out.println("Head " + random + ".");
            }
    }
    //main method
    public static void main(String[] args){
    //intializing the scanner class
    Scanner scan = new Scanner(System.in);
    //declaring the variables
    int z = 1;
    int k = 1;
    //asking the user to enter a value between 0-100
    //if 0 is called the first flip method is used otherwise the second is called
    //program ends if 100 or greater is given as a value
        while(z == k){
            System.out.println("Enter a number between 0 - 100");
            int q = scan.nextInt();
        if(q == 0){
            flip2();
        }else if(q >= 100){
            System.exit(-1);
        }else{
        flip(q);
        }
        }

    }

}
