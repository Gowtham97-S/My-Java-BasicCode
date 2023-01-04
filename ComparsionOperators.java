
public class ComparsionOperators {

	public void equalTo() {

		int A = 5;
		int B = 8;

		System.out.println(A == B);

	}

	public void notEqualTo() {

		int A = 5;
		int B = 8;
		System.out.println(A != B);
	}

	public void greaterThan() {

		int A = 95;
		int B = 100;

		System.out.println(A > B);

	}

	public void lesserThan() {

		int A = 371;
		int B = 100;

		System.out.println(A < B);

	}

	public void greaterThanOrEqualTo() {

		int A = 275;
		int B = 255;

		System.out.println(A >= B);

	}

	public void lesserThanOrEqualTo() {

		int A = 275;
		int B = 275;

		System.out.println(A <= B);

	}

	public static void main(String[] args) {
		System.out.println("COMPARSION OPERATORS :");
		ComparsionOperators a = new ComparsionOperators();
		a.equalTo();
		a.notEqualTo();
		a.greaterThan();
		a.lesserThan();
		a.greaterThanOrEqualTo();
		a.lesserThanOrEqualTo();
	}

}
