package demo;

public class Factory {
	
	public static Evaluatro getEvaluatro(int ch,String x) {
		
		if(ch==0) return new Date_Evaluator(x);
		else if(ch==1)
			return new Expression_Evaluator(x);
			else return new Conversion_Evaluatro(x);
	}

}
