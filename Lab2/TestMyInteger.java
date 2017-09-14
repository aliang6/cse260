public class TestMyInteger{
	public static void main(String[] args){
		MyInteger intOne = new MyInteger(29);
		MyInteger intTwo = new MyInteger(26);
		System.out.println("Integer one is " + intOne.getValue());
		System.out.println("Integer two is " + intTwo.getValue());
		System.out.println("Integer one is even: " + intOne.isEven());
		System.out.println("Integer two is even: " + intTwo.isEven());
		System.out.println("Integer one is odd: " + intOne.isOdd());
		System.out.println("Integer two is odd: " + intTwo.isOdd());
		System.out.println("Integer one is prime: " + intOne.isPrime());
		System.out.println("Integer two is prime: " + intTwo.isPrime());
		System.out.println("1 is even: " + intOne.isEven(1));
		System.out.println("1 is odd: " + intOne.isOdd(1));	
		System.out.println("1 is prime: " + intOne.isPrime(1));
		System.out.println("Integer one is equal to integer two: " + intOne.equals(intTwo));
		System.out.println("Integer one is equal to 25: " + intOne.equals(25));
	}
}