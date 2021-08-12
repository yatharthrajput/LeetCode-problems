class Solution {
public:
    string addStrings(string s1, string s2) {
        
        if(s1.length()<s2.length()){
            return addStrings(s2,s1);
        }
        reverse(s1.begin(),s1.end());
        reverse(s2.begin(),s2.end());
        
        int i=0;
        int car = 0;
        while(i<s2.length()){
            
            s1[i] = (s1[i]-'0' + s2[i] + car);
            
            car = (s1[i]-48)/10;
            
            s1[i] = (s1[i]-48)%10 + 48;
            
            i++;
        }
        
        while(i<s1.length() and car>0){
            
            s1[i] = s1[i]-'0' + car + 48;
            
            car = (s1[i]-48)/10;
            
            s1[i] = (s1[i]-48)%10 + 48;
            
            i++;
        }
        
        if(car>0){
            s1.push_back(car+48);
        }
        
        reverse(s1.begin(),s1.end());
        return s1;
    }
};