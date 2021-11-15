package dp;

public class App {

	public static void main(String[] args) {
		for (int i = 1; i<=5 ;i++) {
		Singleton s =Singleton.getInstance();
		try {
			s.traiter("T"+1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
}
