package FilePrograms;

import java.io.*;

public class BufferedInputStreamProgram6 {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./Demo3");
	BufferedInputStream bis=new BufferedInputStream(fis);
	int i;
	while((i=bis.read())!=-1)
	{
		System.out.print((char)i);
	}
	bis.close();
}
}
