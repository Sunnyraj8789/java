import java.util.*;
import java.util.ArrayList;
public class Graphs1 {
    public static void addEdge(ArrayList<ArrayList<Integer>> Adj,int u,int v){
        //un-directed graph (bi-Directional Graph)
        Adj.get(u).add(v);
        Adj.get(v).add(u);
    }
    public static void main(String[] args) {
        int V=4;
        //create adjacency list
        ArrayList<ArrayList<Integer>> Adj=new ArrayList<>(V);
        for(int i=0;i<V;i++){
            Adj.add(new ArrayList<Integer>());
        }
 
        //Add edges
        addEdge(Adj,0,1);
        addEdge(Adj,0,2);
        addEdge(Adj,1,3);
        addEdge(Adj,2,3);
        System.out.println(Adj);
    }
}
