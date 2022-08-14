class A extends Thread{
public void run()
{
System.out.println("Thread A is started");
for(int i=1;i<=5;i++)
{
System.out.println("This is THREAD A"+i);
}
System.out.println("Exit from thread A");
}
}
class B extends Thread{
public void run()
{
System.out.println("Thread B is started");
for(int i=1;i<=5;i++)
{
System.out.println("This is THREAD B"+i);
}
System.out.println("Exit from thread B");
}
}
class THREADpriority{
public static void main(String args[]){
A ta=new A();
B tb=new B();
ta.setPriority(Thread.MIN_PRIORITY);
tb.setPriority(Thread.MAX_PRIORITY);
System.out.println("Start thread A");
ta.start();
System.out.println("Start thread B");
tb.start();
System.out.println("End Of Main Thread");
}
}