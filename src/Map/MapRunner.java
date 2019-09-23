import java.util.*;
/**
 * The main function of  program that uses the construct class to build out graph and apply "Dijkstra's Algorithm" to find shortest path between vertices
 * @author Arshia Malekahmadi 2019
 *
 */
public class MapRunner {
	final static int NUMBER_OF_VERTICES = 18;
	private static Dijkstra dijkstra;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String src;
		int s;
		Construct c = new Construct(NUMBER_OF_VERTICES);
		System.out.println("Please Enter the Current location");
		src = scanner.next();
		s = c.graph.cityMap1.get(src);
		System.out.println("Source is: " + s);
		dijkstra = new Dijkstra(c.getGraph(), s);
		scanner.close();
	}
}
