
public class StaticVariable {

	static int A = 55;
	static int B = 74;
	
	public void statement () {
		System.out.println(B);
	}
	
	

	public static void main(String[] args) {
		System.out.println("Static Variable");
		StaticVariable staticstatement = new StaticVariable();
		staticstatement.statement();
		int z = A+B;
		System.out.println(z+100);
		
	}
}
 