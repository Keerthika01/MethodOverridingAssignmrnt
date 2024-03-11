package com.mfai;

public class Shapes {
public void circle() {
	System.out.println("This is circle having radius!!!");
}
public void square() {
	System.out.println("This is square having sides!!!");
}
public void rectangle() {
	System.out.println("This is rectangle having length and breadth");
}
}
class Perimeter extends Shapes{
	float radius,pi=3.14f,per;
	int area,length,width,perimeter;
	Perimeter(float r,int a,int l,int w){
		radius=r;
		area=a;
		length=l;
		width=w;
	}
	public void circle() {
		System.out.println("Calculating perimeter of Circle.....");
		per=2*pi*radius;
		System.out.println("Perimeter of cirlce:"+per);
	}
	public void square() {
		System.out.println("\nCalculating perimeter of Square.....");
		perimeter=4*area;
		System.out.println("Perimeter of square:"+perimeter);
	}
	public void rectangle() {
		System.out.println("\nCalculating perimeter of Rectangle.....");
		perimeter=2*length+2*width;
		System.out.println("Perimeter of rectangle:"+perimeter);
	}
}
class Example{
	public static void main(String args[]) {
		Shapes s=new Shapes();
		s.circle();
		s.square();
		s.rectangle();
		Perimeter p=new Perimeter(5.2f,4,5,6);
		p.circle();
		p.square();
		p.rectangle();
	}
}
