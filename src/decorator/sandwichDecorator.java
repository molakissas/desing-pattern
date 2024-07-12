package decorator;

abstract class  sandwichDecorator implements Sandwich {
private Sandwich sandwich;
public sandwichDecorator(Sandwich sandwich) {
	this.sandwich = sandwich;
}
@Override
public double getcost() {
	// TODO Auto-generated method stub
	return this.sandwich.getcost();
}
@Override
public String getdescription() {
	// TODO Auto-generated method stub
	return this.sandwich.getdescription();
}

}
