public class MyInteger{
	private int value;

	public MyInteger(int val){
		value = val;
	}

	public int getValue(){
		return value;
	}

	public boolean isEven(){
		return value % 2 == 0;
	}

	public boolean isOdd(){
		return value % 2 == 1;
	}

	public boolean isPrime(){
		boolean ret = true;
		for(int i = 2; i < value; i++){
			if (value % i == 0){
				ret = false;
				break;
			}
		}
		return ret;
	}

	public static boolean isEven(int inp){
		return inp % 2 == 0;
	}

	public static boolean isOdd(int inp){
		return inp % 2 == 1;
	}

	public static boolean isPrime(int inp){
		boolean ret = true;
		for(int i = 2; i < inp; i++){
			if (inp % i == 0){
				ret = false;
				break;
			}
		}
		return ret;
	}

	public boolean equals(int inp){
		return inp == value;
	}

	public boolean equals(MyInteger other){
		return other.getValue() == value;
	}

}