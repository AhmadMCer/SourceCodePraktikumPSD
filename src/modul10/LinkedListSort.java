package modul10;

public class LinkedListSort {
    Node head, tail, sorted;

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int data) {
        Node input =  new Node(data);

        if (isEmpty()) {
            head = input;
            tail = input;
        } else {
            tail.next = input;
            tail = input;
        }
    }

    public void printNodes() {
        Node current = head;

        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }

        System.out.println();
    }

    public void bubbleSort() {
        Node current = head, opponent;
        int temp;

        if (!isEmpty()) {
            while (current != null) {
                opponent = current.next;

                while (opponent != null) {
                    if (current.data > opponent.data) {
                        temp = current.data;
                        current.data = opponent.data;
                        opponent.data = temp;
                    }

                    opponent = opponent.next;
                }
                current = current.next;
            }
        }
    }

    public void selectionSort() {
        for (Node node1 = head; node1 != null; node1 = node1.next){
            Node min = node1;

            for (Node node2 = node1; node2 != null; node2 = node2.next){
                if (min.data > node2.data){
                    min = node2;
                }
            }

            Node temp = new Node(node1.data);
            node1.data = min.data;
            min.data = temp.data;
        }
    }

    void insertionSort() {
        Node current = head;

        while (current != null) {
            Node next = current.next;
            sortedInsert(current);
            current = next;
        }

        head = sorted;
    }

    void sortedInsert(Node newnode) {
        if (sorted == null || sorted.data >= newnode.data) {
            newnode.next = sorted;
            sorted = newnode;
        } else {
            Node current = sorted;

            while (current.next != null && current.next.data < newnode.data) {
                current = current.next;
            }

            newnode.next = current.next;
            current.next = newnode;
        }
    }
}
