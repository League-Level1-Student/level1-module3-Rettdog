import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends MouseAdapter{
	JFrame frame = new JFrame();
	JPanel label = new JPanel();
	JButton addr = new JButton();
	JButton subr = new JButton();
	JButton mulr = new JButton();
	JButton divr = new JButton();
	JTextField first = new JTextField(4);
	JTextField second = new JTextField(4);
	Calculator(){
		
		
		first.setSize(100, 30);
		label.add(first);
		
		second.setSize(100, 30);
		label.add(second);
		
		addr.setText("Add");
		label.add(addr);
		subr.setText("Substarch");
		label.add(subr);
		mulr.setText("Multiply");
		label.add(mulr);
		divr.setText("Divide");
		label.add(divr);
		frame.add(label);
		frame.setVisible(true);
		frame.pack();
		addr.addMouseListener(this);
		subr.addMouseListener(this);
		mulr.addMouseListener(this);
		divr.addMouseListener(this);
	}
	double add(double first, double second){
		return first+second;
	}
	double sub(double first, double second){
		return first-second;
	}
	double mul(double first, double second){
		return first*second;
	}
	double div(double first, double second){
		return first/second;
	}
	public void mousePressed(MouseEvent e) {
		if(e.getSource().equals(addr)) {
			JOptionPane.showMessageDialog(null, add(Double.parseDouble(first.getText()),Double.parseDouble(second.getText())));
		}
		if(e.getSource().equals(subr)) {
			JOptionPane.showMessageDialog(null, sub(Double.parseDouble(first.getText()),Double.parseDouble(second.getText())));
		}
		if(e.getSource().equals(mulr)) {
			JOptionPane.showMessageDialog(null, mul(Double.parseDouble(first.getText()),Double.parseDouble(second.getText())));
		}
		if(e.getSource().equals(divr)) {
			JOptionPane.showMessageDialog(null, div(Double.parseDouble(first.getText()),Double.parseDouble(second.getText())));
		}
	}
	
}
