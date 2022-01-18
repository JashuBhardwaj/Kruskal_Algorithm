
// Test class for weighted Graphs
public class TestWeightedGraph {

	public static void main(String[] args) {
		

		WeightedGraphs weight = new WeightedGraphs(9);
		
		weight.add(0, 1, 4);
		weight.add(0, 7, 8);
		weight.add(1, 2, 8);
		weight.add(1, 7, 11);
		weight.add(2, 8, 2);
		weight.add(3, 4, 9);
		weight.add(4, 5, 10);
		weight.add(5, 6, 2);
		weight.add(6, 7, 1);
		weight.add(7, 8, 7);
		weight.add(6, 8, 6);
		weight.add(2, 5, 4);
		weight.add(3, 5, 14);
		weight.add(2, 3, 7);
		
		System.out.println("Edges = " + weight.E());
		
		System.out.println("Vertices = " + weight.V());
		
		for(Edge e : weight.edges()) {
			System.out.println(e.first + "---" + e.weight + "---" + e.second);
		}
		
		
	}

}
