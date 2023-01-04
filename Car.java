
public class Car {

	public void ferrari() {
		 
		System.out.println("1.Ferrari.");
	}
	
	public void lamborghini( ) {
		
		System.out.println("2.Lamborghini.");
	}
	public void audi( ) {
		
		System.out.println("3.Audi.");
	}
	public void jeep() {
		
		System.out.println("4.Jeep.");
	}
	public void jaguar() {
		
		System.out.println("5.Jaguar.");
	}
	
	public static void main(String[] args) {
		System.out.println("Cars list");
		Car a= new Car();
		a.ferrari();
		a.lamborghini();
		a.audi();
		a.jeep();
		a.jaguar();
	}
}
