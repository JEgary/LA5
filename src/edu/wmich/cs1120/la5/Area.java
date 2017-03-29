/**
 * 
 */
package edu.wmich.cs1120.la5;

/**
 * @author 
 *
 */
public class Area implements IArea {
	
	private double basicEnergyCost;
	private double elevation;
	private double radiation;
	private int threshold;
	
	public Area(Double basicEnergyCost, Double elevation, Double radiation, int threshold) {
		this.basicEnergyCost= basicEnergyCost;
		this.elevation= elevation;
		this.radiation= radiation;
		this.threshold= threshold;
	}
	
	Area(){
		basicEnergyCost= 0.0;
		elevation = 0.0;
		radiation = 0.0;
		threshold = 0;
	}

	/* (non-Javadoc)
	 * @see edu.wmich.cs1120.la5.IArea#getBasicEnergyCost()
	 */
	@Override
	public double getBasicEnergyCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see edu.wmich.cs1120.la5.IArea#setBasicEnergyCost(double)
	 */
	@Override
	public void setBasicEnergyCost(double basicEnergyCost) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see edu.wmich.cs1120.la5.IArea#getElevation()
	 */
	@Override
	public double getElevation() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see edu.wmich.cs1120.la5.IArea#setElevation(double)
	 */
	@Override
	public void setElevation(double elevation) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see edu.wmich.cs1120.la5.IArea#getRadiation()
	 */
	@Override
	public double getRadiation() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see edu.wmich.cs1120.la5.IArea#setRadiation(double)
	 */
	@Override
	public void setRadiation(double radiation) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see edu.wmich.cs1120.la5.IArea#calcConsumedEnergy()
	 */
	@Override
	public double calcConsumedEnergy() {
		// TODO Auto-generated method stub
		return 0;
	}

}
