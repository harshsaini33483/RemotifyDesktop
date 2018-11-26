package com.remotify.Initalization;
import java.awt.Robot;
import java.io.InputStream;
import java.io.OutputStream;

import com.remotify.Services.Keyboard;

import com.remotify.connections.*;

public class InitalizingServices{
	
	
	private static InputStream inputStream=null;
	private static OutputStream outputStream=null;
	private static Robot robot=null;

	private static Keyboard keyboard=null;
	/*
	 *	Define All Services Variable 
	 * 
	 */

	public void InitServices()
	{
		System.out.println("Initializing all Services Please Wait");
		outputStream=InitConnection.getOutputStream();
		inputStream=InitConnection.getInputStream();
		try {
			robot=new Robot();
			//power=new Power(robot);

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		keyboard=new Keyboard(robot);
		
		
		/*
		 * Initialize all the services variable
		 * 
		 */
	}
	
	
	public static Robot getRobot() {
		return robot;
	}


	public static  OutputStream getOutputStream() {
		
		return outputStream;
	}
	public static InputStream getInputStream() {
		return inputStream;
	}


	public static Keyboard getKeyboard() {
		return keyboard;
	}
	
	
}
