class Solution {
    public int[] twoSum(int[] nums, int target) {
        int checksum=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                checksum= nums[i]+nums[j];
                if(checksum==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}