import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(reverse(arr));
        // l1.remove(l1.size() - 7);
        // System.out.print(l1);

    }

    public static removeElement(int[] arr, int n){
        
    }

    public static LinkedList<Integer> reverse(int[] arr) {
        LinkedList<Integer> l1 = new LinkedList<>();
        for (int i : arr) {
            l1.add(i);
        }
        Collections.reverse(l1);
        return l1;
    }
}