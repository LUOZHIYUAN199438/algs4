package main.java.edu.princeton.cs.algs4.chapter1_3;

import java.util.Stack;

import edu.princeton.cs.algs4.StdOut;

public class BinaryOfNumber {
    public Stack<Integer> transferMothod(Integer n) {
        Stack<Integer> stack = new Stack<Integer>();
        while(n > 0) {
            stack.push(n % 2);
            n /= 2;
        }
       return stack;
    }
    public static void main(String[] args) {
        BinaryOfNumber binaryOfNumber = new BinaryOfNumber();
        Stack<Integer> stackResult = new Stack<Integer>();
        stackResult = binaryOfNumber.transferMothod(50);
        while(!stackResult.isEmpty()) {
            StdOut.print(stackResult.pop());
        }

    }

}
