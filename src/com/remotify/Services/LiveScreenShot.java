package com.remotify.Services;

public class LiveScreenShot extends Thread {
	public volatile boolean running=false;

	@Override
	public void run() {
		int count=0;
		while(running)
		{
			System.out.println("ScreenShotSend");
			try {
				this.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(count==100)
			{
				break;
			}
			++count;
		}
		
	}

	
	public void stopRunning()
	{
		running=false;
	}
	
	

}
