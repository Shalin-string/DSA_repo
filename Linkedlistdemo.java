public class Linkedlistdemo {

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

    void addNodeBEG(int num){
        Node tmp = new Node();
        tmp.data = num;
        tmp.next = head;
        head = tmp;
    }
    
    void display(){
        Node p = head;
        try{
        while(p != null){
            System.out.println(p.data+" => "+  p.hashCode() + " => "+ p.next.hashCode() );
            p = p.next;
            }
        } catch(NullPointerException e){
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Linkedlistdemo s = new Linkedlistdemo();
        s.addNode( 10);
        s.addNode( 20);
        s.addNode( 30);
        s.addNode( 40);
        s.addNode(50);

        
        s.addNodeBEG(90);
        s.display();

        
        
    }
}
