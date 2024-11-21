package FilePrograms;

import java.io.*;
import java.util.*;

public class CountofWordsInAFile {
public static void main(String[] args) throws Exception{
	FileInputStream fis=new FileInputStream("./Demo1.txt");
	Scanner sc=new Scanner(fis);
	int words=0;
	while(sc.hasNext())
	{
		sc.next();
		words++;
	}
	fis.close();
	System.out.println("Count of the words is: "+words);
}
}
