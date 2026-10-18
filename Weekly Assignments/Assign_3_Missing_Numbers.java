package weekly_assignments;

public class Assign_3_Missing_Numbers {

	public static void main(String[] args) 
	{
		/*
		int[] arr = {1,2,3,5,6,7,8,9,10};
		int n=arr.length+1; //arr.length+1 because total numbers is 10 but one missing so declare with +1. also declare with static number
		int expectedValue=n*(n+1)/2;
		int sum=0;
		
		for(int index=0;index<arr.length;index++)
		{
			sum=sum+arr[index];
		}
		int missingnumber = expectedValue-sum;
		System.out.println("Missing Number is:"+missingnumber);
		*/
		
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {30,40,60,70,50};
		
		for(int i=0;i<arr1.length;i++)
		if(arr1[i]==arr2[i])
		{
			System.out.println("Common Numbers: "+i);
		}
	}
	

}
