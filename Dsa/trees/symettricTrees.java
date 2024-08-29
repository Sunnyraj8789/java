class Node{
    int data;
    Node left,right;
    Node(int v){
        data=v;
        left=right=null;
    }
}
public class symettricTrees {

    public boolean cheak(Node left,Node right){
        if(left==null&&right==null)
        return true;
        if(left==null ||right==null)
        return false;
        if(left.data!=right.data)
        return false;
        return cheak(left.left,right.right) && cheak(left.right,right.left);
    }

    public boolean isSymetric(Node root){
        return cheak(root,root);
    }
    public static void main(String[] args)
    {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(2);
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.right.left=new Node(4);
        root.right.right=new Node(3);
        symettricTrees ob=new symettricTrees();
        boolean symetric=ob.isSymetric(root);
        System.out.println("tree is symetric "+ symetric);
    }
}
