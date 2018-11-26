package com.remotify.Services;


import java.io.DataInputStream;
import java.io.IOException;

import com.remotify.Initalization.InitalizingServices;

public class Power {
	
	static String os;
	Runtime runtime;
	DataInputStream dataInputStream;
	
	public Power()
	{
		 os = System.getProperty("os.name");
	     runtime = Runtime.getRuntime();
	     dataInputStream=new DataInputStream(InitalizingServices.getInputStream());
	}
	
	 public void shutdown() {     
	        try {
	            if ("Windows 8.1".equals(os) || "Windows 8.0".equals(os) || "Windows 10".equals(os)) {
	                runtime.exec("shutdown -s");
	            } else {
	                System.out.println("Unsupported operating system");
	            }
	        } catch(Exception e) {
	            System.out.println("shutdown error");
	            e.printStackTrace();
	        }
	        
	    }
	    
	    public void restart() {     
	        try {
	            if ("Windows 8.1".equals(os) || "Windows 8.0".equals(os) || "Windows 10".equals(os)) {
	                runtime.exec("shutdown -r");
	            } else {
	                System.out.println("Unsupported operating system");
	            }
	        } catch(Exception e) {
	            System.out.println("restart error");
	            e.printStackTrace();
	        }
	        
	    }
	    
	    public void suspend() {     
	        try {
	            if ("Windows 8.1".equals(os) || "Windows 8.0".equals(os) || "Windows 10".equals(os)) {
	                runtime.exec("Rundll32.exe powrprof.dll,SetSuspendState Sleep");
	            } else {
	                System.out.println("Unsupported operating system");
	            }
	        } catch(Exception e) {
	            System.out.println("suspend error");
	            e.printStackTrace();
	        }   
	    }
	    
	  public void waitingForInput()
	  {
		  try {
			String str=dataInputStream.readUTF();
			System.out.println(str);
			if(str.equals("Shutdown"))
			{
				shutdown();
			}
			else if(str.equals("Restart"))
			{
				restart();
				
			}
			else if(str.equals("Sleep"))
			{
				suspend();
			}
			else if(str.equals("Change"))
			{
				System.out.println("Scene Change Kindly");
			}
			else
			{
				System.out.println("Wrong Input");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		  
	  }
	    
	
	
}
