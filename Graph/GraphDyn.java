import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.standard.Destination;

public class GraphDyn {
    public static void main(String[] args) {
        
        ArrayList<Edge> edge = new ArrayList<Edge>();
        Scanner src = new Scanner(System.in);
        for(int i =1; i<=7; i++){
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
        System.out.println("Source "+" : "+"Destination");
        for(int i=0;i<14;i++){
            System.out.println(edge.get(i).src + " : "+edge.get(i).dest);

        }
    }

}

class Edge{
    int src;
    int dest;
}

/*
10 1
1 11 
11 6
6 10
10 7
7 1
7 11
 */