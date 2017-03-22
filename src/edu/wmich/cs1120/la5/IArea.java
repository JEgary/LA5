package edu.wmich.cs1120.la5;

public interface IArea {

	public double getBasicEnergyCost();
	public void setBasicEnergyCost(double basicEnergyCost);
	public double getElevation();
	public void setElevation(double elevation);
	public double getRadiation();
	public void setRadiation(double radiation);
	double calcConsumedEnergy();
}
