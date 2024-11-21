package FilePrograms;

import java.io.*;

public class FileoutputstreamProgram1 {
public static void main(String[] args) throws IOException {
	
	try
	{
	FileOutputStream fos=new FileOutputStream("/home/miracle/Naidu/Naidu/v");
	String s="try catchashdjksahgfhjfujolhjkhlyhgfdyrtserdfx,jn.jkuhioyu";
	byte b[]=s.getBytes();
    fos.write(b, 0, s.length());
    fos.flush();
    fos.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("file created");
	}
	
	FileInputStream fi=new FileInputStream("/home/miracle/Naidu/Naidu/v");
	BufferedInputStream bi=new BufferedInputStream(fi);
	int i;
	while((i=bi.read())!=-1)
	{
		System.out.print((char)i);
	}
	bi.close();
}
}
