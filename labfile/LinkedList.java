public class LinkedList<T> {

    // Node class for individual elements in the linked list
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    private Node<T> head;

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;
    }

    // Method to add an element to the end of the linked list
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to remove the first occurrence of a given element from the linked list
    public void remove(T element) {
        if (head == null) {
            return;
        }

        if (head.data.equals(element)) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(element)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Method to check if the linked list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Method to get the size of the linked list
    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Method to print the elements of the linked list
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println("kanhaiya kumar");
        System.out.println("2821230");
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.print("Linked List: ");
        linkedList.printList();

        linkedList.remove(2);

        System.out.print("Linked List after removing 2: ");
        linkedList.printList();
    }
}
