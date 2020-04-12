package exam;

import java.util.Scanner;
public class Midterm {
	static int abundantNumber(int n) {
		int sum = 0;
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean doneOnce = false;
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		while(number < 0) {
			System.out.println("Invalid number!! Enter a real number.");
			number = input.nextInt();
		} 
		input.close();
		
		if(number < 13) 
		{
			System.out.println("There are no abundant number smaller than " + number);
		} else 
		{	
				for(int dem = 1; dem < number; dem++) 
				{	
					if(abundantNumber(dem) > dem) 
					{
						if(!doneOnce) 
						{
							System.out.println("Abundant numbers smaller than " + number +":");
							doneOnce = true;
						}
						System.out.print(dem + "  ");
					}
				}
		}
	}	
}