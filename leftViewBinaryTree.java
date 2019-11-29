public class leftViewBinaryTree 
{
    public static Node root;
    public static class Node
    {
        Node left,right;
        int data;
        Node(int d)
        {
            data = d;
            left = right = null;
        }
    }
       leftViewBinaryTree()
    {
        root = null;
    }
    leftViewBinaryTree(int data)
    {
        root = new Node(data);
    }
    static int max = 0;
    public static void leftView(Node root,int count)
    {
        if(root == null)
            return;
        if(count>max)
        {
            System.out.print(root.data+" ");
            max = count;
        }
        leftView(root.left,count+1);
        leftView(root.right,count+1);
    }
    public static void main(String args[])
    {
        leftViewBinaryTree bt = new leftViewBinaryTree(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        
        System.out.print("Left View is as follows:-->");
        bt.leftView(root,1);
        System.out.println();
    }
}
/*
Given a Binary Tree, print left view of it.
Left view of a Binary Tree is set of nodes visible when tree is visited from left side
*/