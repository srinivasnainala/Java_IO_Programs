package FilePrograms;

import java.io.*;

public class BufferedOutputStreamProgram4 {
public static void main(String[] args) throws IOException {
	FileOutputStream f=new FileOutputStream("./Demo3");
	 BufferedOutputStream bos=new  BufferedOutputStream(f);
	 String s="Miracle Software Systems";
	 byte b[]=s.getBytes();
	 bos.write(b);
	 bos.close();
	 System.out.println("File Created");
}
}
