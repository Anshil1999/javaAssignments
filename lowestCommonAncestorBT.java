public class lowestCommonAncestorBT 
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
    lowestCommonAncestorBT()
    {
        root = null;
    }
    lowestCommonAncestorBT(int data)
    {
        root = new Node(data);
    }
    public static Node checkAncestor(Node root,Node p,Node q)
    {
        if(root == null)
            return null;
        if(p == root || q == root)
            return root;
        if (p == q)
            return p;
        Node left = checkAncestor(root.left, p, q);
        Node right = checkAncestor(root.right, p, q);
        if(left != null && right != null)
            return root;
        Node temp;
        if(left == right)
            temp = right;
        else
            temp = left;
        return temp;
    }
    public static void main(String args[])
    {
        lowestCommonAncestorBT bt = new lowestCommonAncestorBT (1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
//1st input:
        Node a = bt.root.left.left;
        Node b = bt.root.left.right;
        Node answer1 = bt.checkAncestor(bt.root,a,b);
//2nd input:        
        Node c = bt.root.left.left;
        Node d = bt.root.right.left;        
        Node answer2 = bt.checkAncestor(bt.root,c,d);
//3rd input:        
        Node e = bt.root.right;
        Node f = bt.root.left.left;
        Node answer3 = bt.checkAncestor(bt.root,e,f);
//4th input:        
        Node g = bt.root.left;
        Node h = bt.root.left.left;
        Node answer4 = bt.checkAncestor(bt.root,g,h);
//5th input:        
        Node i = bt.root.right;
        Node j = bt.root.right;
        Node answer5 = bt.checkAncestor(bt.root,i,j);
//Output:        
        System.out.println("LCA(" + a.data + "," + b.data + ") = "+answer1.data);
        System.out.println("LCA(" + c.data + "," + d.data + ") = "+answer2.data);
        System.out.println("LCA(" + e.data + "," + f.data + ") = "+answer3.data);
        System.out.println("LCA(" + g.data + "," + h.data + ") = "+answer4.data);
        System.out.println("LCA(" + i.data + "," + j.data + ") = "+answer5.data);       
    }
}

/*
Write a Java program to find the lowest common ancestor in a binary tree
I/O:
    1)LCA(4,5)=2
    2)LCA(4,6)=1
    3)LCA(3,4)=1
    4)LCA(2,4)=2
    5)LCA(3,3)=3
*/