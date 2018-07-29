import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame;
	JLabel label;
	JPanel panel;
	char currentLetter;
	static TypingTutor typer;

	public static void main(String[] args) {
		typer = new TypingTutor();
		typer.start();
	}

	public void start() {
		frame = new JFrame();
		panel = new JPanel();

		label = new JLabel();
		panel.add(label);
		frame.add(panel);
		frame.setTitle("Type or Die");
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.pack();
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		label.setFont(label.getFont().deriveFont(90.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.pack();
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You typed: " + currentLetter);
		if (currentLetter == (e.getKeyChar())) {
			System.out.println("Correct!");
			frame.setBackground(Color.GREEN);
		} else {
			System.out.println("Incorrect");
			frame.setBackground(Color.RED);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		label.setFont(label.getFont().deriveFont(800.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.TOP);
		frame.pack();
	}
}
