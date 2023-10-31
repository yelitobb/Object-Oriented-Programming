//package beans;
class PrintDemo2 {//segmento de codigo al cual yo le voy a dar acceso a T1 y T2
//Metodo printcount que representa el segmento de codigo a compartir por multiples hilos
	   public void printCount(String nameHilo) {
	      try {
	         for(int i = 5; i > 0; i--) {
	            System.out.println(nameHilo + "" + "Counter   ---   "  + i );
	         }
//catch cachas cualquier averia que suceda a traves del objeto e del tipo exception
	      } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	      }
	   }
}

class ThreadDemo2 extends Thread { //Thread es clase de java 
	   private Thread t;//t es un objeto del tipo hilo(Thread)
	   private String threadName;
	   PrintDemo2  PD;

	   ThreadDemo2( String name,  PrintDemo2 pd) {
	      threadName = name;
	      PD = pd;
	   }
	   
	   public void run() {//Nuestra propia version de run
	      synchronized(PD) {//sin el synchronized salen en forma aleatoria los hilos
	         PD.printCount(threadName);
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void start () {//Nuestra propio version de start
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
}

public class TestThread2 {

	   public static void main(String args[]) {
		  Thread principal = Thread.currentThread();
	      PrintDemo2 PD = new PrintDemo2();
// lo mas importante es que les paso a los 2 hilos el mismo objeto PD, por lo que comparten el mismo objeto
	      ThreadDemo2 T1 = new ThreadDemo2( "Thread - 1 ", PD );
	      ThreadDemo2 T2 = new ThreadDemo2( "Thread - 2 ", PD );

		  System.out.println ("Nombre hilo principal: " + principal.getName());
		  System.out.println ("Estado hilo principal: " + principal.getState());

	      T1.start();
	      T2.start();

	      // wait for threads to end
	      //try {
	         //T1.join();
	         //T2.join();
	      //} catch ( Exception e) {
	        // System.out.println("Interrupted");
	      //}
	   }

}
