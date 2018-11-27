package com.remotify.Services;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import java.io.IOException;

import com.remotify.Initalization.InitalizingServices;


public class Keyboard {
	
	Robot robot;
	DataInputStream dataInputStream;
	boolean running=true;
	public Keyboard(Robot robot) {
		this.robot=robot;
		dataInputStream=new DataInputStream(InitalizingServices.getInputStream());
	}

	public void startKeyStrokes() {
		
		while(running)
		{
			try {
				String str=dataInputStream.readUTF();
				
				System.out.println(str);
				
				switch(str){
				
					case "VK_A":
						keyPressed(KeyEvent.VK_A);
						 
						keyReleased(KeyEvent.VK_A);
						break;
			
					case "VK_B":
						keyPressed(KeyEvent.VK_B);
						 
						keyReleased(KeyEvent.VK_B);
						break;
			
					case "VK_C":
						keyPressed(KeyEvent.VK_C);
						 
						keyReleased(KeyEvent.VK_C);
						break;
			
					case "VK_D":
						keyPressed(KeyEvent.VK_D);
						 
						keyReleased(KeyEvent.VK_D);
						break;
			
					case "VK_E":
						keyPressed(KeyEvent.VK_E);
						 
						keyReleased(KeyEvent.VK_E);
						break;
			
					case "VK_F":
						keyPressed(KeyEvent.VK_F);
						 
						keyReleased(KeyEvent.VK_F);
						break;
			
					case "VK_G":
						keyPressed(KeyEvent.VK_G);
						 
						keyReleased(KeyEvent.VK_G);
						break;
			
					case "VK_H":
						keyPressed(KeyEvent.VK_H);
						 
						keyReleased(KeyEvent.VK_H);
						break;
			
					case "VK_I":
						keyPressed(KeyEvent.VK_I);
						 
						keyReleased(KeyEvent.VK_I);
						break;
			
					case "VK_J":
						keyPressed(KeyEvent.VK_J);
						 
						keyReleased(KeyEvent.VK_J);
						break;
			
					case "VK_K":
						keyPressed(KeyEvent.VK_K);
						 
						keyReleased(KeyEvent.VK_K);
						break;
			
					case "VK_L":
						keyPressed(KeyEvent.VK_L);
						 
						keyReleased(KeyEvent.VK_L);
						break;
			
					case "VK_M":
						keyPressed(KeyEvent.VK_M);
						 
						keyReleased(KeyEvent.VK_M);
						break;
			
					case "VK_N":
						keyPressed(KeyEvent.VK_N);
						 
						keyReleased(KeyEvent.VK_N);
						break;
			
					case "VK_O":
						keyPressed(KeyEvent.VK_O);
						 
						keyReleased(KeyEvent.VK_O);
						break;
			
					case "VK_P":
						keyPressed(KeyEvent.VK_P);
						 
						keyReleased(KeyEvent.VK_P);
						break;
			
					case "VK_Q":
						keyPressed(KeyEvent.VK_Q);
						 
						keyReleased(KeyEvent.VK_Q);
						break;
			
					case "VK_R":
						keyPressed(KeyEvent.VK_R);
						 
						keyReleased(KeyEvent.VK_R);
						break;
			
					case "VK_S":
						keyPressed(KeyEvent.VK_S);
						 
						keyReleased(KeyEvent.VK_S);
						break;
			
					case "VK_T":
						keyPressed(KeyEvent.VK_T);
						 
						keyReleased(KeyEvent.VK_T);
						break;
			
					case "VK_U":
						keyPressed(KeyEvent.VK_U);
						 
						keyReleased(KeyEvent.VK_U);
						break;
			
					case "VK_V":
						keyPressed(KeyEvent.VK_V);
						 
						keyReleased(KeyEvent.VK_V);
						break;
			
					case "VK_W":
						keyPressed(KeyEvent.VK_W);
						 
						keyReleased(KeyEvent.VK_W);
						break;
			
					case "VK_X":
						keyPressed(KeyEvent.VK_X);
						 
						keyReleased(KeyEvent.VK_X);
						break;
			
					case "VK_Y":
						keyPressed(KeyEvent.VK_Y);
						 
						keyReleased(KeyEvent.VK_Y);
						break;
			
					case "VK_Z":
						keyPressed(KeyEvent.VK_Z);
						 
						keyReleased(KeyEvent.VK_Z);
						break;
						
					case "VK_SPACE":
						keyPressed(KeyEvent.VK_SPACE);
						 
						keyReleased(KeyEvent.VK_SPACE);
						break;
					
					case "VK_BACK_SPACE":
						keyPressed(KeyEvent.VK_BACK_SPACE);
						 
						keyReleased(KeyEvent.VK_BACK_SPACE);
						break;
				
					case "VK_DELETE":
						keyPressed(KeyEvent.VK_DELETE);
						 
						keyReleased(KeyEvent.VK_DELETE);
						break;
						
					case "VK_CTRL":
						keyPressed(KeyEvent.VK_CONTROL);
						 
						keyReleased(KeyEvent.VK_CONTROL);
						break;	
						
								
					case "VK_ALT":
						keyPressed(KeyEvent.VK_ALT);
						 
						keyReleased(KeyEvent.VK_ALT);
						break;	
						
					case "VK_SHIFT":
						keyPressed(KeyEvent.VK_SHIFT);
						 
						keyReleased(KeyEvent.VK_SHIFT);
						break;	
						
					case "UP":
						keyPressed(KeyEvent.VK_UP);
						 
						keyReleased(KeyEvent.VK_UP);
						break;	
					
					case "DOWN":
						keyPressed(KeyEvent.VK_DOWN);
						 
						keyReleased(KeyEvent.VK_DOWN);
						break;	
						
					case "LEFT":
						keyPressed(KeyEvent.VK_LEFT);
						 
						keyReleased(KeyEvent.VK_LEFT);
						break;	
						
					case "RIGHT":
						keyPressed(KeyEvent.VK_RIGHT);
						 
						keyReleased(KeyEvent.VK_RIGHT);
						break;	
						
					case "VK_ESCAPE":
						keyPressed(KeyEvent.VK_ESCAPE);
						 
						keyReleased(KeyEvent.VK_ESCAPE);
						break;	
						
						
					case "VK_0":
						keyPressed(KeyEvent.VK_0);
						 
						keyReleased(KeyEvent.VK_0);
						break;	
					case "VK_1":
						keyPressed(KeyEvent.VK_1);
						 
						keyReleased(KeyEvent.VK_1);
						break;	
					case "VK_2":
						keyPressed(KeyEvent.VK_2);
						 
						keyReleased(KeyEvent.VK_2);
						break;	
					case "VK_3":
						keyPressed(KeyEvent.VK_3);
						 
						keyReleased(KeyEvent.VK_3);
						break;	
					case "VK_4":
						keyPressed(KeyEvent.VK_4);
						 
						keyReleased(KeyEvent.VK_4);
						break;	
					case "VK_5":
						keyPressed(KeyEvent.VK_5);
						 
						keyReleased(KeyEvent.VK_5);
						break;	
					case "VK_6":
						keyPressed(KeyEvent.VK_6);
						 
						keyReleased(KeyEvent.VK_6);
						break;	
					case "VK_7":
						keyPressed(KeyEvent.VK_7);
						 
						keyReleased(KeyEvent.VK_7);
						break;	
					case "VK_8":
						keyPressed(KeyEvent.VK_8);
						 
						keyReleased(KeyEvent.VK_8);
						break;	
					case "VK_9":
						keyPressed(KeyEvent.VK_9);
						 
						keyReleased(KeyEvent.VK_9);
						break;	
						
						
						
					case "VK_*":
						keyPressed(KeyEvent.VK_MULTIPLY);
						 
						keyReleased(KeyEvent.VK_MULTIPLY);
						break;	
					case "VK_+":
						keyPressed(KeyEvent.VK_PLUS);
						keyReleased(KeyEvent.VK_PLUS);
						break;
						
						
					case "VK_/":
						keyPressed(KeyEvent.VK_DIVIDE);
						 
						keyReleased(KeyEvent.VK_DIVIDE);
						break;	
					case "VK_-":
						keyPressed(KeyEvent.VK_MINUS);
						 
						keyReleased(KeyEvent.VK_MINUS);
						break;	
							
						
						
						
						
						
					case "(":
						keyPressed(KeyEvent.VK_LEFT_PARENTHESIS);
						 
						keyReleased(KeyEvent.VK_LEFT_PARENTHESIS);
						break;	
					case ")":
						keyPressed(KeyEvent.VK_RIGHT_PARENTHESIS);
						 
						keyReleased(KeyEvent.VK_RIGHT_PARENTHESIS);
						break;	
					case "{":
						keyPressed(KeyEvent.VK_OPEN_BRACKET);
						 
						keyReleased(KeyEvent.VK_OPEN_BRACKET);
						break;	
					case "}":
						keyPressed(KeyEvent.VK_CLOSE_BRACKET);
						 
						keyReleased(KeyEvent.VK_CLOSE_BRACKET);
						break;	
						
						
					case "CAPSLOCK":
						keyPressed(KeyEvent.VK_CAPS_LOCK);
						 
						keyReleased(KeyEvent.VK_CAPS_LOCK);
						break;	
						
						
						
					case "CTRL+ALT+T":
						 	robot.keyPress(KeyEvent.VK_CONTROL);
					        robot.keyPress(KeyEvent.VK_ALT);
					        robot.keyPress(KeyEvent.VK_T);
					        robot.delay(10);
					        robot.keyRelease(KeyEvent.VK_T);
					        robot.keyRelease(KeyEvent.VK_ALT);
					        robot.keyRelease(KeyEvent.VK_CONTROL);
						break;	
						
					case "CTRL+SHIFT+Z":
						keyPressed(KeyEvent.VK_CONTROL);
						keyPressed(KeyEvent.VK_SHIFT);
						keyPressed(KeyEvent.VK_Z);
				        robot.delay(10);
				        keyReleased(KeyEvent.VK_Z);
				        keyReleased(KeyEvent.VK_SHIFT);
				        keyReleased(KeyEvent.VK_CONTROL);
						break;	
						
					case "CTRL+ALT+DEL":
						keyPressed(KeyEvent.VK_CONTROL);
						keyPressed(KeyEvent.VK_ALT);
						keyPressed(KeyEvent.VK_DELETE);
						robot.delay(10);
				        keyReleased(KeyEvent.VK_CONTROL);
						keyReleased(KeyEvent.VK_ALT);
						keyReleased(KeyEvent.VK_DELETE);
						break;	
			
					case "ALT+F4":
						keyPressed(KeyEvent.VK_ALT);
						keyPressed(KeyEvent.VK_F4);
						robot.delay(10);
				        keyReleased(KeyEvent.VK_ALT);
						keyReleased(KeyEvent.VK_F4);
						
						break;	
					case "Change":
						running=false;
						break;
						
				}
			
			} catch (IOException e) {
				running=false;
			}
			
		}
		
	}

	private void keyReleased(int str) {
		robot.keyRelease(str);
		
	}

	private void keyPressed(int str) {
		robot.keyPress(str);
		
	}

	
	public void changeRunning() {
		running=true;
	}
}
