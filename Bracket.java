import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Bracket {
	private ArrayList<Region> regions = new ArrayList<Region>(); 
	private ArrayList<Team> temp = new ArrayList<Team>();
	public void main(String[] args) {
		System.out.println(print(regions));
	}

	public String print(ArrayList<Region> regionz){
		for (int i = 0; i<regionz.size(); i++) {			
			for (int z = 0; z<regionz.get(i).get().size(); z++) {
					regionz.get(i).get().get(z).name();								
			}
		}
	}
	public Bracket(ArrayList<Team> teams) {
		ArrayList<Team> temp = new ArrayList<Team>();

		for (int i = 0, z = 0; i <= 16; i++) {			
			temp.add(teams.get(i));

			if (i==16 && z<5) {
				Region region = new Region(temp);	
				regions.add(region);
				temp = new ArrayList<Team>();
				z++;
				i=0;
			}
		}
		
	}

}