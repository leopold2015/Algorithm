import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int[] twoSum1(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[j] == target - nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSum2(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement) && map.get(complement)!=i){
                return new int[] {i,map.get(complement)};
            }
        }
        throw new IllegalArgumentException("no two sum solution!");
    }

    //good
    public static int[] twoSum3(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no two sum solution!");
    }
    public static void output(int[] ary){
        System.out.print("[");
        for(int i=0;i<ary.length;i++){
            System.out.print(ary[i]);
            if(i<ary.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] nums ={2,7,11,15};
        int target = 9;
        output(twoSum1(nums,target));

        output(twoSum2(nums,target));

        output(twoSum3(nums,target));
    }
}
