package org.algo.tree

class Node<T:Comparable<T>,V:Comparable<V>>(var key:T,var value:V) {
    var left:Node<T,V>?=null
    var right:Node<T,V>?=null
}