package org.algo.graph.directed

import java.util.*

class DepthFirstOrder(val graph: DirectedGraph){
    private var reverseOrder= Stack<Int>()
    private var marked = Array(graph.vertices){false}
    fun dfs(v:Int){
        marked[v] = true
        for( w in graph.getAdjacency()[v]){
            if(!marked[w]){
                dfs(w)
            }
        }
        reverseOrder.push(v)
    }

    fun order(){
        for(v in 0 until graph.vertices){
            if(!marked[v]){
                dfs(v)
            }
        }

    }
    fun printOrder(f:(Stack<Int>)->Unit){
        f(reverseOrder)
    }
    fun printOrder(){
        while(reverseOrder.isNotEmpty()){
            print(reverseOrder.pop())
        }
    }
}