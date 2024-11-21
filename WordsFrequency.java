package FilePrograms;

import java.io.*;
import java.util.*;

public class WordsFrequency {
public static void main(String[] args) throws Exception {
	Map<String,Integer> m=new HashMap<>();
	FileReader fis=new FileReader("./Demo1.txt");
	BufferedReader b=new BufferedReader(fis);
	String line;
	while((line=b.readLine())!=null)
	{
		String words[]=line.split(" ");
	    for(String s:words)
	    {
	    	m.put(s,m.getOrDefault(s,0)+1);
	    }
	}
	for(Map.Entry<String,Integer> m1:m.entrySet())
	{
		System.out.println(m1.getKey()+" "+m1.getValue());
	}
	b.close();
}
}
