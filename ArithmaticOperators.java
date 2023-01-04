
public class ArithmaticOperators {

	public void addition() {

		int a = 100;
		int b = 150;
		int c = a + b;
		System.out.println("Addition:");
		System.out.println("The Sum of A is " + a);
		System.out.println("The Sum of B is " + b);
		System.out.println("Total value is " + c);
	}

	public void subtraction() {

		int A = 135;
		int B = 195;
		int C = A - B;
		System.out.println("Subtraction:");
		System.out.println("The Sum of A is " + A);
		System.out.println("The Sum of B is " + B);
		System.out.println("Total value is " + C);

	}

	public void multiplication() {

		int A = 185;
		int B = 276;
		int C = A * B;

		System.out.println("Multiplication:");
		System.out.println("The A is " + A);
		System.out.println("The B is " + B);
		System.out.println("Total value is " + C);
	}

	public void division() {

		int A = 751;
		int B = 25;
		int C = A / B;

		System.out.println("Division:");
		System.out.println("The A is " + A);
		System.out.println("The B is " + B);
		System.out.println("Total value is " + C);
	}

	public void modulus() {

		int A = 721;
		int B = 23;
		int C = A % B;

		System.out.println("Modulus:");
		System.out.println("The A is " + A);
		System.out.println("The B is " + B);
		System.out.println("Total value is " + C);
	}

	public void increment() {

		int A = 751;
		int B = 25;
		int C = ++A;
		int D = ++B;

		System.out.println("Increment:");
		System.out.println("The A is " + ++C);
		System.out.println("The B is " + ++D);

	}

	public void decrement() {

		int A = 983;
		int B = 499;
		int C = --A;
		int D = --B;

		System.out.println("Decrement:");
		System.out.println("The A is " + C--);
		System.out.println("The B is " + --D);

	}

	public static void main(String[] args) {
		System.out.println("Arithmatic Operators list:");
		ArithmaticOperators a = new ArithmaticOperators();
		a.addition();
		a.subtraction();
		a.multiplication();
		a.division();
		a.modulus();
		a.increment();
		a.decrement();
	}
}
