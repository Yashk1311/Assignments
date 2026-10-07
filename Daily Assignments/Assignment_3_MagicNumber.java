package daily_assignments;

public class Assignment_3_MagicNumber {

	public static void main(String[] args) 
	{
		int num=172;
		int sum=0;
		
		for(;num>9;)
		{
			for(;num>0;)
			{
				int lastDigit=num%10;//2
				sum=sum+lastDigit;//2
				num=num/10;//17
			}
			num=sum;
			sum=0;
		}
		System.out.println("Final value of sum:"+num);
		if(num==1)
			System.out.println("Magic number");
	}

}
