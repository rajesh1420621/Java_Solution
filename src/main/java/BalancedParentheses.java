import java.util.Stack;

public class BalancedParentheses {
    public boolean isValidParentheses(String s){
        Stack<Character> characterStack = new Stack<Character>();
        for (char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){

                characterStack.push(c);
            } else if (c == ')' && !characterStack.isEmpty() && characterStack.peek() == '(') {
                characterStack.pop();
                
            }else if (c == '}' && !characterStack.isEmpty() && characterStack.peek() == '{') {
                characterStack.pop();

            }else if (c == ']' && !characterStack.isEmpty() && characterStack.peek() == '[') {
                characterStack.pop();

            }else {
                return false;
            }
        }
        return characterStack.isEmpty();

    }

    public static void main(String[] args) {
        BalancedParentheses balancedParentheses = new BalancedParentheses();
        System.out.println("Is valid? " + balancedParentheses.isValidParentheses("[{()}]"));
    }
}
