package decorator;

public class execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sandwich mysandwich = new fromage(new viande(new basicsandwich()));
		
		
		
		System.out.println("description = " + mysandwich.getdescription());
		System.out.println("prix = " + mysandwich.getcost());
	}

}
