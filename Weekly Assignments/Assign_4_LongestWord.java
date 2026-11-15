package weekly_assignments;

public class Assign_4_LongestWord 
{

	public static void main(String[] args) 
	{
		String str = "Java programming is interesting";
		
		String[] words = str.split(" ");

        String longest = "";

        for (int i = 0; i < words.length; i++) 
        {

            if (words[i].length() > longest.length()) 
            {
                longest = words[i];
            }
        }

        System.out.println("Longest Word: " + longest);
    }

}
