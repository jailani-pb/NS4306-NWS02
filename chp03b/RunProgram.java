package chp03b;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RunProgram {

	public static void main(String[] args) {
		JPanel panel = new MainPage();
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.add(panel);
		frame.setVisible(true);
	}
	
}
