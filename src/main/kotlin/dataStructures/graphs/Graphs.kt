package dataStructures.graphs

import com.sun.jdi.ArrayReference
import java.util.*
import kotlin.collections.ArrayList

class Graphs {
    var numberOfNodes: Int = 0
    var adjacentList: Hashtable<Int, ArrayList<Int>> = Hashtable()

    fun addVertex(node: Int) {
        adjacentList[node] = ArrayList()
        numberOfNodes++
    }

    fun addEdge(node1: Int, node2: Int) {
        adjacentList[node1]?.add(node2)
        adjacentList[node2]?.add(node1)
    }

    fun showConnections() {
        val keys: Array<Any> = adjacentList.keys.toTypedArray()
        for (key in keys) {
            println(key.toString() + " --> " + adjacentList[key.toString().toInt()])
        }
    }
}