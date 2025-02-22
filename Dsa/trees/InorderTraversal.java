class Node{
    int data;
    Node left,right;
    Node(int v){
        data=v;
        left=right=null;
    }
}
public class InorderTraversal{

    public static void InorderTraversal(Node root){
        if(root==null){
            return;
        }
        InorderTraversal(root.left);
        System.out.print(root.data +" ");
        InorderTraversal(root.right);
        return;
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        InorderTraversal(root);

        
    }
}