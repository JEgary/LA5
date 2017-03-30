package edu.wmich.cs1120.la5;
/**
 * 
 * @author Edgar
 * This class implements the IOperation class to subtract two IExpression objects
 * in order to move the pointer to the next position in the binary file.
 */
public class Substraction implements IOperation {

	@Override
	/**
	 * Subtracts the left IExpression object and the right IExpression object.
	 * @return Returns an Integer object which contains the difference of 
	 * the left and right IExpression objects.
	 * @param Parameter consists of two IExpression objects. 
	 */
	public Integer perform(IExpression left, IExpression right) {
		
		Integer substraction = left.getValue() - right.getValue();
		return substraction;
	}

}
