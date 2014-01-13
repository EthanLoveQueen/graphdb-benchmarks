package eu.socialsensor.main;

import eu.socialsensor.benchmarks.FindNeighboursOfAllNodesBenchmark;
import eu.socialsensor.benchmarks.MassiveInsertionBenchmark;
import eu.socialsensor.benchmarks.SingleInsertionBenchmark;

public class GraphDatabaseBenchmark {
		
	private final static String enronDataset = "data/enronEdges.txt";
	private final static String flickrDataset = "data/flickrEdges.txt";
	private final static String amazonDataset = "data/amazonEdges.txt";
	private final static String youtubeDataset = "data/youtubeEdges.txt";
	private final static String livejournalDataset = "data/livejournalEdges.txt";
	
	/**
	 * This is the main function. Before you run the project un-comment
	 * lines that correspond to the benchmark you want to run.
	 */
	public static void main(String[] args) {
		
		MassiveInsertionBenchmark massiveInsertionBenchmark = new MassiveInsertionBenchmark("data/test.txt");
		massiveInsertionBenchmark.startMassiveBenchmark();		
		
//		SingleInsertionBenchmark singleInsertionBenchmark = new SingleInsertionBenchmark("data/test.txt");
//		singleInsertionBenchmark.startBenchmark();
		
//		FindNeighboursOfAllNodesBenchmark findNeighboursOfAllNodesBenchmark = new FindNeighboursOfAllNodesBenchmark();
//		findNeighboursOfAllNodesBenchmark.startBenchmark();
		
//		FindNodesOfAllEdgesBenchmark findNodesOfAllEdgesBenchmark = new FindNodesOfAllEdgesBenchmark();
//		findNodesOfAllEdgesBenchmark.startBenchmark();
//		
//		FindShortestPathBenchmark findShortestPathBenchmark = new FindShortestPathBenchmark();
//		findShortestPathBenchmark.startBenchmark();
	}
	
	

}
