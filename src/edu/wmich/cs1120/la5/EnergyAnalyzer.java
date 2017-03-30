package edu.wmich.cs1120.la5;

import java.util.ArrayList;
/**
 * 
 * @author Edgar
 *This class is responsible for providing the total energy cost of the path
 */

public class EnergyAnalyzer implements IRover {
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
	 * Finds the total energy cost of the path and creates the analysis
	 */
	public void analysePath() {
		double total = 0;
		for (int i = 0; i < path.size(); i++){
			total += path.get(i).getBasicEnergyCost();
		}
	    analysis = "Energy Analyzer: " + total;

	}

	@Override
	/**
	 * Getter for analysis
	 * @return Returns the analysis String
	 */
	public String getAnalysis() {
		return analysis;
	}

	@Override
	/**
	 * Setter for analysis String
	 * @param 
	 */
	public void setAnalysis(String analysis) {
		this.analysis = analysis;

	}

}
