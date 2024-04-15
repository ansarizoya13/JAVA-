class A extends Thread
{
  public void run()
  {
    System.out.println("threadA started");
    for(int i=0;i<=5;i++)
    {
      System.out.println("\tFrom Thread A : i = "+i);
  	}
  	System.out.println("Exit from A ");
  }
}
class B extends Thread
{
  public void run()
  {
    System.out.println("threadB started");
    for(int j=0;j<=5;j++)
    {
      System.out.println("\tFrom Thread B : j = "+j);
    }
    System.out.println("Exit From B");
  }
}
class C extends Thread
{
  public void run()
  {
    System.out.println("threadC started");
    for(int k=0;k<=5;k++)
    {
      System.out.println("\tFrom thread C : k = "+k);
    }
    System.out.println("Exit from  C");
  }
}
class ThreadPriority
{
  public static void main(String[] args)
  {
    A threadA = new A();
    B threadB = new B();
    C threadC = new C();
    threadC.setPriority(Thread.MAX_PRIORITY);
    threadB.setPriority(threadA.getPriority()+1);
    threadA.setPriority(Thread.MIN_PRIORITY);
    
    System.out.println("Start thread A");
    threadA.start();
    System.out.println("Start thread B");
    threadB.start();
    System.out.println("Start thread C");
    threadC.start();
    System.out.println("End of main thread");
  }
}