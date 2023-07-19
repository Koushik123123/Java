import java.util.*;
public class pass 
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            String name;
            String pw=new String();
            long ph;
            int roomno,reminder,sum=0;
            System.out.print("Enter the name: ");
            name=sc.next();
            System.out.print("Enter the room number: ");
            roomno=sc.nextInt();
            int rno1=roomno;
            System.out.print("Enter the phone number: ");
            ph=sc.nextLong();
            char []symbol={')','!','@','#','$','%','^','&','*','('};
            do
            {
                while(roomno!=0)
                {
                    reminder=roomno%10;
                    sum=sum+reminder;
                    roomno=roomno/10;
                }
                if(sum>=10)
                {
                    roomno=sum;
                    sum=0;
                }
            }while(roomno!=0);
            int c=rno1/100;
            int len=name.length();
            int pos=0;
            for(int i=0;i<len;i++)
            {
                if(c==i)
                {
                    pos=i;
                    System.out.println("Password is: ");
                }
            }
            pw=""+name.charAt(0)+(ph%10)+sum+symbol[c]+name.charAt(len-1);
            System.out.println(pw);
        }
}