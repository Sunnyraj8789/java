import org.w3c.dom.Node;

public class SinglyLinkedList {
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

        //implementing the insertion at end in linked list
        public void InsertionAtEnd(int newData)
        {
            Node newNode=new Node(newData);

            //linked list in empty
            if(head==null){
                head=new Node(newData);
                return;
            }

            //not empty
            newNode.next=null;
           Node temp=head;
           while(temp.next!=null){
            temp=temp.next;
           }
            temp.next=newNode;
            return;
        }

        //insert at begin

        public void insertAtBegin(int newData)
        {
            Node newnode=new Node(newData);
            newnode.next=head;
            head=newnode;
        }


        //insert at the any position

        public void InsertAfter(Node Prev_node , int newData)
        {
            if(Prev_node==null)
            {
                System.out.println("cannot contain previous value");
                return;
            }

            Node newnode=new Node(newData);
            newnode.next=Prev_node.next;
            Prev_node.next=newnode;
        }
        // deletion in a linked list

        void deleteNode(int position)
        {

            //linked list is empty
            if(head==null)
            {
                return;
            }


            //deletion in beginning

            Node temp=head;
            if(position==0)
            {
                head=temp.next;
                return;
            }

            //deletion is at any position

            for(int i=0;temp!=null&&i<position-1;i++)
            {
                temp=temp.next;
            }
            if(temp==null&&temp.next==null)
            {
                return;
            }
            temp.next=temp.next.next;
            return;
        }

        //reversed the linked list

        public void reversedList()
        {
            Node curr=head;
            Node nextptr=null;
            Node prev=null;
            while(curr!=null)
            {
                nextptr=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextptr;
            }
            head=prev;
            return;
        }



        //implementation of reversal using the recursive approach
        public void recursiverec(Node curr,Node prev)
        {
            if(curr.next==null)
            {
                head=curr;
                curr.next=prev;
                return;

            }

            Node nextPtr=curr.next;
            curr.next=prev;
            recursiverec(nextPtr,curr);
        }


        public void middleNode()
        {
            Node slow=head,fast=head;
            while(fast!=null&&fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.println("middle node is "+slow.data);
        }


        //cycle detection in circular linked list
        public void cycledetect()
        {
            Node slow=head,fast=head;
            int flag=0;
            while(slow!=null&&fast!=null&&fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
                
                if(slow==fast){
                    flag=1;
                    break;
                }

            }

            if(flag==0)
            {
                System.out.println("no cycle detect");
            }
            else{
                System.out.println("cycle detected");
            }
        }

    //displaying the list

        public void displayLL()
        {
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data +" ");
                temp=temp.next;
            }
        }
    public static void main(String[] args)
    {
        SinglyLinkedList list=new SinglyLinkedList();
        list.InsertionAtEnd(2);
        list.InsertionAtEnd(4);
        list.InsertionAtEnd(8); 
        list.InsertionAtEnd(10);
        list.InsertionAtEnd(12);
        list.InsertionAtEnd(14); 
        list.InsertionAtEnd(16);
        // list.displayLL();
        // System.out.println("before inserting ");
        // list.displayLL();
        // System.out.println();
        // list.InsertionAtEnd(8);
        // list.insertAtBegin(1);
        // list.InsertAfter(list.head.next.next,13);
        // System.out.println("after inserting ");
        // list.displayLL();

        // list.deleteNode(2);
        // System.out.println("after deleting the node at the postiion no. 2");
        // list.displayLL();

        // list.reversedList();
        // System.out.println("after reversed");
       
        // list.recursiverec(list.head,null);
        // list.displayLL();

        // list.middleNode();

        //cycle detection 
        Node temp=list.head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=list.head;
    

        list.cycledetect();
        System.out.println();


        


    }
}
