package studio7;

public class rectangle {
	private int length;
	private int width;
	public rectangle(int l, int w) {
		this.length=l;
		this.width=w;
	}
public int area() {
	return this.length*this.width;
}
public int perimeter() {
	return 2*this.length+2*this.width;
}
public boolean isASquare(){
	if (this.length==this.width)
	{
		return true;
	}
	else 
	{
		return false;
	}
}
public boolean isSmaller(rectangle B) {
		return this.area()>B.area();
}
	public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
	public static void main(String[] args) {
		

	}

}
