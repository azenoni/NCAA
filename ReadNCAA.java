import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ReadNCAA {
	ArrayList<Team> teams;

	public static void main(String[] args)  throws FileNotFoundException {
		teams = new ArrayList<Team>();
		Scanner reader = new Scanner(new File("ncaa2014.csv"));
		

		while (reader.hasNextLine()) {
			String next = reader.nextLine();
			String[] values = next.split(",");
			for (int i = 0; i < values.length -2; i+= 3) {
				Team team = new Team(values[i],Integer.parseInt(values[i+1]),Double.parseDouble(values[i+2]));
				teams.add(team);
			}
				
			
			

			//System.out.println();
		}
		for (Team x : teams) {
			System.out.print(x.name() + " ");
			System.out.print(x.seed() + " ");
			System.out.print(x.wp() + " ");
			System.out.println();
		}
	}

	public ArrayList<Team> getTeams() {
		return this.teams;
	}

}