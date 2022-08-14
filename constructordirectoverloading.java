class constructordirectoverloading {
   constructordirectoverloading(int a,int b)
    {
        System.out.println(a+","+b);
        
    }
    constructordirectoverloading(int a)
    {
        System.out.println(a);
    }
    public static void main(String args[])
    {
        constructordirectoverloading obj=new constructordirectoverloading(1,2);
       constructordirectoverloading uti=new constructordirectoverloading(2);
    }
    
}
