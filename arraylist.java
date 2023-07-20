import java.util.*;
class Node 
{
    int data;
    Node left,right;
    Node(int key)
    {
        data=key;
        left=right=null;
    }
}
class evenodd 
{
    int difference(Node root)
    {
        if(root==null)
        return 0;
        else 
        {
            int evensum=0;
            int oddsum=0;
            int level=0;
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            while(q.size()!=0)
            {
                int size=q.size();
                level++;
                while(size>0)
                {
                    Node temp=q.remove();
                    if(level%2==0)
                    evensum=evensum+temp.data;
                    else 
                    oddsum=oddsum+temp.data;
                    if(temp.left!=null)
                    q.add(temp.left);
                    if(temp.right!=null)
                    q.add(temp.right);
                    size--;
                }
            }
            return oddsum-evensum;
        }
    }
}
class tree 
{
    public static void main(String args[])
    {
        Node root=new Node(5);
        root.left=new Node(2);
        root.right=new Node(1);
        root.right.left=new Node(3);
        root.right.left.left=new Node(4);
        root.right.right=new Node(5);
        evenodd ob=new evenodd();
        int result=ob.difference(root);
        System.out.println("the sum is: "+result);
    }
}
