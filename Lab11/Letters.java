import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

public class Letters{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> vowel = new HashMap<Character, Integer>();
		HashMap<Character, Integer> consonant = new HashMap<Character, Integer>();
		System.out.print("Type the name or directory of a file: ");
		try{
			Scanner file = new Scanner(new File(sc.next()));
			while(file.hasNext()){
				String next = file.next();
				for(int i = 0; i < next.length(); i++){
					char nextChar = next.charAt(i);
					if(nextChar == 'A' || nextChar == 'E' || nextChar == 'I' || nextChar == 'O' || nextChar == 'U'){
						if(vowel.containsValue(nextChar)){
							vowel.replace(nextChar,vowel.get(nextChar));
						}
						else{
							vowel.put(nextChar, 1);
						}
					}
					else{
						if(consonant.containsValue(nextChar)){
							consonant.replace(nextChar,vowel.get(nextChar));
						}
						else{
							consonant.put(nextChar, 1);
						}
					}
				}
			}
		} catch(Exception e){
			System.out.println("File not found");
		}
	}

}