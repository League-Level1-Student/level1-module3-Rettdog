import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	
	JButton joke = new JButton();
	JButton punchline = new JButton();
public static void main(String[] args) {
	ChuckleClicker chuckles = new ChuckleClicker();
	chuckles.makeButtons();
}
void makeButtons(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	joke.setText("joke");
	punchline.setText("punchline");
	panel.add(joke);
	panel.add(punchline);
	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
	joke.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == joke) {
		JOptionPane.showMessageDialog(null, "Orange you glad you didn't have to say anything?");
	}
	if(e.getSource() == punchline) {
		JOptionPane.showMessageDialog(null, "Next in line to get punched");
	}
	
}
}
