public class Track{
	String name;
	int rating;
	Album album;

	public Track(String name, int rating, Album album){
		this.name = name;
		this.rating = rating;
		this.album = album;
	}

	public int getRating(){
		return rating;
	}

	public Album getAlbum(){
		return album;
	}
}