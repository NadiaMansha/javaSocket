import java.net.*;
import java.io.*;

class Client {
	public static void main(String[] args) {
		try {
			Systnem.out.println("Client started");
			Socket soc = new Socket("localhost", 1234);
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your name");

			String str = userInput.readLine();

			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			out.println(str);

			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String str1 = in.readLine();
			System.out.println(str1);

			soc.close();

		} catch (IOException i) {
			System.out.println(i);
		}
	}

}