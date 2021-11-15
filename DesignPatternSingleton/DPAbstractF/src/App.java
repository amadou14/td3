
public class App {

	public static void main(String[] args) {
		// instanciation stattic 
		AbstractFactory  factory = new Factory();
		AbstractPulgin pulgin = factory.getInstance();
		pulgin.traitement();
	}

}
