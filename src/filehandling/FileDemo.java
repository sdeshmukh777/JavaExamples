package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws Exception {

		try {
		
			//First constructor
			File f = new File("d:\\","TEXT.txt");
			boolean h=f.createNewFile();
			if(true == h)
				System.out.println("File sucesfully created");
			else
				System.out.println("File not create");
			
			System.out.println(f.canRead());
			
			System.out.println(f.canWrite());
			
			System.out.println(f.exists());
			
			System.out.println(f.getAbsolutePath());
			
			System.out.println(f.length());
			
			System.out.println(f.getName());
			
			System.out.println(f.isDirectory());
			
			System.out.println(f.isFile());
			
			System.out.println(f.isHidden());
			
			//System.out.println(f.delete());
			
			
			//To create directory in cwd and create file abc.txt inside created dic
			File f1 =new File("d://Swapnil2");
			f1.mkdir();
			
			//second constructor
			File f2 =new File("d://Swapnil12","abc.txt");
			
			//third constructor
			File f3 =new File(f1,"abc.txt");
			f1.createNewFile();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		

	}

}
