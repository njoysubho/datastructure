package org.algo.graph.undirected

class Graph(val vertices:Int) {
    private var edges:Int =0
    private val adj = Array<MutableList<Int>>(vertices){ mutableListOf()}

    public fun addEdge(u:Int,v:Int){
        adj[u].add(v)
        adj[v].add(u)
        edges++
    }

    public fun getAdj():Array<MutableList<Int>>{
        return adj
    }

}