import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

public class NumberOccurances{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
		System.out.print("Type the name or directory of a file: ");
		try{
			Scanner file = new Scanner(new File(sc.next()));
			while(true){
				int next = file.nextInt();
				if(next == 0){
					break;
				}
				else{
					if(numbers.containsValue(next)){
						numbers.replace(next, numbers.get(next));
					}
					else{
						numbers.put(next, 1);
					}
				}
			}
		} catch(Exception e){
			System.out.println("File not found");
		}
	}

}