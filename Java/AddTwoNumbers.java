package Java;

public class AddTwoNumbers {

    public ListNode add(ListNode listA, ListNode listB) {

        ListNode sentinelHead = new ListNode(0);
        ListNode tail = sentinelHead;
        ListNode pointerA = listA;
        ListNode pointerB = listB;
        int carryOver = 0;

        while (pointerA != null || pointerB != null || carryOver != 0) {

            int digitA = (pointerA != null) ? pointerA.val : 0;
            int digitB = (pointerB != null) ? pointerB.val : 0;
            int sum = digitA + digitB + carryOver;
            int newDigit = sum % 10;
            carryOver = sum / 10;
            tail.next = new ListNode(newDigit);
            tail = tail.next;

            if (pointerA != null) pointerA = pointerA.next;
            if (pointerB != null) pointerB = pointerB.next;
        }
        return sentinelHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}