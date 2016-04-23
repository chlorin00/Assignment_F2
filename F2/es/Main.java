package f2.es;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Escape Space");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 650);
		frame.setResizable(false);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setVisible(true);
	}
}