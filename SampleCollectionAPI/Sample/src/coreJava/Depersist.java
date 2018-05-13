package coreJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Depersist {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Obj.txt"));
		Student s=(Student) ois.readObject();
		System.out.println(s.id+"  "+s.name);
		System.out.println("Deserialization is successful");
		ois.close();
	}

}
