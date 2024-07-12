package desingpattern;
 




public class singleton {
    // Champ statique pour contenir l'unique instance de la classe
    private static singleton instance;

    // Constructeur privé pour empêcher l'instantiation directe
    private singleton() {
        // Initialisation de la classe
    }

    // Méthode publique statique pour fournir l'accès à l'instance unique
    public static singleton getInstance() {
        if (instance == null) {
            instance = new singleton();
        }
        return instance;
    }

    // Autres méthodes de la classe
    public void doSomething() {
        System.out.println("Singleton instance doing something.");
    }}