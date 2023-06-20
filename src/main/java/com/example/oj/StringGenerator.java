package com.example.oj;
import java.util.Stack;


/**
 *  生成递归字符串
 * 一个字符串生成规则为 n(str)
 * 表示括号内的 str字符串 会重复n次 （10>n>0）
 * str字符串的范围是所有英文字母，str可以嵌套 n（str）
 * 例如：
 * 输入 s = "3(a2(c))3(a)2(bc)"
 * 输出 result = "accaccaccaaabcbc"
 * */


 /**
  *这段代码使用了两个栈：countStack用于存储数字的重复次数，strStack用于存储字符串的嵌套。在遍历字符串s的过程中，根据不同的字符进行处理：
  *
  * 如果是数字字符，则更新当前重复次数count；
  * 如果是'('字符，则将当前重复次数count压入countStack栈中，并将当前字符串currentStr压入strStack栈中，同时重置count和currentStr；
  * 如果是')'字符，则从strStack栈中取出前一个字符串，并根据前一个字符串的重复次数和当前字符串的值，将结果追加到当前字符串currentStr中；
  * 其他情况下，将当前字符追加到currentStr中。
  * 最后，返回currentStr即为生成的结果字符串。
  *
  * */
public class StringGenerator {
    public static String generateString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currentStr = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                count = count * 10 + (c - '0');
            } else if (c == '(') {
                countStack.push(count);
                strStack.push(currentStr);
                count = 0;
                currentStr = new StringBuilder();
            } else if (c == ')') {
                StringBuilder temp = currentStr;
                currentStr = strStack.pop();
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    currentStr.append(temp);
                }
                count = 0;
            } else {
                currentStr.append(c);
            }
        }

        return currentStr.toString();
    }

    public static void main(String[] args) {
        String s = "3(a2(c))3(a)2(bc)";
        String result = generateString(s);
        System.out.println(result);
    }
}