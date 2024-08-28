import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String play="yes";
	while(play.equals("yes")){
		Random rand=new Random();
		int guess=-1;
		int tries=0;
		int RandNum=rand.nextInt(100);
		while(guess!=RandNum){
			System.out.println("Guessing Number between 1and 100");
			guess=sc.nextInt();
			tries++;
			if(guess==RandNum)
			{
				System.out.println("Awesome guessd it right");
				System.out.println("it took you only"+tries+"guesses");
				System.out.println("  would you like playagain Yes or No ");
				play=sc.next().toLowerCase();
				
	        }
	        else if(guess>RandNum){
	        	System.out.println("Your Guess is too high");
	        }
	        else{
	        	System.out.println( "Your Guess is too low");
	        }
	      }  	
	}
	}
} 
