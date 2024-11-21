package FilePrograms;

import java.io.File;
import java.io.IOException;

public class FileProgram {
public static void main(String[] args) throws IOException {
	File f=new File("./vasu1");
	f.createNewFile();
	System.out.println(" Empty file created");
}
}
