package org.algo.graph.undirected

open class Graph(val vertices:Int) {
    private var edges:Int =0
    private val adj = Array<MutableList<Int>>(vertices){ mutableListOf()}

    open fun addEdge(u:Int,v:Int){
        adj[u].add(v)
        adj[v].add(u)
        edges++
    }

    fun getAdjacency():Array<MutableList<Int>>{
        return adj
    }

    fun incrementEdge(){
        edges++
    }
}