package org.algo.graph.undirected

import org.algo.graph.directed.DepthFirstOrder
import org.algo.graph.directed.DirectedCycle
import org.algo.graph.directed.DirectedGraph
import org.algo.graph.search.DepthFirstSearch

object Driver {

    @JvmStatic
    fun main(args: Array<String>) {
        val graph = DirectedGraph(4)
        graph.addEdge(0, 3)
        graph.addEdge(0, 1)
        graph.addEdge(1, 3)
        graph.addEdge(1, 2)
        val depthFirstOrder = DepthFirstOrder(graph)
        depthFirstOrder.order()
        depthFirstOrder.printOrder()
    }
}