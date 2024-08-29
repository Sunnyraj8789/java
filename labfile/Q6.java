import java.util.Scanner; 
interface Stack{
public void push(int data) throws Exception; public int pop() throws Exception;
public String display(); public boolean isEmpty();
public int top() throws Exception;
}
class Stack_array implements Stack { protected int capacity;
public static final int CAPACITY = 16; int[] stackArray;
int top = -1;
public Stack_array() { this(CAPACITY);
}
public Stack_array(int cap) { capacity = cap;
stackArray = new int[capacity];
}
public int size() { return (top + 1);
}
public boolean isEmpty() { return (top < 0);
}
public void push(int data) throws Exception { if (size() == capacity)
throw new Exception("Stack is full.");
stackArray[++top] = data;
}
public int top() throws Exception { if (isEmpty())
throw new Exception("Stack is empty."); return stackArray[top];
}
public int pop() throws Exception { int data;
if (isEmpty())
throw new Exception("Stack is empty."); data = stackArray[top];
stackArray[top--] = Integer.MIN_VALUE; return data;
}
public String display() { StringBuilder s;
s = new StringBuilder("["); if (size() > 0)
s.append(stackArray[0]); if (size() > 1)
for (int i = 1; i <= size() - 1; i++) { s.append(", ").append(stackArray[i]);
}
return s + "]";
} }
class Stack_list implements Stack{ private class Node{
int data;
Node next;
Node(int x){
data = x; next = null;
} }
Node head;
Stack_list(){
this.head = null;
}
public void push(int data) throws Exception { Node new_node = new Node(data);
if (new_node == null){
throw new Exception("Stack overflow/n");
}
new_node.data = data; new_node.next = head; head = new_node;
}
public int pop() throws Exception { if (head == null) {
throw new Exception("Stack Underflow/n");
}
int x = head.data; head = head.next; return x;
}
public String display() { if (head == null){
System.out.println("Stack is empty"); return null;
}
else {
StringBuilder st = new StringBuilder("["); Node temp = head;
while (temp != null){ st.append(temp.data).append(" ,"); temp = temp.next;
}
st.deleteCharAt(st.length() - 1); return st + "]";
} }
public boolean isEmpty() { return (head == null);
}
public int top() throws Exception { if (!isEmpty())
return head.data; else
throw new Exception("Stack is empty");
} }
class Q6{
public static void main(String[] args) throws Exception { 
    System.out.println("Kanhaiya kumar");
    System.out.println("2821230");
    System.out.println("Implementation of stack using array"); Stack_array stk = new Stack_array();
int choice = 0;
Scanner sc = new Scanner(System.in); do {
System.out.println("1.Push 2.Pop 3.Display 4.Exit 5.Use Linked List"); System.out.println("Enter choice");
choice = sc.nextInt(); switch (choice) {
case 1 -> {
System.out.println("Enter number to be pushed"); int x = sc.nextInt();
stk.push(x);
}
case 2 -> System.out.println(stk.pop() + " poped");
case 3 -> System.out.println("Elements in stack are : " + stk.display()); case 4 -> System.exit(0);
}
} while (choice < 5);
System.out.println("Implementation of stack using Linked List"); choice = 0;
Stack_list stl = new Stack_list(); do{
System.out.println("1.Push 2.Pop 3.Display 4.Exit"); System.out.println("Enter choice");
choice = sc.nextInt(); switch (choice) {
case 1 -> {
System.out.println("Enter number to be pushed"); int x = sc.nextInt();
stl.push(x);
}
case 2 -> System.out.println(stl.pop() + " poped");
case 3 -> System.out.println("Elements in stack are : " + stl.display()); default -> System.exit(0);
}
}while(true);
}
} 

