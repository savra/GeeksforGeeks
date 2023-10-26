package com.hvdbs.savra.geeksforgeeks.solution.java;

public class ReverseBothParts {
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static Node reverse(Node head, int k) {
        Node cur = head;
        Node head2 = null;
        Node cur2 = null;
        head2.next = cur2;
        int i = 0;

        while (i < k) {
            Node newN = new Node(cur.data);
            newN.next = head2;

            cur = cur.next;
            i++;
        }

        return head2.next;
    }

    public static void main(String[] args) {
    }
}
