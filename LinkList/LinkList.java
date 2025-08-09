package LinkList;

public class LinkList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node Head;
    public static Node Tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        newNode.next = Head;

        Head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (Tail == null) {
            Tail = Head = newNode;
            return;
        }
        Tail.next = newNode;
        Tail = newNode;
    }

    public void print() {
        Node temp = Head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void insertMiddle(int data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);

        Node temp = Head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static void main(String[] args) {

        LinkList ll = new LinkList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();

        ll.addLast(3);
        ll.addLast(4);
        ll.insertMiddle(8, 0);

        ll.print();
        System.out.println(size);
    }

}
