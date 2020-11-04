import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int array[] = {3,6,9,4,2,1};
		rotate(array, 3);
		for (int i : array) {
			System.out.println(i);
		}
	}

	public static void rotate(int[] nums, int k) {
	    if(k > nums.length) 
	        k=k%nums.length;
	 
	    int[] result = new int[nums.length];
	 
	    for(int i=0; i < k; i++){
	        result[i] = nums[nums.length-k+i];
	    }
	 
	    int j=0;
	    for(int i=k; i<nums.length; i++){
	        result[i] = nums[j];
	        j++;
	    }
	 
	    System.arraycopy( result, 0, nums, 0, nums.length );
	}

}
