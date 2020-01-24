package org.algo.graph.directed

class TopologicalSort {
    fun sort(graph: DirectedGraph){
        val directedCycle = DirectedCycle(graph)
        val depthFirstOrder = DepthFirstOrder(graph)
        if(directedCycle.hasNoCycle()){
                depthFirstOrder.order()
                depthFirstOrder.printOrder()
        }else{
            print("Cyclic path detected")
            directedCycle.printCycle()
        }
    }
}