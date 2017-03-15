package ch06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			// Create socket to localhost:9101
			Socket socket = new Socket("localhost", 9101);
			
			// Create data output and input streams
			DataOutputStream toServer = new DataOutputStream(
					new BufferedOutputStream(socket.getOutputStream()));
			DataInputStream fromServer = new DataInputStream(
					new BufferedInputStream(socket.getInputStream()));
			
			while(true) {
				// Ask for user input
				double radius = Double.parseDouble(scanner.nextLine());
				// Send the radius to the server
				toServer.writeDouble(radius);
				toServer.flush();
				// Receive area from server
				double area = fromServer.readDouble();
				
				System.out.println("Radius sent: " + radius);
				System.out.println("Area received: " + area);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
