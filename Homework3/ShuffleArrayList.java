import java.util.ArrayList;

public class ShuffleArrayList{
	public static <E> void shuffle(E[] list){
		for(int i = 0; i < list.length; i++){
			int random = Math.random()*(list.length - 1);
			E temp = list[random];
			list[random] = list[i];
			list[i] = temp;
		}
	}
} 