package demo;

public class Assignment1Demo {

	  public static void main(String[] args) {
		try {
		
			 
			//System.out.println(("sqrt 4 ".split("\\(")[0]));
		Expression_Evaluator ob = new Expression_Evaluator("10 + sqrt(4) + sin(90)");
		ob.evaluate();
		System.out.println(ob);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		

	
	  }

}
