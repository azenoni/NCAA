import java.util.ArrayList;
public class Region {
	private ArrayList<Team> teams = new ArrayList<Team>();
	public Region(ArrayList<Team> teams) {
		this.teams = teams;
	}
	public ArrayList<Team> get(){
		return teams;
	}
}