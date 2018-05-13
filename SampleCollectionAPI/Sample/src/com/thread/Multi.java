package com.thread;

public class Multi implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi m=new Multi();
		Thread t1=new Thread(m);
		Thread t2=new Thread();
		t1.start();
		t1.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			i++;
			System.out.println(i);
		}
		System.out.println("my thread is running");
	}

}
