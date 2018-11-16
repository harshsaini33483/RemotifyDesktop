package com.remotify.Services;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.DataOutputStream;

import javax.imageio.ImageIO;

import com.remotify.Initalization.InitalizingServices;
import com.remotify.exceptionmy.LiveScreenException;

public class LiveScreenShot extends Thread {
	public volatile boolean running=false;

	DataOutputStream oos=null;
	Robot robot = null;
	
	public LiveScreenShot()
	{
		oos=new DataOutputStream(InitalizingServices.getOutputStream());
		
	}
	
	@Override
	public void run() {
		robot=InitalizingServices.getRobot();
		Rectangle rectangle=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		while(running){
					BufferedImage image=robot.createScreenCapture(rectangle);

					try{
						ImageIO.write(image,"jpeg",oos);
						Thread.sleep(100);
					}
					catch(Exception e){
						try {
							throw new LiveScreenException();
						} catch (LiveScreenException e1) {
							e1.printStackTrace();
						}
					}
		}
	}
		
	

	
	public void stopRunning()
	{
		running=false;
	}
	
	

}
