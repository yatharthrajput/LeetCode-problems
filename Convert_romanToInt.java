class Solution {
    public int romanToInt(String s) {
        int[] b = new int[s.length()];
        int sum = 0;
        
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='M') b[i] = 1000;
            if (s.charAt(i)=='D') b[i] = 500;
            if (s.charAt(i)=='C') b[i] = 100;
            if (s.charAt(i)=='L') b[i] = 50;
            if (s.charAt(i)=='X') b[i] = 10;
            if (s.charAt(i)=='V') b[i] = 5;
            if (s.charAt(i)=='I') b[i] = 1;
        }
        for (int i=0; i<b.length-1; i++){
            if (b[i]<b[i+1]) b[i] = -b[i];
            sum += b[i];
        }
        return sum + b[b.length-1];
    }
}
