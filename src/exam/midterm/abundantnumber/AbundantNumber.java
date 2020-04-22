package exam.midterm.abundantnumber;

public class AbundantNumber {
	public static void findAbundantNumber(int number) 
	{
		int sum = 0;
		boolean doneOnce = false;
		for(int count = 1;  count < number; count++) 
		{
			for(int temp = 1; temp <= count/2; temp++) 
			{
				if(count % temp == 0) 
				{
					sum += temp;
				}
			}	if(sum > count) 
			{
					if(!doneOnce)
					{
						System.out.println("Abudant number(s) smaller than " + number + ": ");
						doneOnce = true;
					}
				System.out.print(count + "  ");
			}
			sum = 0;
			
		}
	}	
}

