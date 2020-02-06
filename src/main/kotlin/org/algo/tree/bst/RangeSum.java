package org.algo.tree.bst;

import org.algo.tree.Node;

class RangeSum {
   int ans =0;
   public static void main(String[] args) {
        BinarySearchTree<Integer,Integer> bst= new BinarySearchTree<Integer,Integer>();
        bst.insert(10,10);
        bst.insert(5,5);
        bst.insert(3,3);
        bst.insert(7,7);
        bst.insert(15,15);
        bst.insert(18,18);
        RangeSum ranhge=new RangeSum();
        System.out.println(ranhge.sumRange(bst,7,15));
    }

    public int sumRange(BinarySearchTree<Integer,Integer> bst,int l,int r){
       int ans = 0;
        dfs(bst.getRoot(),l,r);
        return ans;

    }

    public void  dfs(Node<Integer, Integer> node,int l,int r){
       if(node!=null){
           if(l<=node.getValue() && node.getValue()<=r){
               ans += node.getValue();
           }
           if(l<node.getValue()){
               dfs(node.getRight(),l,r);
           }
           if(node.getValue()<r){
               dfs(node.getLeft(),l,r);
           }
       }
    }
}