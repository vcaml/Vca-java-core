package com.example.oj;

public class Test {

    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */

    class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }
        public void reorderList(ListNode head) {
            if (head == null || head.next == null) {
                return;
            }

            // 第一步 我们先找中间节点
            ListNode listNode1 = head;
            ListNode listNode2 = head;
            while (listNode2.next != null && listNode2.next.next != null) {
                listNode1 = listNode1.next;
                listNode2 = listNode2.next.next;
            }

            // 我们把这个链表一分为二 把中间节点的引用拆掉 另一半的起始节点给新的node
            ListNode newHead = listNode1.next;
            listNode1.next = null;

            // 我们把后面一半反转 比如 6 7 8 9 10 换成 10 9 8 7 6
            newHead = reverseList(newHead);

            // Step 4: Merge the first and second halves alternately
            ListNode firstCurrent = head;
            ListNode secondCurrent = newHead;
            while (secondCurrent != null) {
                ListNode firstNext = firstCurrent.next;
                ListNode secondNext = secondCurrent.next;

                firstCurrent.next = secondCurrent;
                secondCurrent.next = firstNext;

                firstCurrent = firstNext;
                secondCurrent = secondNext;
            }
        }

        private ListNode reverseList(ListNode head) {
            ListNode pre = null;
            ListNode current = head;

            while (current != null) {
                ListNode next = current.next;
                current.next = pre;
                pre = current;
                current = next;
            }

            return pre;
        }

    public static void main(String[] args) {

    }
}
