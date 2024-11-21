package FilePrograms;

import java.io.*;

public class FindingvowelsAndConsonantsFromFiles {
public static void main(String[] args)  throws Exception{
	FileOutputStream fs=new FileOutputStream("./data.txt");
	String s="vasu naidu nainala @$@$@$ 1243";
	int vowels=0,digit=0,spcharacters=0,spaces=0,consonants=0;
	byte b[]=s.getBytes();
	fs.write(b);
	fs.close();
	FileInputStream fi=new FileInputStream("./data.txt");
	int i;
	while((i=fi.read())!=-1)
	{
		char ch=(char)i;
		if(Character.isAlphabetic(ch))
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		if(!Character.isAlphabetic(ch)&&Character.isDigit(ch))
		{
			digit++;
		}
		else if((!Character.isAlphabetic(ch))&&(!Character.isDigit(ch))&&ch!=' ')
		{
			spcharacters++;
		}
		else if(ch==' ')
		{
	        spaces++;
		}
//		System.out.print((char)i);
	}
	System.out.println("count of vowels in a file is: "+vowels);
	System.out.println("Count of consonants in a file is: "+consonants);
	System.out.println("Count of digits in a file is: "+digit);
	System.out.println("count of special characters in a file is : "+spcharacters);
	System.out.println("Count of spaces in a file is : "+spaces);
	
	fi.close();
}
}
