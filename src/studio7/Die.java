package studio7;

public class Die {
private int number;
public Die (int n) {
	this.number=n;
}
public int random() {
	return (int) (Math.random()*this.number)+1;
	
}
}
