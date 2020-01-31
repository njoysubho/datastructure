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

    fun min(x:Node<T,V>):Node<T,V>{
        if(x.left==null) {
            return x
        }else{
            return min(x.left!!)
        }

    }
}