package org.algo.graph.undirected

import java.util.*

class BreadthFirstSearch(val graph:Graph) {
    private var marked = Array(graph.vertices){false}
    private var edgeTo = Array<Int>(graph.vertices){-1}

    fun bfs(v:Int){
        val queue = LinkedList<Int>()
        marked[v]=true
        queue.add(v)
        while(queue.isNotEmpty()){
            val current = queue.remove()
            for(w in graph.getAdj()[current]){
                if(!marked[w]){
                    edgeTo[w]=current
                    marked[w] = true
                    queue.add(w)
                }
            }
        }

    }

    fun pathTo(u:Int,v:Int){
        bfs(u)
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