package Solution;

public class NumArray {
    int[] prim = new int[]{};
    int[] orig = new int[]{};
    
    public NumArray(int[] nums) {
        int curr = 0;
        prim = nums;
        orig = nums;
        for(int i = 0; i < nums.length; i++)
        {
            curr += nums[i];
            prim[i] = curr;
        }
    }
    
    public void update(int index, int val) {
        for(int i = index; i < prim.length; i++)
        {
            prim[i] += (val - orig[index]);
        }
        orig[index] = val; 
    }
    
    public int sumRange(int left, int right) {
        return prim[right] - prim[left] + orig[left];
    }
}
