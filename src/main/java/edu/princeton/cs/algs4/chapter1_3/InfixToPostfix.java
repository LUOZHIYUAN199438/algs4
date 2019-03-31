package main.java.edu.princeton.cs.algs4.chapter1_3;

import edu.princeton.cs.algs4.Stack;
/******************************************************************************
 * 
 * Write a filter Program InfixToPostfix.java that converts an arithmetic expression from infix to postfix.
 * 
 *  Compilation:  javac InfixToPostfix.java
 *  Execution:    java InfixToPostFix
 *  Dependencies: Stack.java StdIn.java StdOut.java
 *
 *  Reads in a fully parenthesized infix expression from standard input
 *  and prints an equivalent postfix expression to standard output.
 *
 *  Windows users: replace [Ctrl-d] with [Ctrl-z] to signify end of file.
 * 
 *  % java InfixToPostfix
 *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
 *  [Ctrl-d]
 *  2 3 4 + 5 6 * * + 
 *
 *  % java InfixToPostfix
 *  ( ( ( 5 + ( 7 * ( 1 + 1 ) ) ) * 3 ) + ( 2 * ( 1 + 1 ) ) )
 *  5 7 1 1 + * + 3 * 2 1 1 + * + 
 *
 *  % java InfixToPostfix | java EvaluatePostfix
 *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
 *  [Ctrl-d]
 *  212
 *
 ******************************************************************************/
public class InfixToPostfix {
    public void transfer(String str){
        Stack<String> stack = new Stack<String>();
        for(int i = 0;i < str.length();i ++) {
            String c = str.charAt(i)+"";
            if("+".equals(c) || "*".equals(c)) {
                stack.push(c);
            }else if(")".equals(c)) {
                System.out.print(stack.pop());
            }else if("(".equals(c)) {
                continue;
            }else {
                System.out.print(c);
            }
        }
        
        
    }
    
    public static void main(String[] args) {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        infixToPostfix.transfer("(2+((3+4)*(5*6)))");

    }

}
