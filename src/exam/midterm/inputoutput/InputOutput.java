package exam.midterm.inputoutput;

import java.util.Scanner;
import exam.midterm.abundantnumber.SumDivisor;
public class InputOutput {
	public static int Input(int number) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println(">>============================================================<<");
		System.out.println("  Enter a number to print out abundant numbers smaller than it");
		System.out.println(">>============================================================<<");
		System.out.print  ("  Enter a number: ");
		number = input.nextInt();
		System.out.println(" ");
		while(number < 0) 
		{
			System.out.print("Invalid number!! Please enter a natural number: ");
			number = input.nextInt();
			
		}
		input.close();
		return number;
		
	}
	
	public static void Output(int number) 
	{
			if(number < 13) 
			{	
				System.out.println("  There are no abundant numbers smaller than " + number);
				
			} else 
			{
				SumDivisor.findSumDivisor(number);
				
			}
			
	}
}
