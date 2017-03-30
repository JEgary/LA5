package edu.wmich.cs1120.la5;

import java.util.ArrayList;
/**
 * 
 * @author Edgar
 * This class is the responsible providing the total radiation
 * of the path
 *
 */

public class RadiationAnalyzer implements IRover {
	private ArrayList<IArea> path;
	private String analysis;

	@Override
	/**
	 * Getter for the IArea ArrayList
	 * @return Returns the IArea ArrayList
	 */
	public ArrayList<IArea> getPath() {
		return path;
	}

	@Override
	/**
	 * Setter for the IArea ArrayList
	 * @param Takes in IArea ArrayList
	 */
	public void setPath(ArrayList<IArea> path) {
		this.path = path;

	}

	@Override
	/**
	 * calculates the total amount of radiation in the path
	 */
	public void analyzePath() {
		double total = 0;
		for(int i = 0; i < path.size(); i++){
			total += path.get(i).getRadiation();
		}
		
		analysis = "Total Radiation: " + total;

	}

	@Override
	/**
	 * Getter for the analysis
	 * @return Returns String of analysis
	 */
	public String getAnalysis() {
		return analysis;
	}

	@Override
	public void setAnalysis(String analysis) {
		this.analysis = analysis;

	}

}
