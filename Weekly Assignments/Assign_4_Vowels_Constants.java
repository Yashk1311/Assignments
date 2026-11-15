package weekly_assignments;

public class Assign_4_Vowels_Constants {

	public static void main(String[] args) 
	{
		String str = "Programming";
		
		int vowels=0;
		int constants=0;
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a' && i<='z')
			{
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
				vowels++;
				else
				{
					constants++;
				}
			}
		}
		
		System.out.println("Total vowels: "+ vowels);
		System.out.println("Total constants: "+ constants);
	}

}
