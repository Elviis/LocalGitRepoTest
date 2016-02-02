package ca.sheridancollege;

public class Counter implements Runnable {

	private String name;
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " is at " + i);
			try {
				Thread.sleep((int)Math.random() * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public Counter(String name) {
		this.name = name;
	}

}
