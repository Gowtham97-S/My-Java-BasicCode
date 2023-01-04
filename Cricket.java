
public class Cricket {

	public void cricketplayers( ) {
		
		System.out.println("1.MS Dhoni."
				         +  " 2.Virat Kohil."
				         +  " 3.Sachin."
				         +  " 4.Yuvaraj Singh."
				         +  " 5.Raina."
				      );
	}
	
	public static void main(String[] args) {
		
		System.out.println("Cricket Player List");
		Cricket a= new Cricket();
		a.cricketplayers();
	}
}
