
public class Addition {
	
	static int e = 10;
	public void sub() {
		
		int a = 10;     //Addition
		int b = 5;
	      int c = a-b+e;
		final int w = 10;
		System.out.println("Subtraction Method:");
		System.out.println("A = 10");
		System.out.println("B = 5");
	
		System.out.print("The Sub = " +c+w);
		
	}
	final int v= 10; //Final Variable
	
	public static void main(String[] args) {
		
		System.out.println("Addition Method:");
		int a = 10;
		int b = 20;
		int c = a+b+e;
	
		System.out.println("A = 10"); 
		System.out.println("B = 10"); 
		System.out.println("The Sum = " + c ); 
		
		Addition sub= new Addition();
		sub.sub();
	}
	
}
