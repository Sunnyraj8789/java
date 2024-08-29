class Node{
    int data;
    Node left,right;
    Node(int val){
        data=val;
        left=right=null;
    }
}

public class Postorder {
    public static void PostorderTraversal(Node root){
        if(root==null){
            return;
        }
        PostorderTraversal(root.left);
        PostorderTraversal(root.right);
        System.out.print(root.data +" ");
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        PostorderTraversal(root);
    }
    
}
