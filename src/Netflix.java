
public class Netflix {
	public static void main(String[] args) {
		Movie harryPotter = new Movie("Harry Potter",4);
		Movie twilight = new Movie("Twilight",1);
		Movie theHobbit = new Movie("The Hobbit",3);
		Movie best = new Movie("The Best Day of my Life",5);
		Movie mom = new Movie("your Mom",-1);
		System.out.println(theHobbit.getTicketPrice());
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(harryPotter);
		queue.addMovie(twilight);
		queue.addMovie(theHobbit);
		queue.addMovie(best);
		queue.addMovie(mom);
		queue.printMovies();
		queue.sortMoviesByRating();
		
		System.out.println("The best movie is "+queue.getBestMovie());
		System.out.println("The worst movie is "+queue.getMovie(4));
	}
}
