package Com.Opps.Method;

public class ObjectViaMethod {
//Creating Object By Using Method
	String Name;
	int Age;
	void details(String N , int A) {
		Name=N;
		Age=A;
	}
	void print() {
		System.out.println(Name+" "+Age);
	}
	public static void main(String[] args) {
		ObjectViaMethod obj=new ObjectViaMethod();
		obj.details("Ahmed", 21);
		obj.print();
	}
}
