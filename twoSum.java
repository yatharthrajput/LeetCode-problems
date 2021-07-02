class TwoSum {
    public:
        vector<int> twoSum(vector<int>& nums, int target) {
            unordered_map<int,int> hmap;
            vector<int> indices;
            for(int i=0; i<nums.size(); ++i){
                int diff = target - nums[i];
                if(hmap.find(diff)==hmap.end()){
                    hmap.insert(make_pair(nums[i],i));
                }
                else{
                    indices.push_back(hmap[diff]);
                    indices.push_back(i);
                }
            }
            return indices;
        }
            
        };
    