class Node{
    int data;
    Node left,right;
    Node(int v){
        data=v;
        left=right=null;
    }
}
public class heightTree {
    public static int HeightOfTree(Node root){
        if(root==null){
            return 0;
        }
        return 1+ Math.max(HeightOfTree(root.left),HeightOfTree(root.right));

    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
       int maxHeight= HeightOfTree(root);
       System.out.print("Height of the array is :- "+maxHeight);
    }
}
