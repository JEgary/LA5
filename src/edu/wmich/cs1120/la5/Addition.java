package edu.wmich.cs1120.la5;
/**
 * 
 * @author Edgar
 * This class implements the IOperation class to add two IExpression objects
 * in order to move the pointer to the next position in the binary file.
 *
 */
public class Addition implements IOperation {
	

	@Override
	/**
	 * Adds the left IExpression object and the right IExpression object together.
	 * @return Returns an Integer object which contains the summation of 
	 * the left and right IExpression objects.
	 * @param Parameter consists of two IExpression objects.
	 */
	public Integer perform(IExpression left, IExpression right) {
	 Integer addition = left.getValue() + right.getValue();
		return addition;
	}

}
