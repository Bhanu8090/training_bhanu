import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class exction {
public static void main(String[] args)throws IOException {
	File f = new File("MyFile.txt");
	try(FileWriter fw = new FileWriter(f);){
		fw.write("bye");
	}
	System.out.println("----------");
	try{
		int a = 10,b=0;
		int c=a/b;
	}catch(Exception e){
		System.out.println("can't divided by 0");
	}finally{
		System.out.println("used for clothing and releasing object");
	}
}
}
