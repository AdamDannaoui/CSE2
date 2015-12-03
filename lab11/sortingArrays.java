//Adam Dannaoui lab 11
//practice manipulating arrays
import java.util.Arrays;
//naming the class
public class sortingArrays{
    //method that sorts the elements of the array in ascending order
    public void sort(int[] array) {
        Arrays.sort(array);
        System.out.println(array);
    }
    //main method
    public static void main(String[] args){
        //creating another array of size 20
        int arraySize = 20;
        int[] array1;
        array1 = new int[arraySize];
        //creating and initializing another array of size 30
        int arraySize3 = 30;
        int[] array3;
        array3 = new int[arraySize3];
        //creating and initializing another array of size 10
        int arraySize2 = 10;
        int[] array2;
        array2 = new int[arraySize2];
        //for loop that initialize the array with 20 random numbers between 0-100
        for(int i = 0; i<arraySize; i++){
            array1[i] = (int)(Math.random()*100);
            array3[i] = array1[i];
           
        }
        Arrays.sort(array3);
        //for loop that initialize the array with 20 random numbers between 0-100
        for(int i = 0; i<arraySize2; i++){
            array2[i] = (int)(Math.random()*100);
            array3[i] = array2[i];
            
        }
        Arrays.sort(array3);
        //printing the results
        System.out.println(Arrays.toString(array3));

    }
}