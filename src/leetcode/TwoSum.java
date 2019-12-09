package leetcode;

import java.util.HashMap;

/**
 * @author su
 * @create 2019-12-09 10:11
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 */
public class TwoSum {
    /**
    * 使用一层循环，每遍历到一个元素就计算该元素与 target之间的差值，然后到 HashMap中寻找该差值，
    * 如果找到，则返回两个元素在数组 nums的下标，如果没有找到，则将当前元素存入 HashMap中
    * key 存放数值
    * value存放下标
    * */
    public int[] twoSum(int [] nums ,int target){
        HashMap<Integer,Integer> map = new HashMap();
        int [] res = new int[2];
        for(int i=0;i<nums.length;i++){
            int dif = target - nums[i];
            if(map.get(dif)!=null){
                res[0] = map.get(dif);
                res[1] = i;
                return res;
            }

            map.put(nums[i],i);
        }
        return res;
    }
}
