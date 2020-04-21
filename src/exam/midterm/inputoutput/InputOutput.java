package exam.midterm.inputoutput;

import java.util.Scanner;
import exam.midterm.abundantnumber.SumDivisor;
public class InputOutput {
	public static int Input(int number) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a real number: ");
		number = input.nextInt();
		while(number < 0) 
		{
			System.out.println("Invalid number!!Please enter a real number: ");
			number = input.nextInt();
			
		}
		input.close();
		return number;
		
	}
	
	public static void Output(int number) 
	{
			if(number < 13) 
			{
				System.out.println("There are no abundant numbers smaller than " + number);
				
			} else 
			{
				SumDivisor.findSumDivisor(number);
				
			}
			
	}
}
