package org.algo.tree.bst

import org.algo.tree.Node

class BinarySearchTree<T : Comparable<T>, V : Comparable<V>> {
    private var root: Node<T, V>? = null
    fun insert(key: T, value: V) {
        root = insert(root, key, value)
    }

    private fun insert(node: Node<T, V>?, key: T, value: V): Node<T, V> {
        if (node == null) {
            return Node(key, value)
        }
        val cmp = key.compareTo(node.key)
        when {
            cmp < 0 -> {
                insert(node.left, key, value)
            }
            cmp > 0 -> {
                insert(node.right, key, value)
            }
            else -> {
                node.value = value
            }
        }
        return node
    }

    fun min(x:Node<T,V>?):Node<T,V>?{
        if(x?.left==null) {
            return x
        }else{
            return min(x.left!!)
        }

    }

    fun deleteMin(){
        root=deleteMin(root)
    }

    private fun deleteMin(x:Node<T,V>?):Node<T,V>?{
        if(x?.left==null) return x?.right
        x.left=deleteMin(x.left)
        return x
    }

    fun delete(key:T){
        root=delete(root,key)
    }
    private fun delete(x:Node<T,V>?,key:T):Node<T,V>?{
        var _x = x
        if(x==null) return null
        if(key.compareTo(x.key)<0) {
            return delete(x.left,key)
        }
        else if(key.compareTo(x.key)>0){
            return delete(x.right,key)
        }else {
            if(x?.right==null) return x?.left
            if(x?.left==null) return x?.right
            var t = _x
            _x = min(t?.right)
            x?.right = deleteMin(t?.right)
            x?.left = t?.left
        }
        return x
    }
}