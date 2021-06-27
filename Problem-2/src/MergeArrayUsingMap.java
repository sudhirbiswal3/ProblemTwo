import java.util.HashMap;
import java.util.Map;

class MergeArrayUsingMap {

	static void mergeArrays(int a[], int b[], int n, int m) {

		Map<Integer, Boolean> mp = new HashMap<Integer, Boolean>();

		for (int i = 0; i < n; i++) {
			mp.put(a[i], true);
		}
		for (int i = 0; i < m; i++) {
			mp.put(b[i], true);
		}
		
		for (Map.Entry<Integer, Boolean> me : mp.entrySet()) {
			System.out.print(me.getKey() + " ");
		}
	}

	// Driver Code
	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 7,8 }, b[] = { 2, 4, 6, 9,10 };
		int size = a.length;
		int size1 = b.length;

		// Function call
		mergeArrays(a, b, size, size1);
	}
}

// This code is contributed by rag2127