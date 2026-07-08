public class LinnkListDemo2 
{
   Node head = null,last = null;
   
   
   void addNode(int num)
   {
     if(head == null)
    {
        Node tmp = new Node();
        tmp.data = num;
        tmp.next = null;
        head = tmp;
        last = tmp;
    }else{
        Node tmp = new Node();
        tmp.data = num;
        last.next = null;
        last.next = tmp;
        last = tmp;
    }    
   }

void linearSearch(int key)
{
    Node p = head;

    while(p != null)
    {
        if(p.data == key)
        {
            System.out.println(key + " Is Found ");
            return;
        }
        p = p.next;
    }
    System.out.println(key+ " Is Not Found ");
}
void display()
{
    Node p = head;

    while (p != null)
    {
        System.out.println(p.data+" : "+p+" ==> ");
        p = p.next;    
    }
}
public static void main(String[] args) 
    {
        LinnkListDemo2 list  = new LinnkListDemo2();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        list.display();

        list.linearSearch(40);
        list.linearSearch(60);
    }    
}