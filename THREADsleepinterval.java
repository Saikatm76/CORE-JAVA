class student extends Thread{
public void run()
{
try{
for(int i=0;i<=5;i++)
{
Thread.sleep(1000);
System.out.println("KNU BCA");
Thread.sleep(2000);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
class school extends Thread{
public void run()
{
try{
for(int i=0;i<=5;i++)
{


Thread.sleep(2000);
System.out.println("BU BCA");
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
class THREADsleepinterval{
public static void main(String args[]){
student mb1=new student();
school mb2=new school();
mb1.start();
mb2.start();
}
}