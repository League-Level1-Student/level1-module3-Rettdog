import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton firstButton = new JButton();
	JButton secondButton = new JButton();
	public static void main(String[] args) {
		NastySurprise starter = new NastySurprise();
		starter.Start();
	}
	public void Start() {
		
		firstButton.setText("Trick");
		secondButton.setText("Treat");
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		panel.add(firstButton);
		panel.add(secondButton);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if(pressed.equals(firstButton)) {
			showPictureFromTheInternet("https://media.istockphoto.com/photos/mixed-colorful-fruit-bonbon-picture-id153502589");
		}else if(pressed.equals(secondButton)) {
			showPictureFromTheInternet("https://thumbs.dreamstime.com/z/funny-cartoon-ghost-18001494.jpg");
		}
		
	}
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}

}
