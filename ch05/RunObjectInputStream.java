package ch05;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class RunObjectInputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		try {
			try(ObjectInputStream input = new ObjectInputStream(
					new BufferedInputStream(new FileInputStream("object.dat")))) {
				while(true) {
					System.out.println(input.readUTF() + " " + input.readDouble() 
					+ " " + (Date) input.readObject());
				}
			}
		} catch (EOFException e) {
			System.out.println("You reached the end of the file.");
		}
	}

}
