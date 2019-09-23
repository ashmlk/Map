/**
 * @author Arshia Malekahmadi 2019
 * This class build a graph with all its properties below.
 */
import java.util.*;
/*
* Class Graph is used to build the graph of our program.
*/
public class Graph {
    /**
     * Total number of vertices in graph
     */
    int totalV = 0;
    /** 
     * Used to store edges weight of graph
    */
    int[][] adjacencyList;
    /**
     * Construct a hashmap of name of cities and their vertex number
     */
    HashMap<String, Integer> cityMap1;
    /**
     * Constructs a hashmap to store each vertex as key and their cities as value
     */
    HashMap<Integer, String> cityMap2;
/**
 * Construct a graph with "v" number of vertices, and creates adjacency matrice of graph in using 
 * doubly linked lists
 */
public Graph(int v){
    this.totalV = v;
    this.adjacencyList = new int[v][v];
    for(int i = 0; i < v; i++){
    	for(int j = 0; j < v; j ++) {
        this.adjacencyList[i][j] = 0;
        	}
    	}
    //Sores the index of each city based on its name
    cityMap1 = new HashMap<String, Integer>();
    //Stores the name of each city based on its index 
    cityMap2 = new HashMap<Integer, String>();
    }
/**
 * Adds an edge to the graph
 * @param e new edge added
 */
public void addE(Edge e){
    this.adjacencyList[e.getSource()][e.getDestination()] = e.getWeight();
    this.adjacencyList[e.getDestination()][e.getSource()] = e.getWeight();
    }
public int getV() {
	return this.totalV;
	}
}
