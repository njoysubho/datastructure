package org.algo.graph.directed

import org.algo.graph.undirected.Graph

class DirectedGraph(vertices: Int) : Graph(vertices) {

    override fun addEdge(u:Int, v:Int){
        getAdjacency()[u].add(v)
        incrementEdge()
    }
}