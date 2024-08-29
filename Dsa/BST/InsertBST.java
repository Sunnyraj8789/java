class Node{
        int data;
        Node left,right;
        Node(int v){
            data=v;
            left=right=null;
        }
    }
    public class InsertBST {

        public Node insertNode(Node root,int val){
            if(root==null){
                return new Node(val);
            }

            else if(val<root.data){
              root.left=  insertNode(root.left, val);
            }
            else if(val>root.data){
               root.right= insertNode(root.right, val);
            }
            return root;
        }

        public  void inorder(Node root){
            if(root==null){
                return ;
            }
            if(root.left!=null){
            inorder(root.left);
            }
            System.out.println(root.data);
            if(root.right!=null){
            inorder(root.right);
            }
        }
        public static void main(String[] args) {
            Node root=new Node(100);
            root.left=new Node(50);
            root.right=new Node(120);
            root.right.left=new Node(110);
            InsertBST obj=new InsertBST();
            obj.inorder(root);
            System.out.println("after inserting ");
            obj.insertNode(root,70);
            obj.inorder(root);   
            
        }
    }