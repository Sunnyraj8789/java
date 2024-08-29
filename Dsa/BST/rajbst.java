class Node{
    int data;
    Node left,right;
    Node(int v){
        data=v;
        left=right=null;
    }
}
public class rajbst{
    public int succesor(Node root){
        root=root.right;
        while (root.left!=null) 
        {
            root=root.left;
            
        }
        return root.data;

    }

    public int predessor(Node root){
        root=root.left;
        while (root.right!=null) 
        {
            root=root.right;
            
        }
        return root.data;
    }

    public Node deleteNode(Node root,int key){
        if(root==null){
            return null;
        }
        if(key<root.data){
            root.left=deleteNode(root.left, key);
        }
        else if(key>root.data){
            root.right=deleteNode(root.right, key);
        }
        else{
            if(root.left==null&&root.right==null){
                root=null;
            }
            else if(root.right!=null){
                root.data=succesor(root);
                root.right=deleteNode(root.right, key);
            }
            else{
                root.data=predessor(root);
                root.left=deleteNode(root.left, key);
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


    public static void main(String[] args) {
        Node root=new Node(100);
        root.left=new Node(70);
        root.right=new Node(120);
        root.left.left=new Node(60);
        root.left.right=new Node(90);
        root.right.left=new Node(110);
        root.right.right=new Node(140);
        rajbst ob=new rajbst();
        ob.Inorder(root);
        System.out.println();
        System.out.println("after deleting");
        int key=100;
        ob.deleteNode(root,key);
        ob.Inorder(root);
    }
    
}
