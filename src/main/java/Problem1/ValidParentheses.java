package Problem1;

public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        // homework
        // !!! must use ArrayStack or LinkedListStack from problem 1
        //return false; // place holder
        ArrayStack s = new ArrayStack(str.length());
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            char current = c[i];
            if (current == '[' || current == '(' || current == '{') {
                s.push(current);
            } else if (current == ']') {
                if (s.isEmpty() || (char) s.pop() != '[') {
                    return false;
                } else if (current == '}') {
                    if (s.isEmpty() || (char) s.pop() != '{') {
                        return false;
                    }
                } else if (current == ']') {
                    if (s.isEmpty() || (char) s.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return s.isEmpty();
    }
}
