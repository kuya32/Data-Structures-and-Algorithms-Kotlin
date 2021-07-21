package dataStructures.graphs

import org.junit.Test

class GraphsTest {
    private var graph = Graphs()

    @Test
    fun graphVertexTest() {
        graph.addVertex(10)
        graph.addVertex(20)
        graph.addVertex(30)
        graph.addEdge(10, 20)
        graph.addEdge(20, 30)
        println(graph.showConnections())
    }
}