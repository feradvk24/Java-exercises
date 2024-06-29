
public class Test {

	public static void main(String[] args) {

		MyThread T = new MyThread();
		
	    T.start();
	    synchronized(T){
	      System.out.println("Waiting until calculations finish...");
	      try{
	        T.wait();
	      }
	      catch (InterruptedException e){
	    	  e.printStackTrace();
	      }
	    }
	    System.out.println("Result: "+ T.sum);
	  }
	}
