package com.java.MultiThreading;

class AMyThreadExtendsThread extends Thread{
	
	public void run() {
		
		for(int i=0;i<10;i++) {    //Executed by child thread
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Extending Thread Class");
		}
		System.out.println(Thread.currentThread().getPriority());
	}

}

public class AMyThreadExtendsThreadMain {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getPriority());
		AMyThreadExtendsThread thread = new AMyThreadExtendsThread(); //thread instantiation
		thread.start(); //starting a thread
		for(int i=0;i<10;i++) { //By main thread
			Thread.sleep(10);
			System.out.println("Main thread");
		}
		
	}

}
