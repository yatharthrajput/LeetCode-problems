public boolean isPrefixString(String s, String[] words) {
  int i = 0;
  for (String word : words) {
      for (int j = 0; j < word.length(); j++) {
          if(i < s.length() && s.charAt(i++) != word.charAt(j)) {
            return false;
          }
          if (i == s.length()) {
             if (j == word.length() - 1)
              return true;  
             else
              return false; 
          } 
      }     
  }
  return false;
}
}