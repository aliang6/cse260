import java.util.HashSet;

public class SetOperations{
	public static void main(String[] args){
		//String[] arrOne = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
		String[] arrTwo = {"George", "Katie", "Kevin", "Michelle", "Ryan"};
		HashSet<String> one = new HashSet<String>();
		one.add("George");
		one.add("Jim");
		one.add("John");
		one.add("Blake");
		one.add("Kevin");
		one.add("Michael");
		HashSet<String> two = new HashSet<String>();
		two.add("George");
		two.add("Katie");
		two.add("Kevin");
		two.add("Michelle");
		two.add("Ryan");
		HashSet<String> union = new HashSet<String>(one);
		for(String x : two){
			if(!union.contains(x)){
				union.add(x);
			}
		}
		System.out.println("Union is " + union.toString());
		HashSet<String> intersection = new HashSet<String>();
		for(String x : one){
			if(two.contains(x)){
				intersection.add(x);
			}
		}
		System.out.println("Intersection is " + intersection.toString());
		HashSet<String> difference = new HashSet<String>(two);
		for(String x : intersection){
			difference.remove(x);
		}
		System.out.println("HashSet two - HashSet one is " + difference);
	}
}