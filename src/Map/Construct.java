/**
 * The construct is for simplicity of the program which build the graph of the cities and adds all its edges to it.
 * @author Arshia Malekahmadi 2019
 *
 */
public class Construct{
    Graph graph;
	public Construct(int v) {
		
    	graph = new Graph(v);
    	//Add the index of each city
    	graph.cityMap1.put("Saskatoon", 0);
    	graph.cityMap1.put("London", 1);
    	graph.cityMap1.put("Kitchner", 2);
    	graph.cityMap1.put("Brantford", 3);
    	graph.cityMap1.put("Brampton", 4);
    	graph.cityMap1.put("Hamilton", 5);
    	graph.cityMap1.put("Waterloo", 6);
    	graph.cityMap1.put("Vaughan", 7);
    	graph.cityMap1.put("Toronto", 8);
    	graph.cityMap1.put("Montreal", 9);
    	graph.cityMap1.put("RichmondHill", 10);
    	graph.cityMap1.put("Pickering", 11);
    	graph.cityMap1.put("Oshawa", 12);
    	graph.cityMap1.put("Newmarket", 13);
    	graph.cityMap1.put("Aurora", 14);
    	graph.cityMap1.put("Ajax", 15);
    	graph.cityMap1.put("Halifax", 16);
    	graph.cityMap1.put("Niagra", 17);
    	//Add the value of each index 
    	graph.cityMap2.put(0, "Saskatoon");
    	graph.cityMap2.put(1, "London");
    	graph.cityMap2.put(2, "Kitchner");
    	graph.cityMap2.put(3, "Brantford");
    	graph.cityMap2.put(4, "Brampton");
    	graph.cityMap2.put(5, "Hamilton");
    	graph.cityMap2.put(6, "Waterloo");
    	graph.cityMap2.put(7, "Vaughan");
    	graph.cityMap2.put(8, "Toronto");
    	graph.cityMap2.put(9, "Montreal");
    	graph.cityMap2.put(10, "RichmondHill");
    	graph.cityMap2.put(11,"Pickering");
    	graph.cityMap2.put(12,"Oshawa");
    	graph.cityMap2.put(13, "Newmarket");
    	graph.cityMap2.put(14, "Aurora");
    	graph.cityMap2.put(15, "Ajax");
    	graph.cityMap2.put(16, "Halifax");
    	graph.cityMap2.put(17, "Niagra");
    	//Add the edges between cities
    	graph.addE(new Edge(0,1,2000));
    	graph.addE(new Edge(0,3,2500));
    	graph.addE(new Edge(0,9,4500));
    	graph.addE(new Edge(0,16,5000));
    	graph.addE(new Edge(1,2,60));
    	graph.addE(new Edge(1,6,165));
    	graph.addE(new Edge(1,17,300));
    	graph.addE(new Edge(2,3,45));
    	graph.addE(new Edge(2,4,25));
    	graph.addE(new Edge(4,5,30));
    	graph.addE(new Edge(4,8,30));
    	graph.addE(new Edge(5,6,40));
    	graph.addE(new Edge(6,8,200));
    	graph.addE(new Edge(6,12,150));
    	graph.addE(new Edge(6,17,180));
    	graph.addE(new Edge(6,12,150));
    	graph.addE(new Edge(7,9,470));
    	graph.addE(new Edge(7,8,30));
    	graph.addE(new Edge(6,12,150));
    	graph.addE(new Edge(8,9,500));
    	graph.addE(new Edge(8,10,60));
    	graph.addE(new Edge(8,11,70));
    	graph.addE(new Edge(8,12,120));
    	graph.addE(new Edge(9,16,400));
    	graph.addE(new Edge(10,14,10));
    	graph.addE(new Edge(11,15,50));
    	graph.addE(new Edge(12,17,250));
    	graph.addE(new Edge(12,15,50));
    	graph.addE(new Edge(13,14,20));
    	graph.addE(new Edge(14,16,600));
    	graph.addE(new Edge(15,17,60));
    	
    }
	public Graph getGraph() {
		return this.graph;
	}
}