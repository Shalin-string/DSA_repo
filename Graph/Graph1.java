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
            System.out.println("Enter the source and destination and cost of the edge");
            int src = scr.nextInt();
            int dest = scr.nextInt();
            int cost = scr.nextInt();
            arr[src][dest] = cost;
            arr[dest][src] = cost;
        }           

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the source vertex");
        int fsource = scr.nextInt();

        for (int i = 0; i < v; i++) {
            if (arr[fsource][i] != 0) {
                System.out.println("Edge from " + fsource + " to " + i + " with cost " + arr[fsource][i]);
            }
        }

    }
    
}
