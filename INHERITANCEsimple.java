class method{
int b,c;
void get(int p,int q)
{
b=p;
c=q;
}
void show()
{
System.out.println(b+" "+" "+c);
}
}
class INHERITANCEsimple extends method
{
public static void main(String args[])
{
INHERITANCEsimple mb1=new INHERITANCEsimple();
mb1.get(5,6);
mb1.show();
}
}