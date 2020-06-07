package b_arrays;

// 32 Find the equilibrium index in an array
public class b_38_max_for_each_contiguous_array {

    class Node {
        int data;
        Node left;
        Node right;

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    Node head;
    Node tail;

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void addFirst(int index) {
        Node n = new Node();
        n.data = index;
        n.left = null;
        n.right = null;
        head = n;
        tail = n;
    }

    public void addNext(int index) {
        Node n = new Node();
        n.data = index;

        if (head == null) {
            head = tail = n;
        } else {
            tail.right = n;
            n.left = tail;
            tail = n;
        }
    }

    public int peekFirst() {
        return head.data;
    }

    public int peekLast() {
        return tail.data;
    }

    public int removeFirst() {
        int value = head.data;
        if (head.right != null) {
            head = head.right;
            head.left = null;
        } else {
            head = tail = null;
        }
        return value;
    }

    public int removeLast() {
        int value = tail.data;
        if (tail.left != null) {
            tail = tail.left;
            tail.right = null;
        } else {
            head = tail = null;

        }

        return value;
    }

    public static void main(String[] args) {
        int[] a = {10, 4, 2, 11, 3, 15, 12, 8, 7, 9, 21, 14};
        int window = 3;
        b_38_max_for_each_contiguous_array bb = new b_38_max_for_each_contiguous_array();
        bb.addFirst(0);

        for (int i = 1; i < window; i++) {
            while (!bb.isEmpty() && a[i] >= a[bb.peekLast()]) {
                bb.removeLast();
            }
            bb.addNext(i);
        }

        for (int i = window; i < a.length; i++) {
            System.out.print(a[bb.peekFirst()] + " ");
            if (bb.peekFirst() == i - window) {
                bb.removeFirst();
            }

            while (!bb.isEmpty() && a[i] >= a[bb.peekLast()]) {
                bb.removeLast();
            }
            bb.addNext(i);
        }
        System.out.print(a[bb.peekFirst()] + " ");
    }

}
