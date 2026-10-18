package weekly_assignments;

public class Assign_3_MovingZeros {

	public static void main(String[] args) 
	{
		int[] arr = {0,5,0,3,8,0,2,9};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==0)
				{
					if(arr[j]!=0)
					{
						//swap
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						break;
					}
					else
						j++;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	
	}
}
