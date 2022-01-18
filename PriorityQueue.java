// Self implemented Priority Queue

import java.util.*;

public class PriorityQueue<Key> {

	private int n = 0;
	private Key[] pq;
	
	public PriorityQueue() {
		this(1);
	}
	
	private PriorityQueue(int cap) {
		pq = (Key[]) new Object[cap + 1];
	}
	
	public void add(Key key) {
		
		if(this.pq.length - 1 == n) {
			resize(this.pq.length * 2);
		}
		pq[++n] = key;
		swim(n);
	}
	
	public Key poll() {
		
		Key min = pq[1];
		exch(1, n--);
		sink(1);
		pq[n + 1] = null;
		
		if(this.n > 0 && this.n < this.pq.length / 4) {
			this.resize(this.pq.length / 2);
		}
		
		return min;
	}
	
	public Key peek() {
		return pq[1];
	}
	
	private void exch(int i, int j) {
		Key  temp = pq[i];
		pq[i] = pq[j];
		pq[j] = temp;
	}
	
	private void resize(int cap) {
		Key temp[] = (Key[]) new Object[cap + 1];
		for(int i = 0; i <= n; i++) {
			temp[i] = this.pq[i];
		}
		
		pq = temp;
	}
	
	private boolean great(int i, int j) {
		
		return (((Comparable<Key>)this.pq[i]).compareTo(this.pq[j]) ) > 0;
		
		//return (((Comparable<Key>)this.pq[i]).compareTo(this.pq[j])) < 0;
	}
	
	private void swim(int k) {
		
		while(k > 1) {
			
			if(!great(k, k / 2)) {
				exch(k, k / 2);
			}else {
				break;
			}
			
			k = k / 2;
		}
	}
	
	private void sink(int k) {
		
		int j = k;
		
		while(2 * k <= n) {
			
			j = 2 * k;
			if(j < n && great(j, j + 1)) {
				j++;
			}
			if(great(k, j)) {
				exch(k, j);
			}
			else {
				break;
			}
			
			k = j;
		}
	}
	
	public boolean isEmpty() {
		return pq[1] == null;
	}
}
