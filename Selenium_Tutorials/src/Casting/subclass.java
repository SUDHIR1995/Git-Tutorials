package Casting;

public class subclass extends superclass{

	public void bike() {
		System.out.println("bike");
		
		
	}
	public static void main(String[] args) {
		superclass k=new subclass();
		subclass g=(subclass) k;
		
		//acess upcasting
		k.home();
		k.car();
//		k.bike();        not visibale
		
		//acess downcasting
		g.bike();
		g.home();
		g.car();
	}

}
