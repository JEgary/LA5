package edu.wmich.cs1120.la5;

public class Literal implements IExpression {
	private Integer lit;

	@Override
	public Integer getValue() {
		return lit;
	}

}
