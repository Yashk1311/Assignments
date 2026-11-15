package weekly_assignments;

public class Assign_4_Replace_Character 
{

	public static void main(String[] args) 
	{
		String str="banana";
		
		char oldcharacter='a';
		char newcharacter='o';
		
		String result="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==oldcharacter)
			{
				result=result+newcharacter;
			}
			else
			{
				result=result+ch;
			}
		}
		
		System.out.println("Original String: "+str);
		System.out.println("Updated String: "+result);
		
	}

}
