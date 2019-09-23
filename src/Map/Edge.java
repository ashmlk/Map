/**
 * @author Arshia Malekahmadi 2019
 * Edge class build edges from each vertices in class Graph
*/
public class Edge {
    /*
     * Source of the Edge(Vertex)
     */
    int src;
    /*
     * Destination of the Edge(Vertex)
     */
    int dst;
    /*
     * Weight of the Edge
     */
    int weight;

public Edge(int s, int d, int w){
    this.src = s;
    this.dst = d;
    this.weight = w;
    }

public int getSource(){
    return this.src;
    }

public int getDestination(){
    return this.dst;
    }

public int getWeight(){
    return this.weight;
    }

public void setSource(int s){
    this.src = s;
    }

public void setDestination(int d){
    this.dst = d;
    }

public void setWeight(int w){
    this.weight = w;
    }
public int getNeighbor(int index) {
	return ((index == this.src) ? this.dst : this.src);
}

}