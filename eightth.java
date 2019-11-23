import java.util.Scanner;
public class eightth 
{
    eightth()
    {
        root = null;
    }
    eightth(int data)
    {
        root = new Node(data);
    }
    public static Node root;
    public static class Node
    {
        int data;
        Node right,left;
        Node(int d)
        {
            right=left=null;
            data=d;
        }
    }
    public static int checkBST(Node root)
    {
        if(root.left == null || root.right == null)
            return 1;
        if(root.left.data > root.data)
            return 0;
        if(root.right.data < root.data)
            return 0;
        if(root.left.data < root.data)
            checkBST(root.left);
        if(root.right.data > root.data)
            checkBST(root.right);
        return 1;
    }
    public static void main(String args[])
    {
        eightth tree = new eightth(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(6);
        int check = checkBST(tree.root);
        if(check == 1)
            System.out.println("Yes,it is a BST!!");
        else
            System.out.println("Not a BST!!");
    }
}
/*
Write a program to check if a given binary tree is BST or not
*/