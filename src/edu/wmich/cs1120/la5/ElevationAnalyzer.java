package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {
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
		double avg = 0;
		int i;
		for (i = 0; i < path.size(); i++){
			total += path.get(i).getElevation();
		}
		avg = total/(i + 1);
		
		this.analysis = "Elevation Analyzer: " + avg;

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
