package ClassObject;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class TxtReader {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file=new File("D:\\abc.txt");
FileReader fr=new FileReader(file);
BufferedReader br=new BufferedReader(fr);
for(int i=0; i<4; i++) {
System.out.println(br.readLine());
	}
	}
}
