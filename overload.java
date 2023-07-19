import java.util.*;
class overloadDemo
{
    void test()
    {
        System.out.print("no parameters");
    }
    void test(int a)
    {
        System.out.print("a= "+a);
    }
    void test(int a,int b)
    {
        System.out.print("a and b: "+a +b);
    }
    double test(double a)
    {
        return a*a;
    }
}
class overload {
    public static void main(String args[])
    {
        overloadDemo ob=new overloadDemo();
        double res;
        ob.test();
        ob.test(20);
        ob.test(10,20);
        res=ob.test(10.25);
        System.out.print("result= "+res);
    }    
}