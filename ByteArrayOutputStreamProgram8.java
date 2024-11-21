package FilePrograms;

import java.io.*;


public class ByteArrayOutputStreamProgram8 {
public static void main(String[] args) throws IOException {
FileOutputStream F=new FileOutputStream("/home/miracle/Naidu/Naidu/srinu");
ByteArrayOutputStream b=new ByteArrayOutputStream();
String s="vasu naidu nainala";
b.write(s.getBytes());
//b.write(s);
b.writeTo(F);
b.close();
System.out.println("Successfully inserted");

	FileInputStream f=new FileInputStream("/home/miracle/Naidu/Naidu/srinu");
    int i;
    while((i=f.read())!=-1)
    {
    	System.out.print((char)i);
    }
    f.close();
}
}
