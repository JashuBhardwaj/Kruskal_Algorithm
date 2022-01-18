// Test class for Priority Queue for Weighted Graphs



public class TestPriorityQueue {

	public static void main(String[] args) {
		

		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
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
		
		for(Edge e : weight.edges()) {
			pq.add(e);
		}
		Edge temp;
		temp = pq.poll();
		System.out.println(temp.first + "---" + temp.weight + "---" + temp.second);
		
		temp = pq.poll();
		System.out.println(temp.first + "---" + temp.weight + "---" + temp.second);
		
		
		temp = pq.poll();
		System.out.println(temp.first + "---" + temp.weight + "---" + temp.second);
		
		temp = pq.poll();
		System.out.println(temp.first + "---" + temp.weight + "---" + temp.second);
		
		temp = pq.poll();
		System.out.println(temp.first + "---" + temp.weight + "---" + temp.second);
		
		temp = pq.poll();
		System.out.println(temp.first + "---" + temp.weight + "---" + temp.second);
		
		temp = pq.poll();
		System.out.println(temp.first + "---" + temp.weight + "---" + temp.second);
		
		temp = pq.poll();
		System.out.println(temp.first + "---" + temp.weight + "---" + temp.second);
		
		temp = pq.poll();
		System.out.println(temp.first + "---" + temp.weight + "---" + temp.second);
		
		temp = pq.poll();
		System.out.println(temp.first + "---" + temp.weight + "---" + temp.second);
		
		temp = pq.poll();
		System.out.println(temp.first + "---" + temp.weight + "---" + temp.second);
		
		temp = pq.poll();
		System.out.println(temp.first + "---" + temp.weight + "---" + temp.second);
		
		temp = pq.poll();
		System.out.println(temp.first + "---" + temp.weight + "---" + temp.second);
		
		
	}
		

}



