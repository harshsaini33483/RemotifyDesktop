package com.remotify.Services;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.DataInputStream;
import java.io.IOException;

import com.remotify.Initalization.InitalizingServices;

public class Mouse {
	
	Robot robot=null;
	private boolean running=true;
	DataInputStream dataInputStream;
	
	public Mouse(Robot robot) {
		this.robot=robot;
		dataInputStream=new DataInputStream(InitalizingServices.getInputStream());
	}
	
	
	public void startMouse() {
		while(running)
		{
			try {
				String str=dataInputStream.readUTF();
				System.out.println(str);
				String s[]=str.split(",");
				
				switch (s[0]) {
				
				case "MOUSE_MOVE":
					Point point = MouseInfo.getPointerInfo().getLocation(); 
					int x=Integer.parseInt(s[1]);
					int y=Integer.parseInt(s[2]);
					float nowx = point.x;
                    float nowy = point.y;
                    robot.mouseMove((int) (nowx + x), (int) (nowy + y));
					
					break;
					
					
				case "MOUSE_WHEEL":
					int disX=Integer.parseInt(s[1]);
					robot.mouseWheel(disX);
					break;
					
					
					
				case "LEFT_CLICK":
					 robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				     robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); 
				     break;
				     
				case "RIGHT_CLICK":
						robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
						robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
						break;
						
						
						
				case "Change":
					running=false;
					break;
				}
			}
			
			
			
			catch (IOException e) {
				running=false;
			}
		
		}
	}
	
	
	public void changeRunning() {
		running=true;		
	}

}
