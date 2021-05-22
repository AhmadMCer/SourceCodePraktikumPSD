package modul6;

public class List implements Stack{
    Node tos;

    public void push(Node input) {
        if (isEmpty())
            tos = input;
        else {
            input.next = tos;
            tos = input;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            Node temp = tos;
            tos = tos.next;
            temp.next = null;
            return Integer.parseInt(temp.data.toString());
        } else
            System.out.println("Tidak bisa karena stack kosong!");
        return 0;
    }

    public boolean isEmpty() {
        return tos == null;
    }

    public void show() {
        if (!isEmpty()) {
            Node temp = tos;
            while (temp != null) {
                System.out.println(temp.data.toString()+"\n");
                temp = temp.next;
            }
        } else
            System.out.println("Stack kosong!");
    }

    public void makeEmpty() {
        tos = null;
        System.out.println("Data berhasil dihapus semua!");
    }

    public void top() {
        Node temp = tos;
        System.out.println("TOP sekaang : " + temp.data);
    }

    public void topAndPop() {
        this.top();
        this.pop();
    }
}
