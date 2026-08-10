import java.util.Scanner;

public class Graph1 {
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);

        int arr[][];
        System.out.println("Enter the number of vertices and edges");
        int v = scr.nextInt();
        int e = scr.nextInt();

        arr = new int[v][v];

        for (int i = 0; i < e; i++) {
            System.out.println("Enter the source and destination");
            int src = scr.nextInt();
            int dest = scr.nextInt();
            arr[src][dest] = 1;
            arr[dest][src] = 1;
        }           

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
