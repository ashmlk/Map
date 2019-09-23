import java.util.Arrays;

/**
 * Implementation of Dijkstra's algorithm on the programs graph
 * @author FOX
 *
 */
public class Dijkstra {
	static final int FAILED = -1;
	/**
	 * 
	 * @param graph our constructed graph
	 * @param src the source vertex
	 * @param dst the destination vertex
	 */
	public Dijkstra(Graph graph, int src) {
		//store distance from source to each vertex
		int distance[] = new int[graph.totalV];
		//true if a vertex has been visited by the algorithm, false otherwise
		Boolean spt[] = new Boolean[graph.totalV];
		for(int i = 0; i < graph.totalV; i++) {
			distance[i] = Integer.MAX_VALUE;//Sets initial distance of all vertices to infinity
			spt[i] = false;//Sets initial visited vertex to false
			}
		
		//distance from source vertex to itself is always 0
		distance[src] = 0;
		
		for(int j = 0; j < graph.totalV - 1; j++) {
			 //finds the closest vertex
			int closest_vertex = minDistance(distance, spt, graph.totalV);
			//set visited vertex to true 
			spt[closest_vertex] = true;
			
			for(int i = 0; i < graph.totalV; i++) {
				
			if(!spt[i] && graph.adjacencyList[closest_vertex][i] != 0 && distance[closest_vertex] != Integer.MAX_VALUE 
					&& (distance[closest_vertex] + graph.adjacencyList[closest_vertex][i]) < distance[i]) {
				distance[i] = distance[closest_vertex] +  graph.adjacencyList[closest_vertex][i];
				}
			}
		}	
		//print the final result of program
		printSolution(graph, distance, graph.adjacencyList);
	}
	/**
	 * A helper function to return the shortest next shortest neighbor
	 * @param d the array that holds distance from source to all other vertices
	 * @param s an array that holds boolean value of all visited vertices
	 * @param totalV total number of vertices of main graph
	 * @return index of closes vertex
	 */
	public int minDistance(int d[], Boolean s[], int totalV) {
		int min = Integer.MAX_VALUE, index = FAILED; 
		
		for(int i = 0; i < totalV; i++) {
			if(s[i] == false && d[i] <= min) {
				min = d[i];
				index = i;
			}
		}
		return index;

		}
	//print solution of the algorithm
	public void printSolution(Graph g,int dist[], int adjacencyList[][]) {
		int v = g.getV();
		System.out.println("The adjecency matrix of graph is: ");
		for(int j = 0; j < g.totalV; j++) {
			System.out.println(Arrays.toString(adjacencyList[j]));
		}
		for(int i = 0; i < v; i++) {
			System.out.println(g.cityMap2.get(i) + " - - - "  + " distance from source is: " + dist[i]);
		}
	}
}

