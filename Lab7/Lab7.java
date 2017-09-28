import java.util.*;

public class Lab7{

	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<Integer>();
		Random random = new Random();
		for(int i = 0; i < 5000; i++){
			list.push((Integer)(random.nextInt(50000)));
		}

		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 5000; i++){
			list.get(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("The time required to get() all 5000 values is " + (endTime - startTime) + " milliseconds");

		Iterator iterator = list.iterator();
		startTime = System.currentTimeMillis();
		while(iterator.hasNext()){
			iterator.next();
		}
		endTime = System.currentTimeMillis();
		System.out.println("The time required to iterate through all 5000 values is " + (endTime - startTime) + " milliseconds");

		list = new LinkedList<Integer>();
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 5000; i++){
			list.push((Integer)(random.nextInt(50000)));
		}
		for(int i = 0; i < 5000; i++){
			list.get(i);
		}
		for(int i = 0; i < 5000; i++){
			list.pop();
		}
		endTime = System.currentTimeMillis();
		System.out.println("The time required store, traverse, and remove 5000 values from a linked list is " + (endTime - startTime) + " milliseconds");

		ArrayList<Integer> arr = new ArrayList<Integer>();
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 5000; i++){
			arr.add((Integer)(random.nextInt(50000)));
		}
		for(int i = 0; i < 5000; i++){
			arr.get(i);
		}
		for(int i = 0; i < 5000; i++){
			arr.remove(0);
		}
		endTime = System.currentTimeMillis();
		System.out.println("The time required store, traverse, and remove 5000 values from an array list is " + (endTime - startTime) + " milliseconds");

		int[] array = new int[5000];
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 5000; i++){
			array[i] = random.nextInt(50000);
		}
		int ret;
		for(int i = 0; i < 5000; i++){
			ret = array[i];
		}
		for(int i = 0; i < 5000; i++){
			array[i] = 0;
		}
		endTime = System.currentTimeMillis();
		System.out.println("The time required store, traverse, and remove 5000 values from an array is " + (endTime - startTime) + " milliseconds");
		
		PriorityQueue one = new PriorityQueue(6);
		PriorityQueue two = new PriorityQueue(5);
		one.add("George");
		one.add("Jim");
		one.add("John");
		one.add("Blake");
		one.add("Kevin");
		one.add("Michael");
		two.add("George");
		two.add("Katie");
		two.add("Kevin");
		two.add("Michelle");
		two.add("Ryan");
		PriorityQueue union = new PriorityQueue(11);
		union.addAll(one);
		union.addAll(two);
		System.out.println(union);
		PriorityQueue intersection = new PriorityQueue();
		intersection.addAll(one);
		intersection.retainAll(two);
		System.out.println(intersection);
		PriorityQueue difference = new PriorityQueue();
		difference.addAll(one);
		difference.removeAll(two);
		System.out.println(difference);

	}

}