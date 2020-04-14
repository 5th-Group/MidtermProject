package midterm.exam.abundantNumber;

import java.util.Scanner;
public class FindAbundantNumber {
	public static int abundantNumber(int n) {
		int sum = 0;
		for(int count = 1; count <= n/2; count++) {
			if(n % count == 0) {
				sum += count;
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
				for(int count = 1; count < number; count++) 
				{	
					if(abundantNumber(count) > count) 
					{
						if(!doneOnce) 
						{
							System.out.println("Abundant numbers smaller than " + number +":");
							doneOnce = true;
						}
						System.out.print(count + "  ");
					}
				}
		}
	}	
}