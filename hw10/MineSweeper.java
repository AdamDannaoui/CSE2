//Adam Dannaoui 11/09/15 
//Program will be a less complex version of the game minesweeper
//the size of the grid and number of mines will be determined by user input
import java.util.Scanner;
//importing the scanner class
import java.util.Random;
//importing the random class
public class MineSweeper {
	//array 
	char [] [] mMinefield;
	//both also equal to N 
	int mWidth;
	int mHeight;
public void  Sweeper() {
	//method that has the array mMinefield
		char [] [] mMinefield;
		mMinefield = new char [mHeight][mWidth];
	}
public int mineAt (int y, int x){
	//method which checks that we're not out of array bounds 
	if (y>=0 && x>=0 && mMinefield[y][x]=='M'){
		return 1;
	}
	else{
		return 0;
	}
}
public char minesNear(int y, int x){
	//checks all the mines in all directions
	int mines = 0;
	mines += mineAt (y-1, x-1);
	mines += mineAt (y-1, x);
	mines += mineAt (y-1, x+1);
	mines += mineAt (y, x-1);
	mines += mineAt (y-1, x+1);
	mines += mineAt (y+1, x-1);
	mines += mineAt (y+1, x);
	mines += mineAt (y+1, x+1);
	if (mines>0){
		//changing int to a char
		return (char)(mines);
	}
	else{
		return ' ';
	}
}
public void calculate(){
	//method which calculates where the mines are
	for(int y = 0; y < mHeight; y ++) {
	      for(int x = 0; x < mWidth; x ++) {
	        if(mMinefield[y][x] != 'M') {
	          mMinefield[y][x] = minesNear(y, x);
}
	      }
	}
}
public static void main(String[ ]args){
	//class and main method
	Scanner myScanner = new Scanner (System.in);
	//initializing the scanner class
	System.out.println("enter the size of the board (has to be between 2-30)");
	int N = myScanner.nextInt();
	//prompting user for input for N
	System.out.println("enter the number of mines on the board "+"(number should be between 1 and " + N*N+")");
	int M = myScanner.nextInt();
	//prompting user for input for M
	int board [] [] = new int [N][N];
	//places the mines at random locations
	for (int i=0; i<board.length; i++){
		for (int j=0; j<board[i].length; j++){
			board [i] [j] = '.';
		}
	}
	//places the mines at random locations 
	for (int i=0; i<M; i++){
		board[(int)(Math.random()*N)][(int)(Math.random()*N)]=M;
	}
	//places the mines at random locations 
	for (int k = 0; k<N; k++){
		for (int z = 0;z<N; z++){
			System.out.print(board[k][z]);
		}
		System.out.println();
	}
	calculate();
	//was not able to get the method to be called correctly
}
}