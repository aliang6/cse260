import java.util.Scanner;
import java.io.File;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

public class CountKeywords{
	public static void main(String[] args){
		String[] key = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "continue", "default", 
		"do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "if", "implements", "import", "instanceof", 
		"int", "interface", "long", "native", "new", "package", "private", "protected", "public", "return", "short", "static", 
		"strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "voltaile", "while"};
		ArrayList<String> keywords = new ArrayList<String>(Arrays.asList(key));
		int[] count = new int[keywords.size()];
		TreeSet<String> set = new TreeSet<String>();
		TreeSet<String> dupl = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of a java file:");
		String fileName = sc.next();
		boolean inCom = false;
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext()){
			String next = file.next();
			if(next.equals("/*")){
				inCom = true;
			}
			else if(next.equals("*/")){
				inCom = false;
			}
			else if(next.equals("//")){
				next = file.nextLine();
			}
			else if(!inCom && !next.substring(0,1).equals("\"")){
				if(keywords.contains(next)){
					count[keywords.indexOf(next)]++;
				}
			}
			
		}
		} catch(Exception e){
			System.out.println("File not found");
		}
	}
}