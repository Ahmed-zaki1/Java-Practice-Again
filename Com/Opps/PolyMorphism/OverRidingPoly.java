package Com.Opps.PolyMorphism;

class A {
void run() {
	System.out.println("Ahmed zaki");
}}
public class OverRidingPoly extends A {
	void run() {
		System.out.println("Slow");
	}
	public static void main(String[] args) {
		A obj=new OverRidingPoly();
		obj.run();
		
	
}
}
