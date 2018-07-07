import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
public static void main(String[] args) {
	World world = new World();
	world.show();
	Bug bug = new Bug();
	Bug buggy = new Bug(Color.blue);
	Flower flow = new Flower();
	Flower flower = new Flower();
	Location loc = new Location(2,4);
	world.add(loc, bug);
	Random rand = new Random();
	Location random = new Location(rand.nextInt(10),rand.nextInt(10));
	world.add(random, buggy);
	buggy.turn();
	buggy.turn();
	world.add(new Location(2,3), flow);
	world.add(new Location(2,5), flower);
	for(int i = 0;i<10;i++) {
		for(int j = 0;j<10;j++) {
			world.add(new Location(i,j), new Flower());
		}
	}
}
private void show() {
	// TODO Auto-generated method stub
	JFrame frame = new JFrame();
	frame.setVisible(true);
	
}

public void add(Location loc, Actor occupant) {
	
}

}
