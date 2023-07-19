import java.util.*;
public class matmul
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of rows of 1st matrix");
        int row1;
        row1=scan.nextInt();
        System.out.println("enter the number of columns of 1st matrix");
        int col1;
        col1=scan.nextInt();
        System.out.println("enter the number of rows of the 2nd matrix");
        int row2;
        row2=scan.nextInt();
        System.out.println("enter the number of columns of the 2nd matrix");
        int col2;
        col2=scan.nextInt();
        if(col1!=row2)
        {
            System.out.println("matrix multiplication is not possible");
            return;
        }
        else
        {
            int a[][]=new int[row1][col1];
            int b[][]=new int[row2][col2];
            int c[][]=new int[row1][col2];
            System.out.println("enter the elements of 1st matrix");
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col1;j++)
                {
                    a[i][j]=scan.nextInt();
                }
            }
            System.out.println("enter the elements of 2nd matrix");
            for(int i=0;i<row2;i++)
            {
                for(int j=0;j<col2;j++)
                {
                    b[i][j]=scan.nextInt();
                }
            }
            System.out.println("matrix multiplication is::");
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col2;j++)
                {
                    c[i][j]=0;
                    for( int k=0;k<col1;k++)
                    {
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                    System.out.print(c[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
    }
}