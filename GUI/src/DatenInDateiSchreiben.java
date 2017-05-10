import java.io.*;
import java.util.Scanner;

public class DatenInDateiSchreiben {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:/Users/Robert/Documents/hallo5.txt");
		f.createNewFile();
		FileWriter fwriter = new FileWriter(f);
		fwriter.write("5");
		fwriter.write(System.getProperty("line.separator"));
		fwriter.write("Paul und Phillip");
		fwriter.close();		
	}
	
}
