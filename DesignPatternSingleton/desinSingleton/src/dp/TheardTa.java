package dp;

public class TheardTa extends Thread {
	private String task;
	public TheardTa(String task) {
		this.task = task ;
		
	}
	public void run() {
		Singleton s = Singleton.getInstance();
		try {
			s.traiter(task);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
