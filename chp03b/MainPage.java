package chp03b;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPage extends JPanel implements ActionListener {

	JButton button;
	
	public MainPage() {
		setSize(new Dimension(800, 600));
		button = new JButton("Hello");
		this.add(button);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("Hello");
		}
	}
	
}
