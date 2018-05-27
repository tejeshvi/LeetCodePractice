package AlgorithmEasy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {2, 7, 11, 15};
		TwoSum twoSum= new TwoSum();
		int[] result= twoSum.twoSum(nums,26);
		System.out.println("index1:"+result[0]+" index2:"+result[1]);
	}
	public int[] twoSum(int[] nums, int target) {
		/*for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] == target - nums[i]) {
                return new int[] { i, j };
            }
        }
    }
    throw new IllegalArgumentException("No two sum solution");
    }*/
		/* Map<Integer, Integer> map = new HashMap<>();
		    for (int i = 0; i < nums.length; i++) {
		    	System.out.println(nums[i]+"i"+i);
		        map.put(nums[i], i);
		    }
		    for (int i = 0; i < nums.length; i++) {
		        int complement = target - nums[i];
		        if (map.containsKey(complement) && map.get(complement) != i) {
		            return new int[] { i, map.get(complement) };
		        }
		    }
		    throw new IllegalArgumentException("No two sum solution");*/
		
		Map<Integer, Integer>map=new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{
			int complement = target-nums[i];
			if(map.containsKey(complement))
			{
				return new int[] {i,map.get(complement)};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
		 
	

}
