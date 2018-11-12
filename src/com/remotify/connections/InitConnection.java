package com.remotify.connections;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import com.remotify.Initalization.InitalizingServices;
import com.remotify.Initalization.ReadingInputConnection;

public class InitConnection {
	
	private static ServerSocket serverSocket=null;
	private static Socket socket=null;
	private static OutputStream outputStream;
	private static InputStream inputStream;
	private static int port=0;
	private static String serverIP=null;
	private static String clientAddress="";
	
	
	public static void main(String[] args) {
		
		try {
			port=GetPort.getFreePort();
			serverSocket=new ServerSocket(port);
			serverIP=InetAddress.getLocalHost().getHostAddress().trim();
			System.out.println("Server started at "+" "+serverIP+" "+"and "+port);
			socket=serverSocket.accept();
			clientAddress=socket.getInetAddress().getHostAddress().trim();
			outputStream=socket.getOutputStream();
			inputStream=socket.getInputStream();
			System.out.println("Connection Established with "+socket.getInetAddress() );
			new InitalizingServices().InitServices();
			System.out.println("Initalization Done");
			ReadingInputConnection rea=new ReadingInputConnection();
			rea.startReadingContinously();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			
			closeConnection();
			System.out.println("Connection Closed");
			
		}
	
	}
	
	

	
	public static void closeConnection()
	{
	
		try {
			if(serverSocket!=null)
			{
				serverSocket.close();
			}
			if(outputStream!=null)
			{
				outputStream.close();
			}
			if(inputStream!=null)
			{
				inputStream.close();
			}
			if(socket!=null)
			{
				socket.close();
			}
			
			for (Thread t : Thread.getAllStackTraces().keySet()) 
			{  if (t.getState()==Thread.State.RUNNABLE) 
			     t.interrupt(); 
			} 
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}



	public static OutputStream getOutputStream() {
		if(outputStream==null)
		{
			System.out.println("Null outputStream");
		}
		return outputStream;
	}


	public static InputStream getInputStream() {
		return inputStream;
	}


	public static int getPort() {
		return port;
	}


	public static String getServerIP() {
		return serverIP;
	}


	public static String getClientAddress() {
		return clientAddress;
	}


}
