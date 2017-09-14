public class TestMyPoint{
	public static void main(String[] args){
		MyPoint one = new MyPoint();
		MyPoint two = new MyPoint(10, 30.5);
		System.out.println("The distance between MyPoint one and MyPoint two is " + one.distance(two));
	}
}