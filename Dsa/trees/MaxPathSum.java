class Node{
    int data;
    Node left,right;
    Node(int v){
        data=v;
        left=right=null;
    }
}
public class MaxPathSum {
    int max=Integer.MIN_VALUE;
    public int helper(Node root){
        if(root==null){
            return 0;
        }
        int left=Math.max(0,helper(root.left));
        int right=Math.max(0, helper(root.right));
        max=Math.max(max,root.data+left+right);
        return root.data +Math.max(left, right);
    }


    public int maxpath(Node root){
        helper(root);
        return max;
    }
    public static void main(String[] args) {
        Node root=new Node(7);
        root.left=new Node(3);
        root.right=new Node(5);
        root.left.left=new Node(8);
        root.left.right=new Node(6);
        root.right.left=new Node(2);
        root.right.right=new Node(4);
        MaxPathSum obj=new MaxPathSum();
        int maxVAl=obj.maxpath(root);
        System.out.println(maxVAl);

        
    }
    
}
