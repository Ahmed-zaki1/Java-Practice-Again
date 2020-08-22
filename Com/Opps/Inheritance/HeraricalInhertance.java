package Com.Opps.Inheritance;

class D {
void run() {
	System.out.println("Ahmed zaki");
}}
class E extends D{
	void stop() {
		System.out.println("Stopped");
	}
}
public class HeraricalInhertance extends D {
	void walk() {
		System.out.println("Slow");
	}
	public static void main(String[] args) {
		HeraricalInhertance obj=new HeraricalInhertance();
		obj.run();
		obj.walk();
		E obj1=new E();
		obj1.stop();
		obj1.run();
	
}
}
