
import java.io.File;

public class App {
	
		
		public static void main(String[]args){
			
			File f =  new File("C:\\Users\\Admin-18\\Desktop");
			String filenames[] = f.list();
			long filesizes =  f.length();
			for(String filename:filenames)
			{
			System.out.println("File Name: "+ filename );
		
		
		}
		
			
	}

}