public class singleLinked {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    //at end
    public void InsertAtEnd(int newData)
      {
        Node newNode=new Node(newData);

        if(head==null)
        {
            head=new Node(newData);
            return;
        } 

        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        return;

    }


    //at begin
    public void insertAtBegin(int newData)
    {
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }


    //at any node
    public void insertAtPosition(Node prev_node,int newData)
    {
        if(prev_node==null)
        {
            System.out.println("canot contain value");
                return;
        }
        Node newNode=new Node(newData);
        newNode.next=prev_node.next;
        prev_node.next=newNode;
        return;
    }


    public void disp()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        singleLinked ll=new singleLinked();
        ll.InsertAtEnd(1);
        ll.InsertAtEnd(2);
        ll.InsertAtEnd(3);
        ll.InsertAtEnd(4);
        ll.InsertAtEnd(5);
        ll.disp();
        System.out.println();
        System.out.println("after insert");
        ll.InsertAtEnd(6);
        ll.insertAtBegin(0);
        ll.disp();
        ll.insertAtPosition(ll.head.next.next,15);
        System.out.println("after inserting");
        ll.disp();
    }
}