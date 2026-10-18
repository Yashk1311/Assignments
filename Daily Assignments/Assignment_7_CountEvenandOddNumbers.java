package daily_assignments;

public class Assignment_7_CountEvenandOddNumbers {

	public static void main(String[] args) 
	{
		int[]number = {11, 24, 35, 42, 56, 67, 80, 93};
		
		int evencount=0;
		int oddcount=0;
		
		for(int i=0;i<number.length;i++)
		{
			if(number[i]%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
		
		System.out.println("Even numbers: "+evencount);
		System.out.println("Odd numbers: "+oddcount);
	}
}
