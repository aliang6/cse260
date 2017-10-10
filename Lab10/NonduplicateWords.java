import java.util.Scanner;
import java.io.File;
import java.util.TreeSet;

public class NonduplicateWords{
	public static void main(String[] args){
		TreeSet<String> set = new TreeSet<String>();
		TreeSet<String> dupl = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of a text file:");
		String fileName = sc.next();
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext()){
				String next = file.next();
				if(set.contains(next)){
					dupl.add(next);
					set.remove(next);
				}
				else if(!dupl.contains(next)){
					set.add(next);
				}
			}
			System.out.println(set.toString());
		} catch(Exception e){
			System.out.println("File not found");
		}
	}
}