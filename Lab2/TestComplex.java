import java.util.Scanner;

public class TestComplex{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for the real component of complex number one");
		double real = scanner.nextDouble();
		System.out.println("Enter a number for the imaginary component of complex number one");
		double imag = scanner.nextDouble();
		Complex one = new Complex(real, imag);
		System.out.println("Enter a number for the real component of complex number two");
		real = scanner.nextDouble();
		System.out.println("Enter a number for the imaginary component of complex number two");
		imag = scanner.nextDouble();
		Complex two = new Complex(real, imag);
		System.out.println("One: " + one.toString() + "\nTwo: " + two.toString());
		Complex add = one.add(two);
		Complex sub = one.subtract(two);
		Complex mult = one.multiply(two);
		Complex div = one.divide(two);
		System.out.println("One + Two = " + add.toString());
		System.out.println("One - Two = " + sub.toString());
		System.out.println("One * Two = " + mult.toString());
		System.out.println("One / Two = " + div.toString());

	}
}