package com.example.oj;
import java.util.*;

public class BugCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 分割报文段
        String[] segments = input.split("5a");

        // 用于存储过滤后的报文
        List<String> filteredSegments = new ArrayList<>();

        // 处理每个报文段
        for (String segment : segments) {
            segment = segment.trim();

            // 去除空格
            segment = segment.replaceAll(" ", "");

            // 转义5b ba 和 5b bb
            segment = segment.replaceAll("5bbb", "5b").replaceAll("5bba", "5a");

            // 检查报文长度
            int length = Integer.parseInt(segment.substring(0, 2), 16) * 2; // 转换为字节数
            if (length == segment.length() - 4) { // 长度域占两个字节，开头的5a占两个字节
                filteredSegments.add(segment);
            }
        }

        // 输出过滤后的报文
        for (String filteredSegment : filteredSegments) {
            System.out.print("5a " + filteredSegment + " ");
        }

        scanner.close();
    }
}
