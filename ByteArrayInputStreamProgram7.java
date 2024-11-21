package FilePrograms;

import java.io.*;

public class ByteArrayInputStreamProgram7 {
public static void main(String[] args) throws IOException {
	FileOutputStream fos=new FileOutputStream("/home/miracle/Naidu/Naidu/v1");
	byte b[]= {68,78,65};
	ByteArrayInputStream by=new ByteArrayInputStream(b);
	int i;
	while((i=by.read())!=-1)
	{
		System.out.print((char)i);
	}
}
}
