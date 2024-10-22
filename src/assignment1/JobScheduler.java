package assignment1;

import java.util.ArrayList;

public class JobScheduler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// array 
		int[][] process = {
				{0,10},
				{6,20},
				{60,10},
				{110,5}
		               };
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		ServiceJobScheduler serviceJobScheduler = new ServiceJobScheduler();
        System.out.println("completionTime -> " + serviceJobScheduler.completionTime(process , ans)); 
		System.out.println("waitingTime -> " + serviceJobScheduler.waitingTime(process, ans)); 
		System.out.println("turnAroundTime -> " + serviceJobScheduler.turnAroundTime(process, ans)); 
		
		double avgWaitingTime = serviceJobScheduler.averageWaitingTime(process, ans);
		System.out.println("avgWaitingTime -> " + avgWaitingTime);
		
		int maxWaitingTime = serviceJobScheduler.maximumWaitingTime(process, ans);
		System.out.println("maxWaitingTime -> " +maxWaitingTime);
		

	}

}
