import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class ValidBrackets {
//    Given a string s containing just the characters '(', ')', '{', '}',
//            '[' and ']', determine if the input string is valid.
//    An input string is valid if:
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//    Every close bracket has a corresponding open bracket of the same type.

    public boolean isValid(String string){
        Stack<String> characterStack = new Stack<>();
        List<String> characters =
        Arrays.asList(string.split(""))
                .stream()
                .collect(Collectors.toList());
        return
        characters.stream()
                .collect(Collectors.mapping(
                        c -> {
                            if (c.equalsIgnoreCase("[") || c.equalsIgnoreCase("{") || c.equalsIgnoreCase("(")) {
                                characterStack.push(c);
                            }else if (!characterStack.empty() && c.equalsIgnoreCase("]") && characterStack.peek().equalsIgnoreCase("[")) {
                                characterStack.pop();
                            }else if (!characterStack.empty() && c.equalsIgnoreCase("}") && characterStack.peek().equalsIgnoreCase("{")) {
                                characterStack.pop();
                            }else if (!characterStack.empty() && c.equalsIgnoreCase(")") && characterStack.peek().equalsIgnoreCase("(")) {
                                characterStack.pop();
                            }else {
                                return false;
                            }
                            return characterStack.empty();
                        }, Collectors.toList()
                        ))
                .stream()
                .reduce((a,b) -> b)
                .orElse(false);
    }
}
