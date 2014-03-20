import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Bracket {
	private ArrayList<Region> region; 
	public Bracket(ArrayList<Team> teams) {
		ArrayList<Team> temp = new ArrayList<Team>();
		for (int i = 0, z = 0; i <= 16; i++) {			
			temp.add(teams.get(i));			
			if (i==16 && z<5) {
				region = new ArrayList<Region>(temp);
				temp = new ArrayList<Team>();
				z++;
				i=0;
			}
		}
		
	}

}