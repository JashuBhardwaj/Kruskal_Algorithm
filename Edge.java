
// Edge class

public class Edge implements Comparable<Edge>{
	
    private int first = 0;
		private int second = 0;
		private int weight = 0;
		
		
		public void add(int f, int s, int weg) {
			this.first = f;
			this.second = s;
			this.weight = weg;
			
		}
		
		

		@Override
		public int compareTo(Edge e) {
			// TODO Auto-generated method stub
			
			if(this.weight > e.weight) {
				return 1;
			}
			else if(this.weight < e.weight){
				return -1;
			}
			return 0;
		}
	}

	

