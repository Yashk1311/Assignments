package weekly_assignments;

public class Assign_4_Substring {

	public static void main(String[] args) 
	{
		 String str = "ABC";

	        for (int i = 0; i < str.length(); i++) {

	            for (int j = i + 1; j <= str.length(); j++) {

	                System.out.println(str.substring(i, j));

	            }
	        }

	}

}
