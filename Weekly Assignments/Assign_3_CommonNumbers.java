package weekly_assignments;

public class Assign_3_CommonNumbers {

	public static void main(String[] args) 
	{
		
		int[] arr1= {10,20,30,40,50};
		int[] arr2= {30,40,50,60,70};
		
		System.out.print("Common Elements: ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr2.length-1;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr1[i]+" ");
					break;
				}
			}
		}
		

	}
}