package studio7;

public class Fraction {
private int numerator;
private int denominator;
public Fraction(int n, int d) {
	this.numerator=n;
	this.denominator=d;
}
public int getNumerator() {
	return numerator;
}
public void setNumerator(int numerator) {
	this.numerator = numerator;
}
public int getDenominator() {
	return denominator;
}
public void setDenominator(int denominator) {
	this.denominator = denominator;
}
public double addition(Fraction b) {
	return (this.numerator*b.getDenominator())+(this.denominator*b.numerator)/(this.denominator*b.getDenominator());
}
public double multiplication(Fraction b) {
	return (this.numerator*b.getNumerator())/(this.denominator*b.getDenominator());
}
public double recipricol() {
	return this.denominator/this.numerator;
}
public static int gcd(int p, int q) {
	if (q==0)
	{
		return p;
	}
	else
	{
		return gcd(q,p%q);
	}
}
public double simplification() {
int factor=gcd(this.numerator,this.denominator);
return (this.numerator/factor)/(this.denominator/factor);
}
		
		
}

