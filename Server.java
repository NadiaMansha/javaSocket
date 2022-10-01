import java.net.*;
import java.io.*;

class Server{
	public static void main(String[] args){
		try{
			System.out.println("Waiting for clients..");
			ServerSocket ss= new ServerSocket(1234);
			Socket soc=ss.accept();
			System.out.println("Connection established");
			BufferedReader in= new BufferedReader(new InputStreamReader(soc.getInputStream())); 
				String str=in.readLine();
				PrintWriter out= new PrintWriter(soc.getOutputStream(),true);
				out.println("Wa alaikum asalam" + " "  + str);
				ss.close();
		}
		catch(IOException i)
			{
				System.out.println(i);
			}
	}

}