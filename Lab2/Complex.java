public class Complex{
	private double a; // Real
	private double b; // Imaginary
	
	public Complex(){
		a = 0;
		b = 0;
	}

	public Complex(double a){
		this.a = a;
		b = 0;
	}

	public Complex(double a, double b){
		this.a = a;
		this.b = b;
	}

	public double getRealPart(){
		return a;
	}

	public double getImaginaryPart(){
		return b;
	}

	public Complex add(Complex other){
		return new Complex(a + other.getRealPart(), b + other.getImaginaryPart());
	}

	public Complex subtract(Complex other){
		return new Complex(a - other.getRealPart(), b - other.getImaginaryPart());
	}

	public Complex multiply(Complex other){
		return new Complex(a*other.getRealPart() - b*other.getImaginaryPart(), b*other.getRealPart() + a*other.getImaginaryPart());
	}

	public Complex divide(Complex other){
		double denom = Math.pow(other.getRealPart(), 2) + Math.pow(other.getImaginaryPart(), 2);
		double newReal = (a*other.getRealPart() + b*other.getImaginaryPart())/denom;
		double newImag = (b*other.getRealPart() - a*other.getImaginaryPart())/denom;
		return new Complex(newReal, newImag);
	}

	public String toString(){
		String ret = "(" + a + " " + b + "i)";
		return ret;
	}
}