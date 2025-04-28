package basics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
	public static void main(String[] args) {
		try {
//			FileReader file=new FileReader("info");
			String file="info";
			BufferedReader reader=new BufferedReader(new FileReader(file));
			System.out.println(reader);
			String line;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
			System.out.println(reader.ready());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
