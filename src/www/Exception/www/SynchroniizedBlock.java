package www.Exception.www;


class Warrior extends Thread{
	String res1="CHicken Briyani";
	String res2="Pepper Chicken";
	String res3="Gobi Manchurian";
	
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("akash")) {
			akashStarted();
		}
		else {
		
			kishoreStartes();
		}
	}
	
	private void akashStarted(){
		
		try {
			
			synchronized (res1) {
				System.out.println("akash started to eat "+res1);
				Thread.sleep(4000);
				synchronized (res2) {
				System.out.println("akash started to eat "+res2);
				Thread.sleep(4000);
				synchronized (res3) {
				System.out.println("akash started to eat "+res3);
				Thread.sleep(4000);
				
				
			}
		}
	}
		}
		catch(Exception e) {
		e.printStackTrace();	
		}
		}
	
		private void kishoreStartes(){
			
			try {
				
				synchronized (res1) {
					System.out.println("Kishore started to eat "+res1);
					Thread.sleep(4000);
					synchronized (res2) {
					System.out.println("Kishore started to eat "+res2);
					Thread.sleep(4000);
					synchronized (res3) {
						System.out.println("Kishore started to eat "+res3);
						Thread.sleep(4000);
					}
					}
					}
					}
				catch(Exception e) {
					e.printStackTrace();	
				}
			}
		
		
				
				
				
				
				
				
				}

public class SynchroniizedBlock {

	public static void main(String[] args) {
		Warrior w1=new Warrior();
		w1.setName("akash");
		Warrior w2=new Warrior();
		w2.setName("Kishore");
		w1.start();
		w2.start();
		
	}

}
