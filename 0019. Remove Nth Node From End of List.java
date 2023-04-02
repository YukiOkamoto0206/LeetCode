/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        // reverse order
        ListNode cur = head;
        ListNode reversedNode = reverse(cur);
        // null<-1<-2<-3<-4<-5
        //       h           p
        // while (cur != null) {
        //     System.out.println(cur.val);
        //     cur = cur.next;
        // }

        // skip the nth Node
        int nth = 1;
        ListNode copyReversedNode = reversedNode;
        // 5,3,2,1
        // 1       n 
        if (n == 1) {
            return reverse(reversedNode.next);
        } else {
            while (nth != n) {
                if (nth+1 == n) {
                    if (reversedNode.next.next == null) {
                        reversedNode.next = null;
                    } else {
                        reversedNode.next = reversedNode.next.next;
                    }
                } else {
                    reversedNode = reversedNode.next;
                }
                nth++;
            }
        }
        // while (copy != null) {
        //     System.out.println(copy.val);
        //     copy = copy.next;
        // }

        // reverse again
        // 1235
        return reverse(copyReversedNode);
    }

    private ListNode reverse(ListNode cur) {
        ListNode prev = null;
        // n 1,2,3,4,5
        //.      n         
        //   p←c     pc 
        // prev = 54321
        while (cur != null) {
            ListNode next_node = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next_node;
        }
        return prev;
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode answer = new ListNode(0);
        answer.next = head;
        ListNode slow = answer;
        ListNode fast = answer;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        // 0,1,2,3,4,5
        //           s
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return answer.next;
    }
}
