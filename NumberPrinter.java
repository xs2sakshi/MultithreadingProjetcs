

public class NumberPrinter implements Runnable{

	int num;
	public NumberPrinter() {
		
		// TODO Auto-generated constructor stub
	}

public NumberPrinter(int num) {
		
	this.num=num;
		// TODO Auto-generated constructor stub
	}

@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println(num);
	
}
}
