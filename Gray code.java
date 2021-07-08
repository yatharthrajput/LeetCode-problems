class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> nums= new ArrayList<Integer>();
        nums.add(0);
        if(n==0){
            
            return nums;
        }
        int incr=1;
        for(int i=0;i<n;i++){
            
           for(int j=nums.size()-1;j>=0;j--){
                nums.add(nums.get(j)+incr);
              
        }
         incr=incr*2;
    }
        
        return nums;
}
}