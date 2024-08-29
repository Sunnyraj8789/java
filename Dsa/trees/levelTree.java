import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Level;

class Node{
         int data;
         Node left,right;
         Node(int v){
            data=v;
            left=right=null;
         }
}
public class levelTree {
    public List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int count=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<count;i++){
                Node x=q.remove();
                level.add(x.data);

                if(x.left!=null)
                q.add(x.left);
                if(x.right!=null)
                q.add(x.right);
            }
            result.add(level);
        }
        return result;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        levelTree ob=new levelTree();
        List res= ob.levelOrder(root);
        // int res=levelOrder(root);
        System.out.print(res);


        
    }
    
}
