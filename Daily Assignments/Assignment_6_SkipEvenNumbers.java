package daily_assignments;

public class Assignment_6_SkipEvenNumbers {

	public static void main(String[] args) 
	{
		int num=0;
		do
		{
			num++;
			if(num%2==0)
			continue;
			System.out.println(num);
		}
		while(num<15);
	}

}
