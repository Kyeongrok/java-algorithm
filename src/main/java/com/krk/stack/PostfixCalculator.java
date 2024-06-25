package com.krk.stack;

import java.util.Stack;
import java.util.StringTokenizer;

public class PostfixCalculator {

    private String operators = "(){}[]+-*/^";

    private int inStackPriority(String s) {
        switch (s) {
            case "^": return 5;
            case "*": return 4;
            case "/": return 4;
            case "+": return 3;
            case "-": return 3;
            case "(": return 2;
            case "{": return 1;
            case "[": return 0;
            default: return 0;
        }
    }

    public float calculatePostfix(String postfixStmt) {
        StringTokenizer stn = new StringTokenizer(postfixStmt, operators, true);
        Stack<String> stPostfix = new Stack<>();
        String token = stn.nextToken();
        while (operators.indexOf(token) == -1) {
            stPostfix.push(stPostfix.push(token));
        }
        return 0;
    }

    private int incomingPriority(String s) {
        switch (s) {
            case "^": return 5;
            case "*": return 4;
            case "/": return 4;
            case "+": return 3;
            case "-": return 3;
            case "(": return 7;
            case "{": return 8;
            case "[": return 9;
            default: return 0;
        }
    }

    public String inToPost(String statement) {
        Stack<String> postFix = new Stack<>();
        Stack<String> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(statement, operators, true);
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (operators.indexOf(token) == -1) {
                postFix.push(token);
            } else if (token.equals(")")) {
            } else {
                while (!stack.isEmpty() && inStackPriority(stack.peek()) >= incomingPriority(token)) {
                    postFix.push(stack.pop());
                }
            }
        }
        return "";
    }
}
