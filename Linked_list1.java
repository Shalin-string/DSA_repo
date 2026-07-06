public class Linked_list1 {
    public static void main(String[] args) {
        sl s = new sl();
        s.addNode( 10);
        s.addNode( 20);
        s.addNode( 30);
        s.addNode( 40);
        s.addnodebeg(50);

        s.display();
        
    }
}

class sl{

    Node head;
    Node last;
    void addNode(int data){
        Node tmp = new Node();
        tmp.data = data;
        tmp.next = null;
        if(head == null){
            head = tmp;
            head.data = data;
            last = tmp;
        } else {
            last.next = tmp;
            last = tmp;
        }
    }
    void display(){
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    void addnodebeg(int data){
        Node tmp = new Node();
        tmp.data = data;
        tmp.next = head;
        head = tmp;
    }
}

class Node{
    int data;
    Node next;
    

}