import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whack_a_Mole {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	public static void main(String[] args) {
		Whack_a_Mole starter = new Whack_a_Mole();
		starter.Start();
	}
	public void Start() {
		frame.setSize(290, 240);
		for(int i = 0;i<15;i++) {
			
		
		panel.add(new JButton());
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
}
