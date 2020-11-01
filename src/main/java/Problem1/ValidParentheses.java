package Problem1;

import java.lang.reflect.Array;

public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        // homework
        // !!! must use ArrayStack or LinkedListStack from problem 1
        //return false; // place holder
        ArrayStack s = new ArrayStack(str.length()-1);
        char[] c = str.toCharArray();
        boolean answer = false;
        for(int i = 0; i < c.length - 1; i++) {
            char current = c[i];
            if (current == '(' || current == '{' || current == '[') {
                s.push(current);
            }
            if (s != null) {
                char check = (char) s.pop();
                switch (current) {
                    case ')':
                        if (check == '{' || check == '[') {
                        } else if (check == ')') {
                            s.push(current);
                            return false;
                        }
                        break;
                    case '}':
                        if (check == '(' || check == '[') {
                        } else if (check == '}') {
                            s.push(current);
                            return false;
                        }
                        break;
                    case ']':
                        if (check == '{' || check == '(') {

                        } else if (check == ']') {
                            s.push(current);
                            return false;
                        }
                        break;
                }
            }
        }
        return false;
    }
}
