import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    Node(int v){
        data=v;
        left=right=null;
    }
}
public class levelOrderTraversal {
    static ArrayList<Integer> levelTraversal(Node root){
        ArrayList<Integer> result=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node x=q.remove();
            if(x.left!=null)
            q.add(x.left);
            if(x.right!=null)
            q.add(x.right);
            result.add(x.data);
        }
        return result;
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        ArrayList res=levelTraversal(root);
        System.out.println(res);

    }
}
