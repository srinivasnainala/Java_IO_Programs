package FilePrograms;
import java.io.*;
import java.util.*;
public class PractiseonWordsFrequency
{
	    public static void main(String[] args)
	    {
	        Map<String, Integer> wc = new HashMap<>();
	        try (BufferedReader br = new BufferedReader(new FileReader("./Demo1.txt"))) 
	        {
	            String l;
	            while ((l=br.readLine()) != null)
	            {
	                String[] words = l.split(" "); 
	                for (String word : words) 
	                {
	                    wc.put(word, wc.getOrDefault(word, 0) + 1); 
	                }
	            }
	        }
	        catch (Exception e)
	        {
	        	System.out.println(e);
	        }
	        for (Map.Entry<String, Integer> m:wc.entrySet()) 
	        {
	            System.out.println(m.getKey() + ": " +m.getValue());
	        }
	    }
	}
