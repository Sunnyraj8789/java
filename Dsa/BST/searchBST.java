class Node{
    int data;
    Node left,right;
    Node(int v){
        data=v;
        left=right=null;
    }
}
public class searchBST
{
    public Node searchBst(Node root,int val){
        if(root==null||root.data==val){
            return root;
        }
        else if(val<root.data){
            return searchBst(root.left, val);
        }
        else{
            return searchBst(root.right, val);
        }
    }
public static void main(String[] args) {
    Node root=new Node(100);
    root.left=new Node(50);
    root.right=new Node(120);
    root.right.left=new Node(110);
    
    searchBST ob=new searchBST();
    ob.searchBst(root,120);

  }
  }