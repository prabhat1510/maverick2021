package demo;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileRead {
	
	BufferedReader br;
	String filename;
	String temp;
	
	public FileRead() throws Exception {
		super();
		filename = "d:\\sap\\history1.txt";
		br = new BufferedReader(new FileReader(filename));
		temp = "";
		System.out.println("ok");
		}
	
	
	public FileRead(String fname) throws Exception {
		super();
		filename = fname;
		br = new BufferedReader(new FileReader(filename));
		temp = "";
		}
	
	public synchronized String[] readtest() throws Exception{
		
		 char[] buffer = new char[120];
		 String tmp="";
		 int k = br.read(buffer);
		 if(k==-1) return null;
		 tmp = temp+String.valueOf(buffer);
		 System.out.println(tmp+"----");
		 String tmp1[] = tmp.split("Y");
		 String temp1= tmp1[tmp1.length - (1)];
		 if(temp1.endsWith("Y"))  temp= " "; else temp = temp1;
		 System.out.println("ok1");
		 return tmp1;
		}
	
	public void finalized () throws Exception {
		br.close();
	}
	
	
}
