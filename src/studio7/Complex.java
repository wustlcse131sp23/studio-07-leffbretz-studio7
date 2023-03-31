package studio7;

public class Complex {
private double real;
private double imaginary;
public Complex (double r, double c) {
	this.real=r;
	this.imaginary=c;
}

	
public double getReal() {
	return real;
}


public void setReal(double real) {
	this.real = real;
}


public double getImaginary() {
	return imaginary;
}


public void setImaginary(double imaginary) {
	this.imaginary = imaginary;
}


public Complex addition(Complex b) {
return Complex(this.real+ b.getReal(),this.imaginary+b.getImaginary());
}
}
