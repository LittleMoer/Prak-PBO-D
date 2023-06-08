import java.io.*;

/**
 * File : ReadSerializePerson.java 31/05/2023
 * Nama : Mursetyo Ardiyan Nugroho
 * NIM  : 24060121140095
 * Deskripsi : program untuk serialisasi objek person
**/

public class ReadSerializePerson{
	public static void main(String[] args){
		Person person = null;
		try{
			FileInputStream f = new FileInputStream("person.ser");
			ObjectInputStream s = new ObjectInputStream(f);
			person = (Person)s.readObject();
			s.close();
			System.out.println("serialize person name = "+person.getName());
		}catch(Exception ioe){
			ioe.printStackTrace();
		}
	}
}