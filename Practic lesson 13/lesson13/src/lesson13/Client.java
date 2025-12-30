package lesson13;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;




import java.net.Socket;
public class Client {

	public static void main(String[]args) {
		try {
			Socket socket=new Socket("localhost",3000);
			DataInputStream in=new DataInputStream(socket.getInputStream());
			DataOutputStream out=new DataOutputStream(socket.getOutputStream());
			out.writeUTF("RACHELI");
			String answer=in.readUTF();
			System.out.println(answer);
			in.close();
			out.close();
			socket.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
