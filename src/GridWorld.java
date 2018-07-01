import javax.swing.JFrame;

import info.gridworld.world.World;

public class GridWorld {
public static void main(String[] args) {
	World world = new World();
	world.show();
}
private void show() {
	// TODO Auto-generated method stub
	JFrame frame = new JFrame();
	frame.setVisible(true);
	
}
public GridWorld() {
	
}
}
