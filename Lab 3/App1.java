import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class App1 {
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = s.next();
		System.out.println("Enter Your Age:");
		int age = s.nextInt();
		System.out.println("Enter Your BG:");
		String bg = s.next();
		
		System.out.println("Your Name: "+ name+"\n"+"Your Age: " +age+"\n"+"Blood Group: "+bg);
		
		File file = new File("faisal.txt");
		PrintWriter pw = new PrintWriter(file);
		pw.write(name);
		pw.write(age);
		pw.write(bg);
		pw.close();
	}
}
