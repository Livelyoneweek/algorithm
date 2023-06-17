package study.enginnerAl;

import java.util.LinkedList;

public class LinkedListDigit {

    class Storage {
        int carry;
        Node result = null;
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(new Node(9));
        l1.add(new Node(1));
        l1.add(new Node(4));

        

        LinkedList l2 = new LinkedList();
        l2.add(new Node(6));
        l2.add(new Node(4));
        l2.add(new Node(3));

        Node n = sumLists((Node) l1.get(0), (Node) l2.get(0), 0);
        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n= n.next;
        }
        System.out.println(n.data);
    }

    private static Node sumLists(Node l1, Node l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        Node result = new Node();
        int value = carry;

        if (l1 != null) {
            value += l1.data;
        }

        if (l2 != null) {
            value += l2.data;
        }

        result.data = value % 10;

        if (l1 != null || l2 != null) {
            Node next = sumLists(l1 == null ? null : l1.next,
                    l2 == null ? null : l2.next,
                    value >= 10 ? 1 : 0);
            result.next = next;
        }
        return result;
    };


    static class Node {
        int data;
        Node next = null;

        Node() {

        }

        Node(int value) {
            data = value;
        }
    }
}
