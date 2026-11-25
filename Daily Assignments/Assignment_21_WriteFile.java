package daily_assignments;

import java.io.File;
import java.io.FileWriter;

public class Assignment_21_WriteFile 
{
	public static void main(String[] args) 
	{
		File file=new File("D:\\GrowSkillIT\\paragraph.txt");
		try(FileWriter fr=new FileWriter(file,true))
		{
			fr.write("\nRead the complete file,\nCount the total number of words, \nDisplay the word count");
			System.out.println("Output Done");
		}catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
	}

}
