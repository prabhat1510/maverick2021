package demo;


import exceptions.ConversionOp;
import exceptions.Equation_In_Complete;
import exceptions.Invalid_Number_System;

public class Conversion_Evaluatro extends Evaluatro{
	
	private String expression;
	private String result;
	private String operatorMatch ="[+-x/%]";
	private String exprsionArr[];
	

	public String getResult() {
		return result;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression.toLowerCase();
	}

	public Conversion_Evaluatro(String expression) {
		super();
		this.expression = expression.toLowerCase();
	}
	public Conversion_Evaluatro() {
		super();
		this.expression = "";
	}
	
	 
	public void evaluate() throws Exception
	{
		exprsionArr=expression.trim().split(" ");
		
		int operation =0;
		
		// throw a error if equation is not completed
		
		if (exprsionArr[exprsionArr.length-1].matches(operatorMatch))
			throw new Equation_In_Complete();
		String value = exprsionArr[0];
		String conver = exprsionArr[1];
		try {
			
		ConversionOp ch = ConversionOp.valueOf(conver);
			switch (ch) {
			
			case dtobin :  result = Integer.toBinaryString(Integer.parseInt(value));
			break;
			
			case dtooct :  result = Integer.toOctalString(Integer.parseInt(value));
			break;
			
			case dtohex :  result = Integer.toHexString(Integer.parseInt(value));
			break;
			
			case bintod : result = String.valueOf(Integer.parseInt(value,2));
			break;
			
			case octtod : result = String.valueOf(Integer.parseInt(value,8));
			break;
			
			case hextod : result = String.valueOf(Integer.parseInt(value,16));
			break;
			}
			
			
		}
		catch (Exception e) {
						
			throw new Invalid_Number_System(e.getMessage());
			// TODO: handle exception
		}
		
		addHistory(expression, result , "conv");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return result;
	}

}
