import java.util.*;


public class WeightedGraphs {

	private int ver = 0;
	private int edge = 0;
	
	
	ArrayList<Edge> edges = new ArrayList<Edge>();
	
	
	
	public WeightedGraphs(int v) {
		this.ver = v;
	}
	
	//private int mat[][] = new int[ver][ver];
	
	public void add(int f, int s, int weg) {
		
		Edge e = new Edge();
		e.add(f, s, weg);
		edges.add(e);
		edge++;
	}
	
	
	
	public int V() {
		return this.ver;
	}
	
	public int E() {
		return this.edge;
	}
	
	public ArrayList<Edge> edges() {
		return edges;
	}
}
