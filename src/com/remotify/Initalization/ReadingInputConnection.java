package com.remotify.Initalization;

import java.io.BufferedReader;
import java.io.DataInputStream;

import com.remotify.Services.LiveScreenShot;
import com.remotify.connections.InitConnection;
import com.remotify.exceptionmy.CloseException;

public class ReadingInputConnection {
	
	BufferedReader br=null;
	LiveScreenShot liveScreenShot=null;
	
	public ReadingInputConnection() {
	//	br=new BufferedReader(new InputStreamReader());
	}
	
	
	public void startReadingContinously() throws Exception
	{
		while(true)
		{
			try {
				System.out.println("Waiting for Message");
				DataInputStream din=new DataInputStream(InitConnection.getInputStream());
				String message=din.readUTF();
				System.out.println(message);
				if(liveScreenShot!=null && liveScreenShot.running==true)
				{
					liveScreenShot.stopRunning();
				}
				switch(message) {
					case "LiveScreenShot":
						liveScreenShot=new LiveScreenShot();
						liveScreenShot.running=true;
						liveScreenShot.start();

						
						break;
					case "Abhi AA RAha Hai":
						
						break;
					
						
				}
				
				
			} catch (Exception e) {
				if(liveScreenShot!=null)
				{
					liveScreenShot.stopRunning();
				}
				InitConnection.closeConnection();
				throw new CloseException();
			}
		}
	}
	
}
