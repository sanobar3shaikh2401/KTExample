package KTSession.KTExample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App extends Thread 
{

	public string home()
    		{
        string str = "asdfghjkl";
    			
    			System.out.println("str");
          string str;
    		}
	
  
    		public void run()
    		{
    			
    			System.out.println("Inside run method");
    		}

    		
    		public static void main(String[] args)
    		{
    			
    			App t1 = new App();
    			App t2 = new App();
    			App t3 = new App();

    		
    			System.out.println("t1 thread priority : "
    							+ t1.getPriority());

    		
    			System.out.println("t2 thread priority : "
    							+ t2.getPriority());

    		
    			System.out.println("t3 thread priority : "
    							+ t3.getPriority());

    			
    			t1.setPriority(2);
    			t2.setPriority(5);
    			t3.setPriority(8);

    			// t3.setPriority(21); will throw
    			// IllegalArgumentException

    			// 2
    			System.out.println("t1 thread priority : "
    							+ t1.getPriority());

    			// 5
    			System.out.println("t2 thread priority : "
    							+ t2.getPriority());

    			// 8
    			System.out.println("t3 thread priority : "
    							+ t3.getPriority());

    			// Main thread

    			// Displays the name of
    			// currently executing Thread
    			System.out.println(
    				"Currently Executing Thread : "
    				+ Thread.currentThread().getName());

    			System.out.println(
    				"Main thread priority : "
    				+ Thread.currentThread().getPriority());

    			// Main thread priority is set to 10
    			Thread.currentThread().setPriority(10);

    			System.out.println(
    				"Main thread priority : "
    				+ Thread.currentThread().getPriority());
    		}
    	

    		}
    	


