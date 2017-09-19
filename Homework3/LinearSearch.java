import java.util.ArrayList;

public class LinearSearch{
	public static<E extends Comparable<E>> int linearSearch(E[] list, E key){
		int ret = -1;
		for(int i = 0; 0 < list.length; i++){
			if(list[i].compareTo(key) == 0){
				ret = i;
				break;
			}
		}
		return ret;
	}
	
}