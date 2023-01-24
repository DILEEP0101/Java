class A{
    public int add(int x,int y)
    {
    return x+y;
    }

    public int sub(int x,int y)
    {
    return x-y;
    }
}
class B extends A
{
    public int mul(int x,int y)
    {
    return x*y;
    }

}
public class InheriDemo {
    public static void main(String[] args) {
        B obj=new B();
        int r1=obj.add(4,5);
        int r2=obj.sub(10,5);
        int r3=obj.mul(6,4);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);


        
    }

}    
    