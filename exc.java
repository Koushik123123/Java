class exc
{
    public static void main(String args[])
    {
        try 
        {
            int a=args.length;
            System.out.print("a= "+a);
            int b=42/a;
            int c[]={1};
            c[42]=99;
        }
        catch(ArithmeticException e)
        {
            System.out.print("Divide: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.print("Array Index"+e);
        }
        System.out.print("After try/catch block");
    }
}