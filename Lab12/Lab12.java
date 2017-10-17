import java.util.*;
import java.io.*;
import java.lang.String;

public class Lab12{

	public static List<String> questionTwo(List<String> list){
		ArrayList<String> newList = new ArrayList<String>();
		list.stream()
		.forEach(e -> newList.add(e.trim()));
		return newList;
	}

	public static void main(String[] args){
		SortedSet<String> set = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		List<String> list = Arrays.asList(args);
		list.stream()
		.forEach(e -> set.add(e));
		System.out.println(set.toString());

		list = new ArrayList<String>(set);
		list = questionTwo(list);
		System.out.println(list.toString());

		ArrayList<Person> roster = new ArrayList<Person>();
		roster.add(new Person("John", 10, 0, "john"));
		roster.add(new Person("Josh", 11, 0, "josh"));
		roster.add(new Person("Sara", 12, 1, "sara"));
		roster.add(new Person("Beth", 13, 1, "beth"));
		roster.stream()
		.filter(e -> e.getGender() == Person.Sex.MALE)
		.forEach(e -> System.out.println(e.getName()));

		Album albumOne = new Album("Album One");
		Album albumTwo = new Album("Album Two");
		Album albumThree = new Album("Album Three");

		List<Track> tracks = new ArrayList<Track>();
		tracks.add(new Track("one", 1, albumOne));
		tracks.add(new Track("two", 1, albumOne));
		tracks.add(new Track("three", 1, albumOne));
		tracks.add(new Track("favSongOne", 4, albumOne));

		albumOne.addTracks(tracks);

		tracks.clear();
		tracks.add(new Track("one", 1, albumTwo));
		tracks.add(new Track("two", 1, albumTwo));
		tracks.add(new Track("three", 1, albumTwo));
		tracks.add(new Track("favSongTwo", 4, albumTwo));

		albumTwo.addTracks(tracks);

		tracks.clear();
		tracks.add(new Track("one", 1, albumThree));
		tracks.add(new Track("two", 1, albumThree));
		tracks.add(new Track("three", 1, albumThree));
		tracks.add(new Track("favSongThree", 5, albumThree));

		albumThree.addTracks(tracks);

		List<Album> albums = new ArrayList<Album>();
		albums.add(albumOne);
		albums.add(albumTwo);
		albums.add(albumThree);

		ArrayList<Album> favs = albums.stream()
		.filter(e -> e.getRating() >= 4)
		//.sorted()
		.collect(Collectors.groupingBy(Tracks::getAlbum));

		System.out.println(favs.toString());
	}
}