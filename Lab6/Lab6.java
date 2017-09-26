import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.io.File;
import java.io.FileNotFoundException;

public class Lab6{

	public static void alphabetize(File file){
		ArrayList<String> words = new ArrayList<String>();
		try{
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()){
				words.add(scanner.next());
			}
			Collections.sort(words);
			System.out.println(words);
		}
		catch (FileNotFoundException e){
			System.err.println("File was not found");
		}
		
	}

	public static LinkedList<Integer> storeNum(int input, LinkedList<Integer> list){
		if(list.size() == 0){
			list.add(input);
		}
		else{
			int x = 0;
			while(x < list.size() && list.get(x) >= input){
				x++;
			}
			list.add(x, input);
		}
		String sorted = "Sorted: ";
		for(int i = 0; i < list.size(); i++){
			sorted += list.get(i) + " ";
		}
		System.out.println(sorted);
		String reversed = "Reversed: ";
		for(int i = list.size() - 1; i >= 0; i--){
			reversed += list.get(i) + " ";
		}
		System.out.println(reversed);
		return list;
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("Enter the name of a file");
		String fileName = scanner.next();
		try{
			File file = new File(fileName);
			alphabetize(file);
		}
		catch (NullPointerException e){
			System.err.println("Invalid file name");
		}*/

		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < 5; i++){
			System.out.println("Print a number");
			list = storeNum(scanner.nextInt(), list);
		}
	}

}