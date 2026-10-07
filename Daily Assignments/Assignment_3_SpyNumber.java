package daily_assignments;

public class Assignment_3_SpyNumber {

	public static void main(String[] args) 
	{
		int i = 1124;
		int sum = 0;
		int product = 1;
		
		for(;i>0;)
		{
			int digit = i%10;
			sum=sum+digit;
			product=product*digit;
			i=i/10;
		}
		System.out.print(sum);
		System.out.print(product);
	}

}
