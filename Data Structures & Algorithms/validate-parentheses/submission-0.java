class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(char ch :s.toCharArray()){
            if(ch =='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else {
                if(stack.isEmpty()) return false;
                //if not empty then pop and check
                char top = stack.pop();
                if((ch=='}' && top!='{') ||(ch==')'&& top !='(')
                || (ch== ']' && top !='[')){
                    return false;
                }
            }
        
        }
        return stack.isEmpty();
    }
}
