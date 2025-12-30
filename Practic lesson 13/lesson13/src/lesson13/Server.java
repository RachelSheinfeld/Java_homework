package lesson13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(4000);
			System.out.print("server is runing");
			int x=2000;
			while (true) {
			Socket socket = server.accept();
			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			String name = in.readUTF();
			
			out.writeUTF("hello  " + name+"is number "+x++);
			in.close();
			out.close();
			socket.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
