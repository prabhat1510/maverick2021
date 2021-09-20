package demo;

import exceptions.Equation_In_Complete;
import runtimepoly.DateFactory;

import java.util.StringTokenizer;



public class Date_Evaluator extends Evaluatro {
	
	private String expression;
	private String result;
	private String operatorMatch ="[+-x/%]";

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public Date_Evaluator() {
		super();
		this.expression = "";
	}
	
	public Date_Evaluator(String expression) {
		super();
		this.expression = expression;
	}
	//////////////////
	
	public void evaluate() throws Exception
	{
		String exprsionArr[]=expression.trim().split(" ");
		
		int operation =0;
		
		// throw a error if equation is not completed
		
		if (exprsionArr[exprsionArr.length-1].matches(operatorMatch))
			throw new Equation_In_Complete();
		
		String element="";
		StringTokenizer st = new StringTokenizer(expression,"+-",true);
		int first=0;
		while(st.hasMoreTokens())
			 {
			if (first == 0) { 
				first = 1; result = st.nextToken();
			}
			String op = st.nextToken();
			element = st.nextToken();
			
			if(op.contentEquals("+") && element.contains(":")) {operation = 2;}
			else if(op.contentEquals("+") && !element.contains(":")) {operation = 0;}
			else if(op.contentEquals("-") && element.contains(":")) {operation = 3;}
			else if(op.contentEquals("-") && !element.contains(":")) {operation = 1;}
			
			
		result = DateFactory.getFactory(operation).cal(result.trim(), element.trim());
			
		}
		
		addHistory(expression,result,"dt");
		
	}
	////////////////
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return result;
	}
	

}
