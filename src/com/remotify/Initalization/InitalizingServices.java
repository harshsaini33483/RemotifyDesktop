package com.remotify.Initalization;
import java.io.InputStream;
import java.io.OutputStream;
import com.remotify.connections.*;

public class InitalizingServices{
	
	
	private static InputStream inputStream=null;
	private static OutputStream outputStream=null;
	/*
	 *	Define All Services Variable 
	 * 
	 */

	public void InitServices()
	{
		System.out.println("Initializing all Services Please Wait");
		outputStream=InitConnection.getOutputStream();
		inputStream=InitConnection.getInputStream();
		/*
		 * Initialize all the services variable
		 * 
		 */
	}
	
	
	public static  OutputStream getOutputStream() {
		
		return outputStream;
	}
	public static InputStream getInputStream() {
		return inputStream;
	}
	
	
}
