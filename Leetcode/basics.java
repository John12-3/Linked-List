package Leetcode;

public class basics {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode_leetcode(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
        
    }

    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
        
    }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null)
        {
            ListNode forw = curr.next; // backup

            // linking
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }

    public void reorderList(ListNode head)
    {
        if(head == null || head.next == null) return ;

        ListNode midnode = middleNode(head); // middle node
        ListNode nhead = midnode.next;  // the new head is the head of the 2nd List
        midnode.next = null;

        nhead = reverseList(nhead); // the 2nd list becomes reverse

        ListNode c1 = head;
        ListNode c2 = nhead;
        
        while(c2 != null)
        {
            // backup
            ListNode f1 = c1.next;
            ListNode f2 = c2.next;

            c1.next = c2;
            c2.next = f1;
            c1 = f1;
            c2 = f2;
        }
        

    }

    public static void main(String[] args) {

    }
}
