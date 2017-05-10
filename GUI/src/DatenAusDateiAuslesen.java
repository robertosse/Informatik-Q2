import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DatenAusDateiAuslesen extends DatenInDateiSchreiben {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		
		File f = new File("C:/Users/Robert/Documents/hallo5.txt");
		Scanner scan = new Scanner(f);
		int scan1 = scan.nextInt();
		System.out.println(scan1);
	
	}


}
