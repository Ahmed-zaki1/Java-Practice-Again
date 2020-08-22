package Com.Opps.Method;

public class NewKeywordMethod {
//Creating Object Via New Keyword
void message() {
	System.out.println("Hello");
}
void recieved() {
	System.out.println("Message recieved");
}
void reply() {
	System.out.println("Thanks for your message");
}
public static void main(String[] args) {
	NewKeywordMethod obj=new NewKeywordMethod();
	obj.message();
	obj.recieved();
	obj.reply();
}
}
