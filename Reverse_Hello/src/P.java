
public class P extends Thread{
	
	int x=0;
	
     public void increments() {
		
		for(int i=0;i<10;i++) {
			x++;
		}
		
	}
	
	@Override
	public void run() {
	     try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     System.out.println(x);
		
	}
	
	

}
