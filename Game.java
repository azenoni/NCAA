public class Game {

	public Game(double win1, double win2, String team1, String team2) {
		double winP = (win1 - (win1*win2)) / (win1 + win2 - (2*win1*win2));
	}

}