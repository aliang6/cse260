public class ComplexMatrix<> extends GenericMatrix<Complex>{

	protected Complex add(Complex one, Complex two){
		return new Complex(one.getRealPart() + two.getRealPart(), one.getImaginaryPart() + two.getImaginaryPart());
	}

	protected Complex multiply(Complex one, Complex two){
		return new Complex(one.getRealPart()*two.getRealPart() - one.getImaginaryPart()*two.getImaginaryPart(), one.getImaginaryPart()*two.getRealPart() + one.getRealPart()*two.getImaginaryPart());
	}
	
	protected Complex zero(){
		return new Complex(0, 0);
	}
}