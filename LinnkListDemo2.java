public class LinnkListDemo2 {
    Node head = null, last = null;

    void addNode(int num) {
        if (head == null) {
            Node tmp = new Node();
            tmp.data = num;
            tmp.next = null;
            head = tmp;
            last = tmp;
        } else {
            Node tmp = new Node();
            tmp.data = num;
            last.next = null;
            last.next = tmp;
            last = tmp;
        }
    }

    void addNodeBEG(int num) {
        Node tmp = new Node();
        tmp.data = num;
        tmp.next = head;
        head = tmp;
    }

    void linearSearch(int key) {
        Node p = head;

        while (p != null) {
            if (p.data == key) {
                System.out.println(key + " Is Found ");
                return;
            }
            p = p.next;
        }
        System.out.println(key + " Is Not Found ");
    }

    void addNodeAny(int src, int data) {
        Node p = head;
        boolean isFound = false;

        if (head.data == src) {
            addNodeBEG(data);
        } else if (last.data == src) {
            addNode(data);
        }

        else {
            while (p != null) {
                if (p.data == src) {
                    isFound = true;
                    System.out.println(src + " Is Found ");
                    break;
                }
                p = p.next;
            }
            System.out.println(src + " Is Not Found ");

            if (isFound == false) {
                System.out.println("Src not found in list");
            } else {
                Node tmp = new Node();
                tmp.data = data;
                tmp.next = p.next;
                p.next = tmp;

            }
        }
    }

    void display() {
        Node p = head;

        while (p != null) {
            System.out.println(p.data + " : " + p + " ==> ");
            p = p.next;
        }
    }

    void count() {
        Node p = head;
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        System.out.println("Total Nodes Are : " + count);
    }

    void deleteBeg() {
        head = head.next;
    }

    void deleteEnd() {
        Node p =head;
        while (p.next != last) {
            p = p.next;
        }
        p.next = null;
        last = p;
    }

    void deleteAny(int src){
        if (head.data == src) {
            deleteBeg();
        }
        else if (last.data == src) {
            deleteEnd();
        }
        else{
            Node p = head;
            while (p.next.data != src) {
                p = p.next;
            }
            p.next = p.next.next;
        }
    }
    public static void main(String[] args) {
        LinnkListDemo2 list = new LinnkListDemo2();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNodeBEG(1);
        // list.display();

        // list.display();

        // list.linearSearch(40);
        // list.linearSearch(60);

        list.addNodeAny(40, 43);
        list.addNodeAny(80, 43);
        list.addNodeAny(43, 32);
        // list.display();
        System.out.println("\n-----------\n");
        list.deleteBeg();
        // list.display();
        list.deleteEnd();
        // list.display();
        list.deleteAny(30);
        list.display();
        // list.count();
    }
}