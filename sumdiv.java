class sumdiv{
public static void main(String args[])
{
int sum,i;
sum=0;
i=1;
while(i<=50)
{
if(i%3==0)
{
if(i%6!=0)
{
sum=sum+i;
}
i++;
}
else
{
i++;
}
}
System.out.println("sum="+sum);
}
}