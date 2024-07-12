package observer;

public class execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student aya = new Student( "aya");
       Student reda = new Student( "reda");
       Student saida = new Student( "saida");
       Student abderahmane = new Student( "abderahmane");
       
       
       course java = new course( "course java");
		
       java.subscribe(aya);
       java.subscribe(reda);
       java.subscribe(saida);
       java.subscribe(abderahmane);
       java.subscribe(saida);
       
       
       java.setAvailability(false);
	}

}
