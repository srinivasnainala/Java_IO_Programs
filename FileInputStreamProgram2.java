package FilePrograms;

import java.io.*;

public class FileInputStreamProgram2 {
public static void main(String[] args) throws IOException {
	FileInputStream fi=new FileInputStream("./Demo1.txt");
	int i;
	while((i=fi.read())!=-1)
	{
		System.out.print((char)i);
	}
	fi.close();
}
}
