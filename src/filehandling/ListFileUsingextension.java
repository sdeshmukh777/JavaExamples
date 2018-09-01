package filehandling;

import java.io.File;

public class ListFileUsingextension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fcount = 0,dcount=0;
		File f1 = new File("D:\\selenium-2.53.1");
		System.out.println(f1.exists());
		String[] l = f1.list();

		for (String s1 : l) {

			// only file
			File f2 = new File(f1, s1);
			if (f2.isFile()) {
				if(s1.toLowerCase().endsWith(".jar"))
				{
					System.out.println("File names " +s1);
					fcount++;
				}
				else
				{
				System.out.println("File names " +s1);
				}
			} else if (f2.isDirectory()) {
				dcount++;
				System.out.println("Dir names "+s1);

			}

		}

		System.out.println("file count is " +fcount);
		System.out.println("Dir count is " +dcount);
	}

}
