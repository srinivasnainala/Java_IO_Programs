package FilePrograms;

import java.io.*;

public class FileWriterProgram3 {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("./Demo23.txt");
	String  s="i am working at miracle";
	fw.write(s);
	System.out.println("File Created");
	fw.close();
	FileReader fr=new FileReader("./Demo23.txt");
	int i;
	while((i=fr.read())!=-1)
	{
		System.out.print((char)i);
	}
	fr.close();
}
}
