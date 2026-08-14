import java.util.ArrayList;
import java.util.Scanner;

public class GraphDyn {
    public static void main(String[] args) {

        ArrayList<Edge> edge = new ArrayList<Edge>();
        Scanner src = new Scanner(System.in);
        System.out.println("Enter no of edges :");
        int Av_edges = src.nextInt();
        for (int i = 1; i <= Av_edges; i++) {
            Edge e = new Edge();
            System.out.println("Enter source and destination : ");
            e.src = src.nextInt();
            e.dest = src.nextInt();
            edge.add(e);

            Edge rev = new Edge();
            rev.src = e.dest;
            rev.dest = e.src;
            edge.add(rev);
        }
        System.out.println("Source " + " : " + "Destination");
        for (int i = 0; i < 14; i++) {
            // System.out.println(edge.get(i).src + " : "+edge.get(i).dest);

        }

        System.out.println("Enter source :");
        int data = src.nextInt();
        for (int i = 0; i < edge.size(); i++) {
            if (data == edge.get(i).src) {
                System.out.println(edge.get(i).src + " : " + edge.get(i).dest);
            }
        }
        GraphDyn gdma = new GraphDyn();
        System.out.println("Enter current to start : ");
        int curr = src.nextInt();
        ArrayList<Integer> vis = new ArrayList<>();
        gdma.dfs(curr, vis, edge);
    }

    void dfs(int current, ArrayList<Integer> visited, ArrayList<Edge> edges) {
        System.out.println("current visiting vertext : "+current);
        visited.add(current);
        for(int i=0; i<edges.size();i++){
            if (edges.get(i).src == current && !(visited.contains(edges.get(i).dest))) {
                current = edges.get(i).dest;
                dfs(current, visited, edges);
                System.out.println("Current visiting vertext -> rev : "+current);
            }
        }
    }

}

class Edge {
    int src;
    int dest;
}