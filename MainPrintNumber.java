
public class MainPrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			NumberPrinter np=new NumberPrinter(i);
			Thread t = new Thread(np);
			t.start();
		}
		
		ExecutorService exe=Executors.newFixedThreadPool(5);
		Future<Interger> futureI = exe.submit(new NumberPrinterCallable());

		Integer i = futureI.get();

	}

}
