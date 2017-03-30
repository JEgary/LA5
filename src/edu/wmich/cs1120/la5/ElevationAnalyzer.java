package edu.wmich.cs1120.la5;

import java.util.ArrayList;
/**
 * 
 * @author Edgar
 * This class is responsible for providing the average elevation of the path
 *
 */
public class ElevationAnalyzer implements IRover {
	private ArrayList<IArea> path;
	private String analysis;

	@Override
	/**
	 * Getter for IArea ArrayList
	 * @return Returns IAreaArrayList
	 */
	public ArrayList<IArea> getPath() {
		return path;
	}

	@Override
	/**
	 * Setter for the IArea ArrayList
	 * @param Takes in an IArea ArrayList
	 */
	public void setPath(ArrayList<IArea> path) {
		this.path = path;

	}

	@Override
	/**
	 * Finds the average elevation of the path and creates the analysis
	 */
	public void analysePath() {
		double total = 0;
		double avg = 0;
		int i;
		for (i = 0; i < path.size(); i++){
			total += path.get(i).getElevation();
		}
		avg = total/(i + 1);
		
		this.analysis = "Elevation Analyzer: " + avg;

	}

	@Override
	/**
	 * Getter for the analysis
	 * @return  Returns the analysis String containing the average elevation of the path
	 */
	public String getAnalysis() {
		return analysis;
	}

	@Override
	/**
	 * Setter for the analysis
	 * @param takes in analysis String to set or modify the analysis String
	 */
	public void setAnalysis(String analysis) {
		this.analysis = analysis;

	}

}
