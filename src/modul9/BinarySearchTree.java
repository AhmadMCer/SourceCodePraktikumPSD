package modul9;

public class BinarySearchTree {
    Node root;

    boolean isEmpty() {
        return root == null;
    }

    void insert(Node input) {
        Node temp = root;
        Node parent = null;
        boolean flag = false;

        if (isEmpty()) {
            root = input;
        } else {
            while (temp != null) {
                parent = temp;
                if (input.data < temp.data) {
                    temp = temp.left;
                    flag = true;
                } else if (input.data > temp.data) {
                    temp = temp.right;
                    flag = true;
                } else {
                    System.out.println("Data tidak boleh ada duplikasi");
                    break;
                }
            }

            if (flag) {
                if (input.data > parent.data) {
                    parent.right = input;
                } else if (input.data < parent.data) {
                    parent.left = input;
                } else {
                    System.out.println("Data tidak boleh ada duplikasi!");
                }
            }
        }
    }

    void find(int cari) {
        Node temp = root;
        boolean cek = false;
        while (temp != null) {
            if (cari < temp.data) {
                temp = temp.left;
            } else if (cari > temp.data) {
                temp = temp.right;
            } else if (cari == temp.data) {
                cek = true;
                break;
            }
        }

        if (cek) {
            System.out.println("Data " + cari + " ditemukan!");
        } else {
            System.out.println("Data tidak ditemukan!");
        }
    }

    Node findMax() {
        Node temp = root;
        if (isEmpty()) {
            return null;
        } else {
            while (temp.right != null) {
                temp = temp.right;
            }

            return temp;
        }
    }

    Node findMin() {
        Node temp = root;
        if (isEmpty()) {
            return null;
        } else {
            while (temp.left != null) {
                temp = temp.left;
            }

            return temp;
        }
    }

    public void remove(int input) {
        root = remove(input, root);
    }

    private Node remove(int input, Node temp) {
        if (temp == null) {
            return null;
        }

        if (input == temp.data) {
            if (temp.left == null && temp.right == null) {
                return null;
            }

            if (temp.left == null) {
                return temp.right;
            }

            if (temp.right == null) {
                return temp.left;
            }

            temp.data = temp.right.data;
            temp.right = remove(temp.data, temp.right);
        } else if (input < temp.data) {
            temp.left = remove(input, temp.left);
        } else {
            temp.right = remove(input, temp.right);
        }

        return temp;
    }

    private boolean checking(int input) {
        Node temp = root;
        while (temp != null) {
            if (input < temp.data) {
                temp = temp.left;
            } else if (input > temp.data) {
                temp = temp.right;
            } else if (input == temp.data) {
                return true;
            }
        }

        return false;
    }

    void removeAll() {
        if (isEmpty()) {
            System.out.println("Tree masih kosong!");
        } else {
            root = null;
            System.out.println("Data berhasil dihapus semua!");
        }
    }

    void findDirectory(int input) {
        if (isEmpty()) {
            System.out.println("Tree masih kosong");
        } else {
            if (this.checking(input) == true) {
                Node temp = root;
                while (temp != null) {
                    if (input > temp.data) {
                        System.out.print(temp.data + " , ");
                        temp = temp.right;
                    } else if (input < temp.data) {
                        System.out.print(temp.data + " , ");
                        temp = temp.left;
                    } else if (input == temp.data) {
                        System.out.print(input);
                        break;
                    }
                }
            } else {
                System.out.println("Data tidak ditemukan di dalam tree!");
            }
        }
    }

    public int getLeafCount() {
        return this.getLeafCountHelper(root);
    }

    private int getLeafCountHelper(Node data) {
        if (data == null) {
            return 0;
        } else if (data.left == null && data.right == null) {
            return 1;
        } else {
            return this.getLeafCountHelper(data.left) + this.getLeafCountHelper(data.right);
        }
    }

    void order(int code) {
        switch (code) {
            case 1:
                preOrder(root);
                System.out.println();
                break;
            case 2:
                inOrder(root);
                System.out.println();
                break;
            case 3:
                postOrder(root);
                System.out.println();
                break;
            case 4:
                preOrder(root);
                System.out.println();
                inOrder(root);
                System.out.println();
                postOrder(root);
                System.out.println();
                break;
            case 0:
                break;
            default:
                System.out.println("[EROR] Kode salah!");
        }
    }

    private void preOrder(Node temp) {
        if (!isEmpty()) {
            if (temp != null) {
                System.out.print(temp.data + " ");
                preOrder(temp.left);
                preOrder(temp.right);
            }
        } else {
            System.out.println("[EROR] Tree masih kosong!");
        }
    }

    private void inOrder(Node temp) {
        if (!isEmpty()) {
            if (temp != null) {
                inOrder(temp.left);
                System.out.print(temp.data + " ");
                inOrder(temp.right);
            }
        } else {
            System.out.println("[EROR] Tree masih kosong!");
        }
    }

    private void postOrder(Node temp) {
        if (!isEmpty()) {
            if (temp != null) {
                postOrder(temp.left);
                postOrder(temp.right);
                System.out.print(temp.data + " ");
            }
        } else {
            System.out.println("[EROR] Tree masih kosong!");
        }
    }
}
