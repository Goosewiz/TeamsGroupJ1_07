package gusev.java23.task3;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckBrackets {
    private static Deque<String> stack = new ArrayDeque<>();

    public static int checkBrackets(String data) {
        for (int i = 0; i < data.length(); i++) {
            String temp = data.substring(i, i+1);
            String popResult;
            switch(temp){
                case "(", "{", "[":
                    stack.push(temp);
                    break;
                case ")":
                    if (stack.size() == 0)
                        return i;
                    popResult = stack.pop();
                    if (!popResult.equals("("))
                        return i;
                    break;
                case "}":
                    if (stack.size() == 0)
                        return i;
                    popResult = stack.pop();
                    if (!popResult.equals("{"))
                        return i;
                    break;
                case "]":
                    if (stack.size() == 0)
                        return i;
                    popResult = stack.pop();
                    if (!popResult.equals("["))
                        return i;
                    break;
            }
        }
        if (stack.size() != 0)
            return data.length();
        return -1;
    }
}
