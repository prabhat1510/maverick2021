package demo;


public class ExpressionThread extends Thread {
	
	FileRead Fr;
	String name1;
int round=0;
	public ExpressionThread(FileRead fr,String nam) {
		super();
		Fr = fr;
		name1 = nam;
	}
	public ExpressionThread() {
		super();
		Fr = null;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
		try {
			String [] equations = Fr.readtest();
			if (equations == null) {
				System.out.println("-------------no value");
				return;
			}
			round++;
		int len=0;
		if(equations[equations.length -1].endsWith("Y"))
			len = equations.length;
		else
			len = equations.length -1;
		Evaluatro eval;
		for(int i = 0; i < len-1;i++) {
			System.out.println(equations[i]);
			eval = Factory.getEvaluatro(0,equations[i]);
			eval.evaluate();
			System.out.println("thread name "+name1+" term:"+round+eval);
			sleep(1);
		}
			
		} catch (Exception e) {
		   // TODO: handle exception
			System.out.println(e);
			
		}
		}
		
	}
	
	

}
