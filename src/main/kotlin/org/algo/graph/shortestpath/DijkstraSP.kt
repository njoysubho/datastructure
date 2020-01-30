package org.algo.graph.shortestpath

import org.algo.graph.directed.EdgeWeightedDirectedGraph
import java.util.*

class DijkstraSP(val graph: EdgeWeightedDirectedGraph) {
    private val distTo = Array<Int>(graph.vertices) { Int.MAX_VALUE }
    private val marked = Array<Boolean>(graph.vertices) { false }
    private val distMap = TreeMap<Int,Int>()
    fun calculateShortestPath(v: Int) {
        initialize(v)
      //  queue.add(v)
        for (x in 0 .. graph.vertices) {
            val current = findMinimum()
            relax(current)
        }

    }

    private fun findMinimum(): Int {
        var min = Int.MAX_VALUE
        var minIndex = -1
        for (x in distTo.indices) {
            if (!marked[x]&&distTo[x] < min) {
                minIndex = x
            }
        }
        return minIndex
    }

    private fun initialize(v: Int) {
        distTo[v] = 0
    }

    private fun relax(v: Int) {
        for (w in graph.getAdjacency()[v]) {
            if (distTo[w.to] > distTo[v] + w.weight) {
                distTo[w.to] = distTo[v] + w.weight
            }
        }
    }
}