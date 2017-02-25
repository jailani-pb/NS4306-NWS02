package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class RunBufferedStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please type in Source File:");
		String source = scanner.nextLine();
		
		File sourceFile = new File(source);
		while(!sourceFile.exists()) {
			System.out.println("File does not exists. Please type in Source File:");
			source = scanner.nextLine();
			sourceFile = new File(source);
		}
		
		System.out.println("Please type in Target File:");
		String target = scanner.nextLine();
		
		File targetFile = new File(target);
		while(targetFile.exists()) {
			System.out.println("File already exists. Please type in Target File:");
			target = scanner.nextLine();
			targetFile = new File(target);
		}
		
		try(
			BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
			BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));
		) {
			int fileContent, numberOfBytesCopies = 0;
			while((fileContent = input.read()) != -1) {
				output.write((byte)fileContent);
				numberOfBytesCopies++;
			}
			
			System.out.println("Copy file is successful. bytes copied = " + numberOfBytesCopies);
		}
		
	}

}










