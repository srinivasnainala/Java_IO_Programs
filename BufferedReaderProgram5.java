package FilePrograms;

import java.io.*;

public class BufferedReaderProgram5 {
public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("./Demo3");
	BufferedReader br=new BufferedReader(fr);
	int i;
	while((i=br.read())!=-1)
	{
		System.out.print((char)i);
	}
	br.close();
}
}
