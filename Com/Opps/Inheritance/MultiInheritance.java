package Com.Opps.Inheritance;

class B {
void run() {
	System.out.println("Ahmed zaki");
}}
class C extends B{
	void stop() {
		System.out.println("Stopped");
	}
}
public class MultiInheritance extends C {
	void walk() {
		System.out.println("Slow");
	}
	public static void main(String[] args) {
		MultiInheritance obj=new MultiInheritance();
		obj.run();
		obj.stop();
		obj.walk();
	
}
}
