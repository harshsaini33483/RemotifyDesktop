package com.remotify.connections;

import java.io.IOException;
import java.net.ServerSocket;

public class GetPort {
	static ServerSocket server=null;
	
	
	public static  int getFreePort() throws Exception {
	int start=49151;
	while(start<=65535)
		{
			try {
				server=new ServerSocket(start);
				server.close();
				return start;
			} catch (IOException e) {
				System.out.println("Trying another port "+start+" is busy");
			}
			finally {
				++start;
			}
		
	
		}
		throw new Exception("All private port are busy");

	}
}