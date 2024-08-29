class Node{
    int data;
    Node left,right;
    Node(int v){
        data=v;
        left=right=null;
    }
}

public class LowestCommonAncestor {


    public Node CommonAncestor(Node root,int p,int q){
        int parentVal=root.data;
        int pval=p;
        int qval=q;
        if(p>parentVal&&q>parentVal){
            return CommonAncestor(root.right, pval, qval);
        }
        else if(p<parentVal&&q<parentVal){
            return CommonAncestor(root.left, pval, qval);
        }
        else{
            return root;
        }
    }
    public static void main(String[] args){
        Node root=new Node(6);
        root.left=new Node(2);
        root.right=new Node(8);
        root.left.left=new Node(0); 
        root.left.right=new Node(4);
        root.left.right.left=new Node(3);
        root.left.right.right=new Node(5);
        root.right.left=new Node(7);
        root.right.right=new Node(9);
        int p=3,q=5;
        LowestCommonAncestor ob=new LowestCommonAncestor();
        ob.CommonAncestor(root, p, q);
        
    }
}
