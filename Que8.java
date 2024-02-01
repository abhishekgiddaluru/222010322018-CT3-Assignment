package Test.ClgAssgn;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Que8{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        return pointerA;
    }

    public static void main(String[] args) {
        // Example usage:
        Que8 solution = new Que8();

        // Creating linked list A: a1 → a2 ↘ c1 → c2 → c3 ↗
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode c1 = new ListNode(3);
        ListNode c2 = new ListNode(4);
        ListNode c3 = new ListNode(5);

        a1.next = a2;
        a2.next = c1;
        c1.next = c2;
        c2.next = c3;

        // Creating linked list B: b1 → b2 → b3 ↗
        ListNode b1 = new ListNode(6);
        ListNode b2 = new ListNode(7);
        ListNode b3 = new ListNode(8);

        b1.next = b2;
        b2.next = b3;
        b3.next = c1;  // Intersection point

        ListNode intersectionNode = solution.getIntersectionNode(a1, b1);
        
        if (intersectionNode != null) {
            System.out.println("Intersection Node Value: " + intersectionNode.val);
        } else {
            System.out.println("No Intersection");
        }
    }
}

