import java.util.*;
public class cal
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the first operand\n");
        int a=scan.nextInt();
        System.out.println("enter the second operand\n");
        int b=scan.nextInt();
        System.out.println("1.addition\n");
        System.out.println("2.subtraction\n");
        System.out.println("3.multiplication\n");
        System.out.println("4.division\n");
        System.out.println("enter the number to peroform the operation");
        int n=scan.nextInt();
        switch(n)
        {
            case 1:System.out.println("Answer is: "+(a+b));
            break;
            case 2:System.out.println("Answer is: "+(a-b));
            break;
            case 3:System.out.println("Answer is: "+(a*b));
            break;
            case 4:if(b==0)
                    System.out.println("not vaid");
                    else
                    System.out.println("Answer is: "+(a/b));
            break;
            default:System.out.println("please enter a valid option\n");
        }
    }
}

