package org.algo.graph.undirected

object Driver {

    @JvmStatic
    fun main(args:Array<String>){
        val graph = Graph(4)
        graph.addEdge(0,3)
        graph.addEdge(0,1)
        graph.addEdge(1,3)
        graph.addEdge(1,2)
        val dfsGraph=DepthFirstSearch(graph)
        dfsGraph.pathTo(0,2)
    }
}