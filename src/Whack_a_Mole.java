import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whack_a_Mole implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1;
	int hits = 0;
	int misses = 0;
	Date date = new Date();
	public static void main(String[] args) {
		Whack_a_Mole starter = new Whack_a_Mole();
		starter.Start();
		
	}

	public void Start() {
		frame.setSize(290, 240);
		Random rand = new Random();
		int random = rand.nextInt(15);
		for (int i = 0; i < 15; i++) {
			if (i == random) {
				button1 = new JButton("mole");
				button1.addActionListener(this);
				panel.add(button1);
			} else {
				JButton button = new JButton();
				button.addActionListener(this);
				panel.add(button);
			}
		}
		frame.add(panel);
		frame.setVisible(true);

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(button1)) {
			playSound("ding.wav");
			speak("correct");
			
			hits++;
		}else {
			if(misses%2==0) {
			speak("incorrect");
			}else {
				speak("you missed");
			}
			misses++;
		}
		if(hits>9) {
			endGame(date,hits);
			System.exit(0);
		}
		if(misses>4) {
			endGame(date,hits);
			System.exit(0);
		}
		panel.removeAll();
		Start();
	}	
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
	}

