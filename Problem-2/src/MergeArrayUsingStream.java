import java.util.Arrays;
import java.util.stream.Stream;

public class MergeArrayUsingStream {
	public static <T> Object[] mergeArray(T[] arr1, T[] arr2) {
		return Stream.of(arr1, arr2).flatMap(Stream::of).sorted().toArray();
	}

	public static void main(String[] args) {
		Integer[] firstArray = new Integer[] { 1, 3, 5, 7,8}; 
		Integer[] secondArray = new Integer[] {  2, 4, 6, 9,10  }; 
		Object[] mergedArray = mergeArray(firstArray, secondArray); 
		System.out.println("Merged array: " + Arrays.toString(mergedArray));

	}

}
