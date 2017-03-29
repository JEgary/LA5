package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {
	private ArrayList<IArea> path;
	private String analysis;

	@Override
	public ArrayList<IArea> getPath() {
		return path;
	}

	@Override
	public void setPath(ArrayList<IArea> path) {
		this.path = path;

	}

	@Override
	public void analysePath() {
		double total = 0;
		for(int i = 0; i < path.size(); i++){
			total += path.get(i).getRadiation();
		}
		
		analysis = "Radiation Analyzer: " + analysis;

	}

	@Override
	public String getAnalysis() {
		return analysis;
	}

	@Override
	public void setAnalysis(String analysis) {
		this.analysis = analysis;

	}

}
