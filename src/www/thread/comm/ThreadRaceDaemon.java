package www.thread.comm;


class Microsoft1 extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("typing")) {
			typing();
	}
		else if(Thread.currentThread().getName().equals("checking")) {
			checking();
		}
		else {
			saving();
	}
	}
	
	
	//Primary task
    public void typing() {
    	try {
    		for(int i=1; i<=5; i++) {
    			System.out.println("typing....");
    			Thread.sleep(5000);
    		}
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    //Secondary task
    public void checking() {
    	try {
    		for(; ;) //Infinite for loop
    		{
    			System.out.println("checking....");
    			Thread.sleep(4000);
    		}
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    //Secondary task
    public void saving() {
    	try {
    		for(; ;) //infinite for loop
    		{
    			System.out.println("saving....");
    			Thread.sleep(4000);
    		}
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}
public class ThreadRaceDaemon {
	public static void main(String[] args) {
       Microsoft1 ms1 = new Microsoft1();
       ms1.setName("typing");
       Microsoft1 ms2 = new Microsoft1();
       ms2.setName("checking");
       Microsoft1 ms3 = new Microsoft1();
       ms3.setName("saving");
       
       ms2.setDaemon(true);
       ms3.setDaemon(true);
       
       ms2.setPriority(8);//assign the priority more than 7 for secondary threads
       ms3.setPriority(9);//assign the priority more than 7 for secondary threads
       
       
       ms1.start();
       ms2.start();
       ms3.start();
		
       
	}

}


//typing....
//checking....
//saving....
//checking....
//typing....
//saving....
//checking....
//typing....
//saving....
//checking....
//typing....
//saving....
//typing....
//checking....
//saving....
//checking....
