// Union and Find class for graph


import java.util.*;


public class UF {

	private int rank[];
	private int parent[];

	public UF(int cap) {
		
		rank = new int[cap];
		parent = new int[cap];
		for(int i = 0; i < parent.length; i++) {
			
			this.parent[i] = i;
		
		}
		
	}
	
    
	
	public int parentOf(int n) {
	
		if(this.parent[n] == n) {
			return n;
		}
		
	    return this.parent[n] = parentOf(this.parent[n]);
	}
	
	
	public boolean connected(int v, int w) {
		
		if(parentOf(v) == parentOf(w)) {
			
		    return true;	
		}
		
		return false;
	}

	public void union(int v, int w) {
		
		v = parentOf(v);
		w = parentOf(w);
		
		if(rank[v] > rank[w]) {
			this.parent[w] = v;
		}
		else if(rank[w] > rank[v]) {
			this.parent[v] = w;
			
		}
		else {
			this.parent[w] = v;
			rank[v]++;
		}
	}
}
