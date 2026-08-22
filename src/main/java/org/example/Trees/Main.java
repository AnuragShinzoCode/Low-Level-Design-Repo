package org.example.Trees;

import java.util.*;

public class Main {
    static List<Integer> res = new ArrayList<>();
    static int dia=0;

    public static void main(String arg[]) {
        int[] preorder = {8, 4, 2, 6, 12, 10, 14};
        int[] inorder = {2, 4, 6, 8, 10, 12, 14};

        Node root = BuildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
        traverse(root);
        System.out.println("level order");
        traverse(root);
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        verticalTraversal(root, 0, map);
        System.out.println(map);
        Boolean iscorrect = validBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(iscorrect);
        int d = 0;
        List<Integer> ls = findVal(root, d);
        Collections.reverse(ls);
        System.out.println(ls);
        int diam=diameter(root);
        System.out.println(diam);

    }

    static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftheight=1+diameter(root.left);
        int rightheight=1+diameter(root.right);
        dia=Math.max(dia,leftheight+rightheight);
        return Math.max(leftheight,rightheight);
    }
    static Node BuildTree(int[] pre, int[] in, int ps, int pe, int is, int ie) {
        if (ps > pe || is > ie) {
            return null;
        }
        //find the root node
        Node root = new Node(pre[ps]);

        //find the index for root in in order
        int index = is;
        for (int i = is; i <= ie; i++) {
            if (in[i] == pre[ps]) {
                index = i;
                break;
            }
        }
        //count the no of indecx in left subtree
        int count = index - is;
        root.left = BuildTree(pre, in, ps + 1, ps + count, is, index - 1);
        root.right = BuildTree(pre, in, ps + count + 1, pe, index + 1, ie);

        return root;
    }

    static void traverse(Node node) {


        if (node == null) {
            return;

        }
        System.out.println(node.val);
        traverse(node.left);
        traverse(node.right);
    }

    void levelOrder(Node root) {
        Queue<Node> que = new ArrayDeque<>();
        que.add(root);
        while (!que.isEmpty()) {
            int size = que.size();
            for (int i = 0; i < size; i++) {
                Node node = que.poll();
                System.out.println(node.val);
                if (node.left != null) {
                    que.add(node.left);
                }

                if (node.right != null) {
                    que.add(node.right);
                }
            }
        }
    }

    static void verticalTraversal(Node root, int hd, HashMap<Integer, ArrayList<Integer>> map) {
        if (root == null) {
            return;
        }
        if (map.containsKey(hd)) {
            ArrayList<Integer> temp = map.get(hd);
            temp.add(root.val);
            map.put(hd, temp);
        } else {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(root.val);
            map.put(hd, temp);
        }
        verticalTraversal(root.left, hd - 1, map);
        verticalTraversal(root.right, hd + 1, map);
    }

    static Boolean validBST(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.val >= min && root.val <= max) {
            return validBST(root.left, min, root.val - 1) && validBST(root.right, root.val + 1, max);
        } else {
            return false;
        }
    }

    static List<Integer> findVal(Node root, int d) {
            boolean r=findValActual(root,d);
            return res;
    }

    static boolean findValActual(Node root, int d) {
        if(root==null){
            return false;
        }
        if(root.val==d){
            res.add(root.val);
            return true;
        }

        boolean lef=findValActual(root.left,d);
        boolean right=findValActual(root.right,d);
        if(lef || right){
            res.add(root.val);
        }
        return (lef || right);

    }
}