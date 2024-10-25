class Solution {
    public boolean isValid(String s) {
        Stack<Character> stringS = new Stack<>();
         for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='[') stringS.push(c);
            else {
            if(stringS.isEmpty()) return false;
            char p = stringS.peek();
            if(p=='(' && c!=')') return false;
            else if(p=='{' && c!='}') return false;
            else if(p=='[' && c!=']') return false;
            stringS.pop();
         }
         
    }
    return stringS.isEmpty();
}
}