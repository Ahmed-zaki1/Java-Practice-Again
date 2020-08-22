package Com.Opps.PolyMorphism;

public class OverLoadingPoly {
void add(long a) {
	System.out.println("1 "+a);
}
void add(double a) {
	System.out.println("2 "+a);
	
}
public static void main(String[] args) {
	OverLoadingPoly obj=new OverLoadingPoly();
	obj.add(11);
}
}
