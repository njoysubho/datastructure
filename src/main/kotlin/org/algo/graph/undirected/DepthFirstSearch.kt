package org.algo.graph.undirected

import java.util.*

class DepthFirstSearch(val graph:Graph) {
    private var marked = Array(graph.vertices){false}
    private var edgeTo = Array<Int>(graph.vertices){-1}

    fun dfs(v:Int){
        marked[v]=true
        for(w in graph.getAdj()[v]){
            if(!marked[w]){
                edgeTo[w]=v
                dfs(w)
            }
        }
    }

    fun pathTo(u:Int,v:Int){
        dfs(u)
        if(!marked[v]) {
            print("No path from $u to $v")
            return
        }
        var x=v
        var path=Stack<Int>()
        while(x!=u){
            path.push(x)
            x=edgeTo[x]
        }
        path.push(u)
       while(path.isNotEmpty()){
           val vertex = path.pop()
           print("$vertex --> ")
       }
    }
}