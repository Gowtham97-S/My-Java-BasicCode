
/*public class GlobalVariable {

    int A =754;
	int B =658;
	
	public void EqualTo() {
		
		
		System.out.println(A==B);
		
	}
	public void notEqualTo() {

		System.out.println(A!=B);
		
	}
	public static void main(String[] args) {
		System.out.println("Global Variable Method");
		GlobalVariable globalVariable= new GlobalVariable();
		globalVariable.EqualTo();
		globalVariable.notEqualTo();
		int x = 10 *;
	}
}*/
public class GlobalVariable {
	
	int a=10;
	int b=20;

	public void add() {
		
		int c=a+b;
		System.out.println(c);
		
	
	
	}
	
	
	public void mul() {
	
		int d=a*b; 	
		System.out.println(d);
	}

	
	public static void main(String[] args) {
		
		GlobalVariable globalVariable=new GlobalVariable();
		
		System.out.println(globalVariable.a * 10);
		
		int x=10*globalVariable.a;
		
	}

}