class Node{
    int data;
    Node left,right;
    Node(int v){
        data=v;
        left=right=null;
    }
}
public class daimeterTree {
    int max=0;
    public int height(Node root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        max=Math.max(max,left+right);
        return 1+Math.max(left,right);
    }

    public int daimeterTre(Node root){
        height(root);
        return max;
    }
    public static void main(String[] args) {
    Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        

        daimeterTree obj=new daimeterTree();
        int res=obj.daimeterTre(root);
        System.out.println(res);
    }
}
