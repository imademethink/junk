	package TryCatch;

import java.io.FileInputStream;
import java.io.IOException;

public class JavaTryCatch {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	FileInputStream fis=null;
	try {
		fis=new FileInputStream("D:\\data.txt");
		fis.close();
		fis=null;
	} 
	catch(IOException e) {
		e.printStackTrace();
	} 
	finally {
		//if(fis!=null) {
			try {
				fis.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	}
		
	
	
