
public class Nishka extends Thread{
	
	
	private int num;
	public Nishka(int num) {
		this.num=num;
	}
	
	@Override
	public void run() {
		if(num==51) {
			return;
		}
		Nishka x=new Nishka(num+1);
		x.start();
		try {
			x.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello Thread-"+num);
	}

}
