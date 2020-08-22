package Com.Opps.Method;

public class ReferenceVariable {
//Creating Object By Using Reference Variable
String Message;
String Reply;
public static void main(String[] args) {
	ReferenceVariable obj=new ReferenceVariable();
	obj.Message="Hello";
	obj.Reply="Thanks";
	System.out.println(obj.Message+" "+obj.Reply);
	
}
}
