class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        vector<int> ans;
        unordered_map<int, int> mp;
        for(const int n : nums) mp[n]++;
        for(auto [n, freq] : mp) 
            if(freq == 1) 
			    ans.push_back(n);
        return ans;
    }
};