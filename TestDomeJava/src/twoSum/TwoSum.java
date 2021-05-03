package twoSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
    	int l, r;
    	List<Integer> tmp = new ArrayList<Integer>();
    	
    	Arrays.stream(list).forEach(x->tmp.add(x));
    	
    	Arrays.sort(list);
    	l = 0;
        r = list.length - 1;
        while (l < r) {
            if (list[l] + list[r] == sum)
                return new int[] {tmp.indexOf(list[l]),tmp.indexOf(list[r])};
            else if (list[l] + list[r] < sum)
                l++;
            else 
                r--;
        }
    	
    	return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}