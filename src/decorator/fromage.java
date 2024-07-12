package decorator;

public class fromage extends sandwichDecorator {

	public fromage(Sandwich sandwich) {
		super(sandwich);
}
	@Override
	public double getcost() {
		// TODO Auto-generated method stub
		return super.getcost()+ 2;
	}
	@Override
	public String getdescription() {
		// TODO Auto-generated method stub
		return super.getdescription()+ ",fromage";
	}
}