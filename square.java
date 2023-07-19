import java.util.*;
public class square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int sum=0;
        if(n<=0)
        {
            System.out.println("invalid");
        }
        else
        {
            while(n!=0)
            {
                sum=sum+n*n;
                n--;
            }
            System.out.println("Result:"+sum);
        }
    }
}

