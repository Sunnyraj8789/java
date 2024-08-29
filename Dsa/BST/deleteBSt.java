class Node{
    int data;
    Node left,right;
    Node(int v){
        data=v;
        left=right=null;
    }
}
public class deleteBSt{

    //method defination of succesor
    public int successor(Node root){
        root=root.right;
        //minimum value  in the right subtree
        while(root.left!=null){
            root=root.left;
        }
        return root.data;
    }

    //predecessor
    public int predecessor(Node root){
        root=root.left;
        //maximum value in the right side
        while(root.right!=null){
            root=root.right;
        }

        return root.data;
    }

   public Node deleteNode(Node root,int key){
    if(root==null){
        return null;
    }
    //search element
    if(key<root.data){ 
        root.left=deleteNode(root.left, key);
    }
    else if(key>root.data){
        root.right=deleteNode(root.right, key);
    }

    else{
        //remove the node depending upon the cases
        // case1:-> leaf Node
        if(root.left==null&&root.right==null){
            root=null;
        }
        //case2:->Non leaf Node

        else if(root.right!=null){
            //function call of successor
            root.data=successor(root);
            root.right=deleteNode(root.right,key);
        }
        else{
            root.data=predecessor(root);
            root.left=deleteNode(root.left,a);
        }
    }
    return root;
    }

    public void Inorder(Node root){
        if(root.left!=null){
            Inorder(root.left);
        }
         System.out.print(root.data +"  ");

        if(root.right!=null){
             Inorder(root.right);
        }
    }
    public static void main(String[] args){
        Node root=new Node(100);
        root.left=new Node(70);
        root.right=new Node(120);
        root.left.left=new Node(60);
        root.left.right=new Node(90);
        root.right.left=new Node(110);
        root.right.right=new Node(140);
        deleteBSt ob=new deleteBSt();
        ob.Inorder(root);
        System.out.println();
        System.out.println("after deleting");
        int key=100;
        ob.deleteNode(root,key);
        ob.Inorder(root);
    }
}
