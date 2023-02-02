package khushi23;
import java.io.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class NUMBERGUESSINGGAME {

	public static void main(String[] args) {
		
			
				
				int result,guess;
				final int n=100;
				boolean right = false;
				Scanner sc = new Scanner(System.in);
				Random no = new Random();
				result=no.nextInt(n)+1;
				System.out.println("{{Welcome to the Number Guessing Game}}");
				do
				{
					System.out.println("Guess the number between 1-100");
					guess=sc.nextInt();
					if(guess>result)
					{
						System.out.println("Entered number is large!!");
						
					}
					else if(guess<result)
					{
						System.out.println("Entered number is small!!");
					}
					else
					{
						System.out.println("Yess, You have guessed the correct number!!");
						right=true;
					}
						
				}
				while(!right);
				System.exit(0);
				
			}

		}



