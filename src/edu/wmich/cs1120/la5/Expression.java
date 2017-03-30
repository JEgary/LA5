package edu.wmich.cs1120.la5;

/**
 * 
 * @author Edgar
 * This class returns the value of the Expression 
 */
public class Expression implements IExpression {

	private Integer value;

	@Override
	/**
	 * Getter for the integer value
	 * @return Returns Integer value
	 */
	public Integer getValue() {
		return value;
	}
	/**
	 * Setter for the Integer value
	 * @param Takes in an integer value
	 */
	public void setValue(Integer value){
		this.value = value;
		
	}

}
