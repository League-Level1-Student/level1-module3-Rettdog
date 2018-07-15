import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame;
	JPanel panel;
	JLabel label1,label2,label3;
	JButton button;
	public static void main(String[] args) {
		SlotMachine slots = new SlotMachine();
		slots.Start();
	}
	public void Start() {
		frame = new JFrame();
		frame.setVisible(true);
		panel = new JPanel();
		label1 = loadImage("cherry.jpg");
		label2 = loadImage("lemonade.png");
		label3 = loadImage("sevens.png");
		button = new JButton();
		button.setText("SPIN");
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(button);
		frame.add(panel);
		frame.pack();
		button.addActionListener(this);
	}
	public void Spin() {
		frame.remove(label1);
		//
		//
		// Work on this!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//
		//
		Random rand = new Random();
		int first = rand.nextInt(3);
		int second = rand.nextInt(3);
		int third = rand.nextInt(3);
		if(first==2) {
			label1 = loadImage("cherry.jpg");
		}else if (first==1){
			label1 = loadImage("lemonade.png");
		}else {
			label1 = loadImage("sevens.png");
		}
		
		if(second==2) {
			label2 = loadImage("cherry.jpg");
		}else if (second==1){
			label2 = loadImage("lemonade.png");
		}else {
			label2 = loadImage("sevens.png");
		}
		
		if(third==2) {
			label3 = loadImage("cherry.jpg");
		}else if (third==1){
			label3 = loadImage("lemonade.png");
		}else {
			label3 = loadImage("sevens.png");
		}
		frame.pack();
	}
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Spin();
		
	}
}
