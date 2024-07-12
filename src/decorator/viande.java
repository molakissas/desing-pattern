package decorator;

public class viande extends sandwichDecorator {
public viande(Sandwich sandwich) {
	super(sandwich);
}

@Override
public double getcost() {
	// TODO Auto-generated method stub
	return super.getcost()+ 6;
}

@Override
public String getdescription() {
	// TODO Auto-generated method stub
	return super.getdescription()+ ",viande";
}

	
}
