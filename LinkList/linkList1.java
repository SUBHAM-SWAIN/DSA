package LinkList;

class LinkedList {
    // Node definition
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head; // starting point

    // Add node at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Traverse and print
    public void traverse() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Initialize with values
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // Traverse the list
        list.traverse(); // Output: Linked List: 10 20 30 40
    }
}
