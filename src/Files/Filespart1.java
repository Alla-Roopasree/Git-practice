package Files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Filespart1 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		File f1 = new File("C:\\Users\\2153786\\OneDrive - Cognizant\\Desktop\\SeleniumWithjava\\Core Java");
//		f1.createNewFile();
//		f1.mkdir();
		System.out.println(Arrays.toString(f1.list()));
		System.out.println(f1.getName());
		System.out.println(f1.getAbsolutePath());
		File f3 = new File(f1.getParent()+"\\resume.docx");
		f3.createNewFile();
		File f4 = new File(f1.getAbsolutePath()+"\\resume.docx");
		f4.createNewFile();
		System.out.println(Arrays.toString(f1.listFiles()));
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
//		System.out.println("a"+f1.renameTo(f4));
		System.out.println("setLastModified : "+f3.setLastModified(10));
		System.out.println("setReadOnly : "+f3.setReadOnly());
		System.out.println("1. setReadable: "+f3.setReadable(false));
		System.out.println("setReadable : "+f3.setReadable(false, true));
//		if(f1.exists())
//		{
//			System.out.println("deleet"+f1.delete());
//		}
//		
		
		File f = new File("C:\\Users\\2153786\\OneDrive - Cognizant\\Desktop\\SeleniumWithjava\\Core Java\\t.txt");
		try {
//			if(!f.exists())
//			{
//				System.out.println("failed");
//				f.delete();
//			}
//			else
//			{
//				System.out.println("failed1");
//			}
//			f.createNewFile();
			
 			System.out.println("Create file : "+f.createNewFile());
			f.setWritable(true);
			System.out.println("Hidden : "+f.isHidden());
			System.out.println("Write : "+f.canWrite());
//			f.setWritable(false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("failede");
			
			e.printStackTrace();
		}
	}

}
