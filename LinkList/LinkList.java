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

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Link List is empty");
            return -1;
        }
        int val = Head.data;

        if (size == 1) {
            Head = Tail = null;
            size--;
            return val;
        }

        Head = Head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LinkList is empty");
            return -1;
        }
        if (size == 1) {
            Head = Tail = null;
            return 0;
        }
        Node temp = Head;

        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;

        }

        int val = temp.next.data;
        temp.next = null;
        Tail = temp;
        return val;

    }

    public int linearSearch(int key) {
        Node temp = Head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
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
        System.out.println(ll.removeFirst());
        ll.print();
        System.out.println(ll.removeLast());
        ll.print();
        System.out.println(ll.linearSearch(3));
        System.out.println(ll.linearSearch(10));
    }

}
