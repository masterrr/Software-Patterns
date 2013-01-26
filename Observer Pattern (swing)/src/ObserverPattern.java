import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ObserverPattern {

	JFrame frame;
	
	public static void main(String[] args) {
		ObserverPattern example = new ObserverPattern();
		example.run();
	}

	public void run() {
		frame = new JFrame();
		JButton button = new JButton("Print some values, please");
		button.addActionListener(new RandomInteger());
		button.addActionListener(new RandomFloat());
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.pack();
		frame.setVisible(true);
	}
	
	class RandomInteger implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Random random = new Random();
			System.out.println(random.nextInt());
		}
	}
	
	class RandomFloat implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(Math.random()*10);
		}
	}
}
