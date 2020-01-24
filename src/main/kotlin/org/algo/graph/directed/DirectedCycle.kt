package org.algo.graph.directed

import java.util.*

class DirectedCycle(private val directedGraph: DirectedGraph) {
    private var edgeTo = Array(directedGraph.vertices) { -1 }
    private var marked = Array(directedGraph.vertices) { false }
    private var cycle: Stack<Int>? = null
    private var onStack = Array(directedGraph.vertices) { false }

    fun hasNoCycle():Boolean {
        for (v in 0 until directedGraph.vertices) {
            if (!marked[v]) {
                dfs(v)
            }
        }
        return cycle == null
    }

    private fun dfs(v: Int) {
        onStack[v] = true
        marked[v] = true
        for (w in directedGraph.getAdjacency()[v]) {
            if (hasCycle()) return
            else if (!marked[w]) {
                edgeTo[w] = v
                dfs(w)
            } else if (onStack[w]) {
                cycle = Stack()
                var x = v
                while (x != w) {
                    cycle?.push(x)
                    x = edgeTo[x]
                }
                cycle?.push(w)
                cycle?.push(v)
            }
        }
        onStack[v] = false
    }

     fun hasCycle(): Boolean {
        return cycle != null
    }

    fun printCycle(){
        while(cycle!!.isNotEmpty()){
            print(cycle?.pop())
        }
    }
}