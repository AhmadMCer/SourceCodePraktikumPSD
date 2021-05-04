package modul4;

public class LinkedList implements List {
    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Node input) {
        if (isEmpty()) {
            head = input;
            tail = input;
        } else {
            input.next = head;
            head = input;
        }
    }

    public void addLast(Node input) {
        if (isEmpty()){
            head = input;
            tail = input;
        } else {
            tail.next = input;
            tail = input;
        }
    }

    public void insertAfter(int key, Node input) {
        Node temp = head;
        boolean found = false;
        do {
            if (temp.data == key){
                input.next = temp.next;
                temp.next = input;
                found = true;
                System.out.println("Memasukkan data "+input.data+" setelah data "+key+" sukses");
                break;
            }
            temp = temp.next;
        }
        while (temp != null);
        if (!found)
            System.out.println("Data "+key+" tidak ditemukan!");
    }

    public void insertBefore(int key, Node input) {
        try {
            Node temp = head;
            while (temp != null){
                if (temp.data == key && temp == head){
                    this.addFirst(input);
                    System.out.println("Memasukkan data "+input.data+
                            " sebelum data "+key+" sukses!");
                    break;
                } else  if (temp.next.data == key){
                    input.next = temp.next;
                    temp.next = input;
                    System.out.println("Memasukkan data "+input.data+
                            " sebelum data"+key+" sukses!");
                    break;
                } temp = temp.next;
            }
        } catch (Exception e){
            System.out.println("Data "+key+" tidak ditemukan!");
        }
    }

    public void insert(int index, Node input) {
        Node temp = head;
        boolean found = false;
        int i = 0;
        while (temp != null){
            if (index == 0){
                this.addFirst(input);
                found = true;
                System.out.println("Data "+input.data+" berhasil " +
                        "dimasukkan pada index "+index);
                break;
            } else if (i == index-1){
                input.next = temp.next;
                temp.next = input;
                found = true;
                System.out.println("Data "+input.data+" berhasil " +
                        "dimasukkan pada index "+index);
                break;
            }else{
                temp = temp.next;
                i++;
            }
        }
        if (!found)
            System.out.println("Index "+index+" out of bound");
    }

    public void replace(int data1, int data2) {
        Node temp = head;
        boolean found = false;
        while (temp != null){
            if (temp.data == data1){
                temp.data = data2;
                found = true;
                System.out.println("Data "+data1+" berhasil diganti " +
                        "dengan data "+data2);
            } else {
                temp = temp.next;
            }
        }
        if (!found){
            System.out.println("Data "+data1+" tidak ditemukan!");
        }
    }

    public void remove(int data) {
        try {
            Node temp = head;
            while (temp != null){
                if (temp.next.data == data){
                    temp.next = temp.next.next;
                    System.out.println("Data " +data+ " berhasil dihapus");
                    break;
                } else if (temp.data == data && temp == head){
                    this.removeFirst();
                    System.out.println("Data "+data+" berhasil dihapus");
                    break;
                } temp = temp.next;
            }
        } catch (Exception e){
            System.out.println("Data "+data+" tidak ditemukan");
        }
    }

    public void removeAt(int index) {
        try {
            Node temp = head;
            boolean found = false;
            int i = 0;
            while (temp != null) {
                if (index == 0){
                    this.removeFirst();
                    System.out.println("Data index ke-" +index+ " berhasil dihapus");
                    break;
                } else if (i == index-1) {
                    temp.next = temp.next.next;
                    System.out.println("Data index ke-" +index+ " berhasil dihapus");
                    break;
                } else {
                    temp = temp.next;
                    i++;
                }
            }
        } catch (Exception e){
            System.out.println("Data index ke-" +index+ " tidak ditemukan");
        }
    }

    public void removeFirst() {
        Node temp = head;
        if (!isEmpty()){
            if (head == tail){
                head = tail = null;
            } else {
                head = temp.next;
                temp.next = null;
                temp = null;
            }
        } else {
            System.out.println("List kosong");
        }
    }

    public void removeLast() {
        Node temp = head;
        if (!isEmpty()){
            if (tail == head){
                head = tail = null;
            } else {
                while (temp.next != tail){
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                temp = null;
            }
        } else {
            System.out.println("List kosong!");
        }
    }

    public void clear() {
        head = null;
        tail = null;
        System.out.println("Seluruh data berhasil dihapus");
    }

    public void find(int data) {
        int i = 0;
        boolean found = false;
        Node temp = head;
        while (temp != null){
            if (temp.data == data){
                found = true;
                System.out.println(data+" ditemukan pada index ke"+i);
            }
            i++;
            temp = temp.next;
        }
        if (!found){
            System.out.println("Data tidak ditemukan");
        }
    }

    public void printNode() {
        Node temp;
        temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printNodes(Node input) {
        Node temp;
        temp = input;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int length() {
        Node temp = head;
        int i = 0;
        if (isEmpty())
            System.out.println("data kosong!");
        else{
            while (temp != null){
                temp = temp.next;
                i++;
            }
        }
        System.out.println("Panjang data : "+i);
        return i;
    }
}
