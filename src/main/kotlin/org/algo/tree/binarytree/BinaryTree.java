package org.algo.tree.binarytree;

/**
 * Merge two binary tree Leetcode
 */
public class BinaryTree {
    public Node mergeTree(Node t1,Node t2){
        if(t1==null){
            return t2;
        }
        if(t2==null){
            return t1;
        }
        t1.value+=t2.value;
        t1.left = mergeTree(t1.left,t2.left);
        t1.right=mergeTree(t1.right,t2.right);
        return t1;
    }
}
