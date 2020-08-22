package Com.Opps.Inheritance;

class A {
void run() {
	System.out.println("Ahmed zaki");
}}
public class SingleInheritence extends A {
	void walk() {
		System.out.println("Slow");
	}
	public static void main(String[] args) {
		SingleInheritence obj=new SingleInheritence();
		obj.run();
		obj.walk();
	
}
}
