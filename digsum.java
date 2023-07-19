import java.util.*;
public class digsum
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("eneter the digit\n");
        int n=scan.nextInt();
        int sum=0;
        while(n>0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        System.out.print(sum);
    }
}