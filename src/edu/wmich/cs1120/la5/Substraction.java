package edu.wmich.cs1120.la5;

public class Substraction implements IOperation {

	@Override
	public Integer perform(IExpression left, IExpression right) {
		
		Integer substraction = left.getValue() - right.getValue();
		return substraction;
	}

}
