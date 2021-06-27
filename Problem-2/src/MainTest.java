import java.util.Arrays;

public class MainTest {

	public static void main(String[] args) {
		int a[] = {1,3,5,7,8};
		int n1 = a.length;
		
		int b[]	= {2,4,6,9,10};
		int n2 = b.length;
	
		int[] merge = new int[ n1+n2];
		
		int i =0, j = 0, k=0;
		
		while(i < n1 & j <n2){			
			if(a[i] < b[j]){
				merge[k++] = a[i++];				
			}else{
				merge[k++] = b[j++];
			}			
		}
		
		
		while(i<n1){			
			merge[k++] = a[i++];
	    }
		
		while(j<n2){
			System.out.println("2");
			merge[k++] = b[j++];
		}
		
		System.out.println("a:"+Arrays.toString(a));
		System.out.println("b:"+Arrays.toString(b));
		System.out.println("merge:"+Arrays.toString(merge));
	}

}
