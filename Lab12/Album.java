import java.util.*;

public class Album{
	String name;
	List<Track> tracks;

	public Album(String name){
		this.name = name;
	}

	public Album(String name, List<Track> tracks){
		this.name = name;
		this.tracks = tracks;
	}

	public List<Track> getTracks(){
		return tracks;
	}

	public void addTracks(List<Track> tracks){
		this.tracks = tracks;
	}

	public String toString(){
		return name;
	}
}