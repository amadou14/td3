package dp;

public class Singleton {
	private static final Singleton singleton;
	private int compteur ;
	
static {
	singleton = new Singleton();
}
private Singleton() {
	System.out.println("instaniation du singleton");
	
}
public static Singleton getInstance() {
	return singleton;
}
public void traiter(String name) throws InterruptedException {
	System.out.println("Traitement de la page"+name);
	for(int i = 1 ;i<=5; i++) {
		compteur+= 1;
		System.out.println(".."+compteur);
		//Thread.sleep(1000);
	}
	System.out.println("Fin du traitement de la tache name "+name +"compteur ="+compteur);
}

}
