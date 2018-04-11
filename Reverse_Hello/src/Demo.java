
public class Demo extends Thread{
	
	int x=10;
	
	public static void main(String[] args) {
		
		
		
		//Nishka n=new Nishka(1);
		//n.start();
		P y=new P();
		y.start();
		for(int i=0;i<10;i++) {
			Nishka2 x=new Nishka2(y);
			x.start();
		}
		
	}

	
	
	

}
