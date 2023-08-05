package com.java.lambda;


class ThreradDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run merthod called ....");
	}
	
}
public class RunnableLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Thread thread = new Thread(new ThreradDemo() );
          thread.start(); 
          
          Runnable runnable =() -> System.out.println("trun therad lambna");
          Thread threadLambda = new Thread(runnable);
          threadLambda.start();
	}

}
