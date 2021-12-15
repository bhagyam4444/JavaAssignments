package assignment.java;

import java.io.File;

public class FileHandling {

	public static void main(String[] args) {

		File fileRef = new File("C:\\Users\\Public\\Documents\\Wondershare");
		String[] fileList = fileRef.list();

		for (String str : fileList) {
			System.out.println(str);
		}
		System.out.println("Is file present on given path:" + fileRef.exists());

		System.out.println("Is given path represents a file:" + fileRef.isFile());
		System.out.println("Path given:" + fileRef.getAbsolutePath());
		System.out.println("Is file present on given path:" + fileRef.exists());
		System.out.println("can we read a file:" + fileRef.canRead());
		System.out.println("can we edit a file:" + fileRef.canWrite());
		System.out.println("get name of the file:" + fileRef.getName());
		System.out.println("get Parent Directory:" + fileRef.getParent());

	}
//	File fileRef = new File("C:\Users\Public\Documents\Wondershare\Employee.txt");
//	if(fileRef.exists())
//	{
//	System.out.println("File already exists");
//	}
//	else
//	{
//	fileRef.createNewFile();
//	}
//	
//try
//{
//	File file1=new File("Test.txt");
//	file1.createNewFile();
//	   System.out.println("Is given file represents a directory:"+file1.isDirectory());
//}
//catch(Exception e)
//{
//	e.printStackTrace();
//}
//	}
}

//}
