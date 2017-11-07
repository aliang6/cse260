import java.lang.Thread;

public class SyncThread{
	public static void main(String[] args){
		Thread[] list = new Thread[]
		for(int i = 0; i < 1000, i++){
			list[i] = new Thread();


	}

	static class AddOne implements Runnable{
		public void run(){
			
		}
	}

	static class IntegerWrapper{
		int sum;
		IntegerWrapper(){
			sum = 0;
		}
		public void addOne(){
			sum++;
		}
	}

}