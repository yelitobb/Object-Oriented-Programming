/*
ExtendingThreadClass.java

Extending Thread class (java.lang.Thread)
https://kumarshivam-66534.medium.com/important-concepts-of-object-oriented-system-part-v-6f4456329227

Things to consider while creating a thread using Thread class:
1. Extend Thread class
2. Override run()method in the extended class(i.e. MultiThread1-2) and write code snippet which needs to invoke using thread.
3. Create an instance of an extended class (i.e. multiThreadObject1-2 objects)
4. Invoke start() method using MultiThread class through the multiThreadObject1-2 objects. start() method will call run() method internally.

*/
class MultiThread1 extends Thread{
    @Override
    public void run() {
      System.out.println("Hello from MultiThread1 class and Thread id is "+currentThread().currentThread().getId());
    }
}

class MultiThread2 extends Thread{
    @Override
    public void run() {
      System.out.println("Hello from MultiThread2 class and Thread id is "+currentThread().currentThread().getId());
    }
}
public class ExtendingThreadClass {
    public static void main(String[] args){
	   Thread h1 = Thread.currentThread();
       
	   MultiThread1 multiThreadObj1=new MultiThread1();
       multiThreadObj1.setName("el Segundo");
	   multiThreadObj1.start();
	   //Output : Hello from MultiThread class and Thread id is 14 
	   
	   MultiThread2 multiThreadObj2=new MultiThread2();
       multiThreadObj2.setName("el Tercero");
	   multiThreadObj2.start();
	   //Output : Hello from MultiThread class and Thread id is 15 
	   
	   System.out.println("Hilo principal: " + h1.getName());
	   //Output : Hilo principal: main
	   System.out.println("Segundo hilo: " + multiThreadObj1.getName());
	   //Output : Segundo hilo: el Segundo
	   System.out.println("Tercer hilo: " + multiThreadObj2.getName());
	   //Output : Segundo hilo: el Tercero
    }
}