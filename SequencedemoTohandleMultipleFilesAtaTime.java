package FilePrograms;

import java.io.*;
import java.util.*;

public class SequencedemoTohandleMultipleFilesAtaTime {
public static  void main(String[] args) throws IOException {
	FileInputStream fi=new FileInputStream("/home/miracle/Naidu/Naidu/v1");
	FileInputStream fi1=new FileInputStream("/home/miracle/Naidu/Naidu/v");
	FileInputStream fi2=new FileInputStream("/home/miracle/Naidu/Naidu/v2");
	try {
//	SequenceInputStream s=new SequenceInputStream(si,fi2);
	Vector a=new Vector();
	a.add(fi2);
	a.add(fi1);
	a.add(fi);
	Enumeration e=a.elements();
	SequenceInputStream si=new SequenceInputStream(e);
	int i;
	while((i=si.read())!=-1)
	{
		System.out.print((char)i);
	}
	si.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
