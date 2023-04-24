import java.util.Iterator;

public class Range implements Iterable<Integer> {
	int start, end, step;
	
	public Range(int end) {
		start = 0;
		this.end = end;
		step = 1;
	}
	
	public Range(int start, int end, int step) {
		this.start = start;
		this.end = end;
		this.step = step;
	}
	
	public Iterator<Integer> iterator() {
		RangeIterator iter = new RangeIterator();
		iter.init(start);
		return iter;
	}

	private class RangeIterator implements Iterator<Integer> {
		int current;
		
		public RangeIterator() {
		}
		
		public void init(int start) {
			current = start;
		}
		
		public Integer next() {
			Integer res = current;
			current += step;
			return res;
		}
		
		public boolean hasNext() {
			return current < end;
		}
	}

	
	public static void main(String[] args) {
		
		for (Integer i: new Range(10)) {
			for (int j: new Range(5,10,2)) {
				String out = String.format("%d, %d", i, j);
				System.out.println(out);
			}
		}
		
	}

	
}


	
