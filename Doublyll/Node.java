// package Doublyll;

public class Node {
    int data;
   Node next;
   Node prev;

   public static void main(String[] args) 
   {
        DoubleLinkList db = new DoubleLinkList();
        db.addNode(10);
        db.addNode(20);
        db.addNode(30);
        db.addNode(40);
        db.addNode(50);

        db.display();
   }
}

class DoubleLinkList
{

    Node  head = null;
    Node  last = null;

    void addNode(int data){

        if(head == null)
        {
            head = new Node();
            head.data = data;
            head.next = null;
            head.prev = null;
            last = head;
        }else
        {
            Node tmp = new Node();
            tmp.data = data;
            tmp.next = null;
            tmp.prev = last;
            last.next = tmp;
            last = tmp;
        }
    }

    void display()
    {
        Node p = head;

        System.out.print("Linked List : ");
        while (p != null) 
        {
            System.out.print(p.data+"<->");
            p = p.next;    
        }
        System.out.println("\b\b\b   ");
    }
}