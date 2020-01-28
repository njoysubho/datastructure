package org.algo.graph.directed

import org.algo.graph.undirected.Graph

class EdgeWeightedDirectedGraph(val vertices:Int){
    private val adj = Array<MutableList<WeightedEdge>>(vertices){ mutableListOf()}
    private var edges:Int=0

   fun addEdge(edge:WeightedEdge){
        adj[edge.from].add(edge)
        incrementEdge()
    }

    fun getAdjacency():Array<MutableList<WeightedEdge>>{
        return adj
    }

    fun incrementEdge(){
        edges++
    }

}