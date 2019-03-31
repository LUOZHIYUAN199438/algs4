package main.java.edu.princeton.cs.algs4.chapter1_3;



import edu.princeton.cs.algs4.Stack;

/**
 * Created by Blue on 2016/7/3.
 * 从标准输入得到一个缺少左括号的表达式并打印出补全括号之后的中序表达式；
 * 输入： 1 + 2 ） * 3 - 4 ） * 5 - 6 ） ） ）
 * 输出： (（ 1 + 2 ） * (（ 3 - 4 ） * （ 5 - 6 ） ） ）
 */
public class E9 {
    public Stack<String> operateMethod(String str){
        Stack<String> ops = new Stack<String>();
        Stack<String> vals = new Stack<String>();
        String temp = null;
        String peerStr = null;
        for(int i = 0;i < str.length();i ++) {
            String c = str.charAt(i)+"";
            if("+".equals(c) || "-".equals(c) || "*".equals(c) || "/".equals(c)) {
                ops.push(c+"");
            }else if(")".equals(c)) {
               peerStr = vals.pop();
                temp = "("+vals.pop()+ops.pop()+peerStr+")";
                vals.push(temp);
            }else {
                vals.push(c+"");
            }
        }
        return vals;
    }
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        E9 e9 = new E9();
        stack = e9.operateMethod("1+2)*3-4)*5-6)))");
        System.out.println(stack.peek());
    }

    
}