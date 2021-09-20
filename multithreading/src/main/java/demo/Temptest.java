package demo;

public class Temptest {
	
	public static void main(String[] args) {
		
		try {
		FileRead fr = new FileRead();
		System.out.println("overb");
		
		new ExpressionThread(fr,"info").start();
		new ExpressionThread(fr,"wipro").start();
		System.out.println("over");
		
		
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
	}
}
