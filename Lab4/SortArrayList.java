import java.util.ArrayList;

public class SortArrayList{
	public static <E extends Comparable<E>> void sort(ArrayList<E> list){
		if(list.size() <= 1){
			return;
		}
		for(int i = 0; i < list.size() - 1; i++){
			int minIndex = i; 
			for(int j = 1; j < list.size(); j++){
				if(list.get(j).compareTo(list.get(minIndex)) < 0){
					minIndex = j;
				}
			}

			if(minIndex != i){
				list.swap(i, minIndex);
			}
		}
	}
}