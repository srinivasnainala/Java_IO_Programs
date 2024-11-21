package FilePrograms;

import java.io.*;
import java.util.*;



class Mydetails implements Serializable
{
	private static final long serialVersionUID = -1577820636228835397L;
	String name;
	String surname;
	int age;
	Mydetails(String name,String surname,int age)
	{
		this.name=name;
		this.surname=surname;
		this.age=age;
	}
}
public class PassingObjectsInCollections {
public static void main(String[] args) throws Exception {
	List<Mydetails> l=new ArrayList<>();
	l.add(new Mydetails("vasu","nainala",22));
	l.add(new Mydetails("sai","chinta",23));
	l.add(new Mydetails("naveen","ryali",24));
	Collections.sort(l,(s,s1)->
	{
		return s.age>s1.age?-1:s.age<s1.age?1:0;
//		return s.name.length()>s1.name.length()?-1:s.name.length()<s1.name.length()?1:0;
	});
	
	Iterator<Mydetails> i=l.iterator();
	while(i.hasNext())
	{
		Mydetails m=(Mydetails)i.next();
		System.out.println(m.name+" "+m.surname+" "+m.age);
	}
//	FileOutputStream f=new FileOutputStream("/home/miracle/Naidu/Naidu/FilesPractise");
//    ObjectOutputStream o=new ObjectOutputStream(f);
//    o.writeObject(l);
//    o.close();
//    System.out.println("Successfully inserted");
	FileInputStream fis =new FileInputStream("/home/miracle/Naidu/Naidu/FilesPractise");
	ObjectInputStream os=new ObjectInputStream(fis);
	List<Mydetails> s=(ArrayList<Mydetails>)os.readObject();
	Iterator<Mydetails> k=s.iterator();
	while(k.hasNext())
	{
		Mydetails s1=(Mydetails)k.next();
		System.out.println(s1.name+" "+s1.surname+" "+s1.age);
	}
	os.close();
}
}
