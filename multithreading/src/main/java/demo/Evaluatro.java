package demo;

import bean.History;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public abstract class Evaluatro {
	
	static List<History> ob =new  ArrayList<>();
	static Date dt1;
	String filename ="d:\\sap\\history.txt";
	
	public Evaluatro() {
			// 
			}
		
	public abstract void evaluate() throws Exception;
	
	
	public void addHistory(String x, String result, String type) {
			String x1 = new SimpleDateFormat("yyyy/MM/dd HH:mm").format(new Date());
			ob.add(new History(x1,x,result,type," "));
			}
	
	public void writeHistoryToFil() throws Exception{
			BufferedWriter br = new BufferedWriter(new FileWriter(filename,true));
			System.out.println("file oopen");
			ob.forEach(	item ->{
						try {
							System.out.println(item.toString());
							if(!item.getFstatus().equals("Y")){
				            item.setFstatus("Y");
							br.write(item.toString());
							br.newLine();
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							System.out.println(e+".....");
						}
						});
			br.close();
			}
	
	public void readHistoryfromFil() throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(filename));
		 String temp;
		 while((temp=br.readLine()) !=null) {
			 String [] arr = temp.split(",");
			 ob.add(new History(arr[0],arr[1],arr[2],arr[3],arr[4]));
		 }
		br.close();
		}
	/////////////////test
	public void readtest() throws Exception{
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new FileReader(filename),4);
		// Stream<String> temp;
		// temp=br.lines();
		//	 temp.forEach((System.out::println));
		 char[] buffer = new char[96];
		 String tmp="";
		while ((br.read(buffer))!=-1) {
			
		 tmp = tmp+String.valueOf(buffer);
		 System.out.println(tmp);
		 String tmp1 =tmp.split("Y")[tmp.split("Y").length -1];
		
		 if(tmp1.endsWith("Y")) tmp = " "; else tmp = tmp1;
		// System.out.println(tmp+String.valueOf(buffer));
		
		}
		//System.out.println(tmp);
			// sc.next();
			 
		 
		br.close();
		}
	
	
	//////////
	
	public void readHistoryfromFil(int k) throws Exception{
		ob.clear();
		readHistoryfromFil();
		
		}
	
	public void readHistoryfromFil(Date dt1) throws Exception{
		ob.clear();
		this.dt1 = dt1;
		readHistoryfromFil();
		
		List<History> even = ob.stream()
                .filter((Evaluatro::checkdate))
                .collect(Collectors.toList());
		
		ob = even;
		
		}
	
	public static boolean checkdate(History number) {
		Date dt2 = null;;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		try {
			dt2=sdf.parse(number.getDates());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dt2.after(dt1);
		
	}
	
	public void writeHistoryToFil(int ch) throws Exception{
		writeHistoryToFil();
		ob.clear();
		}
	
	public void writeHistoryToFilbuf() throws Exception{
		BufferedWriter br = new BufferedWriter(new FileWriter("d:\\sap\\historybuf.txt",true));
		System.out.println("inbuffer");
		 StringBuilder buffer=new StringBuilder("");
		 ob.forEach(action->{ 
			                 if(!action.getFstatus().equals("Y")) {
			                	 action.setFstatus("Y");
			                 buffer.append(action+"<<");
			                 }
			                 });
		 System.out.println(buffer.toString());
		 br.write(buffer.toString());
		 
		br.close();
		}
	
	
	public void displayHistory() {
			ob.forEach(System.out::println);
			}
	
	
	
	public void sortHistory() {
			Collections.sort(ob, (History p1, History p2) -> p1.getDates().compareTo(p2.getDates())) ;
			}
	
	
	public long Counttype(String type1) {
			long l1 =  ob.stream().filter((Evaluatro::check1)).count();
			return ob.stream().filter(p ->(p.getType().equals(type1))).count();
			}
	
	public static boolean check1(History p) {
			return true;
			}
	
	
	public int[] countOperator() {
			int count[]= {0,0,0,0,0};
			String op[]= {"+","-","*","/","%"};
			List<History> even = ob.stream()
                 .filter(number -> number.getType().equals("Airth"))
                 .collect(Collectors.toList());

			even.forEach(action ->{
				for(int i = 0;i<op.length;i++) {
			 			count[i] += (action.getExpre().split(op[i]).length -1);
						}
			});
		
			return count;
			}
	
	
	
	
}
