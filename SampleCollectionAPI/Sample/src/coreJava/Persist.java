package coreJava;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Student stu=new Student(11019,"Prathamesh");
		
		File f=new File("Obj.txt");
		FileOutputStream fout=new FileOutputStream(f);
		ObjectOutputStream os=new ObjectOutputStream(fout);
		os.writeObject(stu);
		
		System.out.println("Serialization Successfull");
	}

}
