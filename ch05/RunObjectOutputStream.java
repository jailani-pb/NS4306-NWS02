package ch05;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class RunObjectOutputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(ObjectOutputStream output = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("object.dat")))) {
			output.writeUTF("Jailani");
			output.writeDouble(50.0);
			output.writeObject(new Date());
			output.writeUTF("Abdul");
			output.writeDouble(70.2);
			output.writeObject(new Date());
			output.writeUTF("Rahman");
			output.writeDouble(73.2);
			output.writeObject(new Date());
		}
	}

}
