
import java.util.ArrayList;

class Node{
    int data;
    Node left,right;
    Node(int v){
        data=v;
        left=right=null;
    }
}
public class validBST {
    //Array list uses to dynamic allocate not define the size
    //but in static array like as int[] arr=
    ArrayList<Integer> result=new ArrayList<>();

    public void InorderTraversal(Node root){
        if(root.left!=null){
            InorderTraversal(root.left);
        }
       result.add(root.data);
       
       if(root.right!=null){
        InorderTraversal(root.right);
       }
    }
    public boolean Isvalid(Node root){
        if(root==null){
            return true;
        }
        InorderTraversal(root);
        //cheak wheather the array is sorted or not
        //if array is sorted then return true
        //otherwise return false

        int n=result.size();

        for(int i=0;i<n-1;i++){
            if(result.get(i)>=result.get(i+1)){
                return false;
            }
            
        }
        return true;
    }
    
    public static void main(String[] args){
        Node root=new Node(100);
        root.left=new Node(70);
        root.right=new Node(120);
        root.left.left=new Node(50);
        root.left.right=new Node(90);
        root.right.left=new Node(110);
        root.right.right=new Node(150);
        validBST obj=new validBST();
        boolean Valid=obj.Isvalid(root);
        System.out.println("Binary tree is valid :-  "+Valid);
    }
}
