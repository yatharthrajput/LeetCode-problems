class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st=new Stack<>();
        
        for(int i = 0;i<s.length();i++){
            switch(s.charAt(i)){
                    case '(' :{
                    st.push('(');
                        break;}
                    case '[' :{
                    st.push('[');
                        break;}
                    case '{' :{
                    st.push('{');
                        break;}
                        
                    case ')' :{
                    if (st.empty()==true || st.peek()!= '('){
                        return false;}
                    else{
                        st.pop();
                    }
                        break;
                        }
                   case ']' :{
                    if (st.empty()==true || st.peek()!= '['){
                        return false;}
                    else{
                        st.pop();
                    }
                        break;
                        }
                          case '}' :{
                    if (st.empty()==true || st.peek()!= '{'){
                        return false;}
                    else{
                        st.pop();
                    }
                        break;
                        }  
                    }
                       
            }
        
        return ((st.size()==0)? true:false);
        }
        
    }
