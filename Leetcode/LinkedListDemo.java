import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        
     LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        // System.out.println(l1); 
        Collections.reverse(l1);
        System.out.println(l1); 
        
        // l1.remove(l1.size() - 7);
        // System.out.print(l1);

    }
}