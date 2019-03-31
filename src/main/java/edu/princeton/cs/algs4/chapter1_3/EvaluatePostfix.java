package main.java.edu.princeton.cs.algs4.chapter1_3;

import edu.princeton.cs.algs4.Stack;
/******************************************************************************
 * Write a program EvaluatePostfix.java that that takes a postfix expression from standard input, evaluates it,
 *  and prints the value. 
 * (Piping the output of your program from the previous exercise to this program gives equivalent 
 * behavior to Evaluate.java.)
 *  Compilation:  javac EvaluatePostfix.java
 *  Execution:    java EvaluatePostfix < file.txt
 *  Dependencies: Stack.java StdIn.java StdOut.java
 *
 *  Evaluates postfix expresions using a stack.
 *
 *  Windows users: replace [Ctrl-d] with [Ctrl-z] to signify end of file.
 *
 *  % java EvaluatePostfix
 *  3 4 5 + *
 *  [Ctrl-d]
 *  27
 *
 *  % java EvaluatePostfix
 *  1 2 3 4 5 * + 6 * * +
 *  [Ctrl-d]
 *  277
 *
 *  % java EvaluatePostfix
 *  7 16 16 16 * * * 5 16 16 * * 3 16 * 1 + + +
 *  [Ctrl-d]
 *  30001
 *  
 *  % java EvaluatePostfix
 *  7 16 * 5 + 16 * 3 + 16 * 1 +
 *  [Ctrl-d]
 *  30001
 *
 *  Known bugs
 *  ----------
 *  - No error checking - assumes input is legal postfix expression.
 *  - All token must be separated by whitespace, e.g., 1 5+ is illegal.
 *
 ******************************************************************************/
public class EvaluatePostfix {
    public Stack<Integer> evaluate(String str){
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for(int i = 0;i < str.length();i ++) {
            String s = str.charAt(i)+"";
            if("+".equals(s)) {
                result = stack.pop() + stack.pop();
                stack.push(result);
            }else if("*".equals(s)){
                result = stack.pop()*stack.pop();
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack;
        
    }
    public static void main(String[] args) {
        EvaluatePostfix evaluatePostfix = new EvaluatePostfix();
        Stack<Integer> in = evaluatePostfix.evaluate("12345*+6**+");
        System.out.println(in.peek());
    }

}
