
public class Nishka2 extends Thread{
	
	public P p;
	
	public Nishka2(P p) {
		this.p=p;
	}
	
	@Override
	public void run() {
		
		p.increments();
	}

}
