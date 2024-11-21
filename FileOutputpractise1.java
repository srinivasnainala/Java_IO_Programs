package FilePrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputpractise1 {
public static void main(String[] args) throws Exception {
	FileOutputStream f=new FileOutputStream("/home/miracle/Naidu/Naidu/v3");
	String s="vasu naidu";
	byte b[]=s.getBytes();
	f.write(b);
	f.close();
	FileInputStream f1=new FileInputStream("/home/miracle/Naidu/Naidu/v3");
	int i;
	while((i=f1.read())!=-1)
	{
		System.out.print((char)i);
	}
	f1.close();
}
}
