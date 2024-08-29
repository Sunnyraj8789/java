public class solution{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public void insertEnd(int newData){
        Node newnode=new Node(newData);
        if(head==null){
           head=new Node(newData);
           return;
        }
    Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        return;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data +" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        solution sl=new solution();
        sl.insertEnd(2);
        sl.insertEnd(5);
        sl.insertEnd(8);
        sl.display();
        System.out.println("after inserting element");
        sl.insertEnd(10);
        sl.display();

        
    }
}