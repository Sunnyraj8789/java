import java.util.ArrayList;

class Node{
    int data;
    Node left,right;
    Node(int v){
        data=v;
        left=right=null;
    }
}
public class kthSmallest {
    public ArrayList<Integer> InorderTraversal(Node root,ArrayList<Integer> result){
        if(root==null){
            return result;
        }
        InorderTraversal(root.left, result);
        result.add(root.data);
        InorderTraversal(root.right, result);

        return result;
    }

    public int kthSmallest(Node root,int k){
        ArrayList<Integer> result=InorderTraversal(root,new ArrayList<>());
        return result.get(k-1);
    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(1);
        root.right=new Node(4);
        root.left.right=new Node(2);
        kthSmallest ob=new kthSmallest();
        int val=ob.kthSmallest(root,1);
        System.out.println(val);
        
        
    }
    
}
