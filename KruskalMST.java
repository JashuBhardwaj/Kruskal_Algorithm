// Impelented class for Kruskal Algorithm (Minimum Spanning Tree)


import java.util.*;

public class KruskalMST {

	
	private ArrayList<Edge> mst = new ArrayList<Edge>();
	 
	public KruskalMST(WeightedGraphs G) {
		
		PriorityQueue pq = new PriorityQueue();
		
		for(Edge e : G.edges()) {
			pq.add(e);
		}
		
		UF uf = new UF(G.V());
		
		while(!pq.isEmpty() && mst.size() < G.V() - 1) {
			
			Edge temp = (Edge)pq.poll();
			
			int f = temp.first;
			int s = temp.second;
			
			if(!uf.connected(f, s)) {
				uf.union(f, s);
				mst.add(temp);
			}
			
		}
		

	}
	
	public Iterable<Edge> edges(){
		
		return mst;
	}
	
}
