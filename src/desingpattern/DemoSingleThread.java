package desingpattern;
//import desingpattern.*;

public class DemoSingleThread {
	  public static void main(String[] args) {
	        // Accès à l'instance unique de la classe Singleton
	       singleton  Singleton = singleton.getInstance();
	        Singleton.doSomething();

	        // Vérification que deux appels retournent la même instance
	        singleton anotherSingleton = singleton.getInstance();
	        System.out.println(Singleton == anotherSingleton);  // Doit afficher "true"
	    }
}
