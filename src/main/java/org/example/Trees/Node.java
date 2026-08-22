package org.example.Trees;

public class Node {
    Node left;
    Node right;
    int val;

    public Node(int val) {
        this.val=val;
    }

    Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
