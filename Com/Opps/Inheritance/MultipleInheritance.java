package Com.Opps.Inheritance;

interface H{
	default void Runner() {
		System.out.println("Running");
	}}
	interface I{
		default void Stopper() {
			System.out.println("Stopper");
		}
	
}
public class MultipleInheritance implements H,I {
 void Green() {
	 System.out.println("Green Light Start Running");
 }
 public static void main(String[] args) {
	MultipleInheritance obj=new MultipleInheritance();
	obj.Stopper();
	obj.Green();
	obj.Runner();
	
			
}
}
