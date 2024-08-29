import java.util.*;
public class stackdemo {
static void stack_push(Stack<Integer> stack, int i) {
stack.push(i);
System.out.println("Element " + i + " pushed into the stack.");
}
static void stack_pop(Stack<Integer> stack) {
if (stack.isEmpty()) {
System.out.println("Stack is empty.");
return;
}
int popped = stack.pop();
System.out.println("Element " + popped + " popped from the stack.");
}
static void stack_search(Stack<Integer> stack, int elem) {
int pos = stack.search(elem);
if (pos == -1)
System.out.println("Element" + elem +"not found in the stack");
else
System.out.println("Element " + elem + " found at position " +
pos);
}
public static void main(String[] args) {
Stack<Integer> s = new Stack<>();
System.out.println("Push operation: ");
System.out.println("sunny kumar");
System.out.println("2821106");
stack_push(s, 5);
stack_push(s, 21);
stack_push(s, 11);
stack_search(s, 11);
stack_pop(s);
stack_search(s, 5);
stack_search(s, 21);
}
}
class QueueDemo {
static void queue_add(PriorityQueue<Integer> q, int i) {
q.add(i);
System.out.println("Element " + i + " added to the queue.");
}
static void queue_find(PriorityQueue<Integer> q, int elem) {
if (q.contains(elem))
System.out.println("Element " + elem + "is present in the queue");
else
System.out.println("Element " + elem + "is not present in the queue");
}
public static void main(String[] args) {
System.out.println("sunny kumar");
PriorityQueue<Integer> q = new PriorityQueue<>();
for (int i = 1; i < 5; i++)
queue_add(q, i * i);
Iterator<Integer> itr = q.iterator();
System.out.println("Queue elements:");
while (itr.hasNext()) {
System.out.print(itr.next() + " ");
}
System.out.println();
queue_find(q, 10);
queue_find(q, 4);
if (!q.isEmpty()) {
System.out.println("Head: " + q.peek());
q.poll();
} else {
System.out.println("Queue is empty.");
}
System.out.print("After removing an element, queue: ");
Iterator<Integer> itr2 = q.iterator();
while (itr2.hasNext()) {
System.out.print(itr2.next() + " ");
}
q.clear();
}
}