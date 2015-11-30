import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Hello {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
System.out.println("enter any name");
String name=br.readLine();
Random_gen rg=new Random_gen();
rg.getData(name);

	}

}
