package assignment1;

import java.util.ArrayList;

public class ServiceJobScheduler {
	
	// Calculate the completion Time
	public ArrayList<Integer> completionTime(int [][] process , ArrayList<Integer> ans ) {
		
		
		ans.add(process[0][1]);
		
		int curr = process[0][1];
		
		for(int i=1; i<process.length; i++) {
			
			if(curr > process[i][0]) {
				curr += process[i][1];
			}
			else {
				curr = process[i][0] + process[i][1];
			}
			ans.add(curr);
		}
		return ans; 
	}
	
    // Calculate the turnAroundTime  = completionTime - ArrivalTime
    public ArrayList<Integer> turnAroundTime(int [][] process , ArrayList<Integer> ans) {
    	
    	ArrayList<Integer> ct = completionTime(process , ans);
    	ArrayList<Integer> tat = new ArrayList<Integer>();
    	
    	
    	for(int i=0; i<process.length; i++) {
    		
    		tat.add(ct.get(i) - process[i][0]); 
    		
    	}
    	
    	return tat; 
    }
    
    // Calculate the waitingTime = turnAroundTime - BurstTime
    public ArrayList<Integer> waitingTime(int [][] process , ArrayList<Integer> ans) {
		
    	
    	ArrayList<Integer> tat = turnAroundTime(process , ans);
    	ArrayList<Integer> wt = new ArrayList<Integer>();
    	
    	for(int i=0; i<process.length; i++) {
    		wt.add(tat.get(i) - process[i][1]); 
    	}
    	
    	return wt; 
    	
	}
    
    // Calculate the averageWaitingTime
    public Double averageWaitingTime(int [][] process , ArrayList<Integer> ans) {
    	
    	ArrayList<Integer> wt = waitingTime(process , ans);
    	
    	double res =0.0; 
    	
    	for(int i=0; i<process.length; i++) {
    		res += (double) wt.get(i);
    	}
    	
    	return res/process.length; 
    	
    }
    
    // Calculate the maximumWaitingTime
    public int  maximumWaitingTime(int [][] process , ArrayList<Integer> ans) {
    	
    	ArrayList<Integer> wt = waitingTime(process , ans);
    	
    	int res = -1; 
    	
    	for(int i=0; i<process.length; i++) {
    		if(wt.get(i) > res) {
    			res = wt.get(i);
    		}
    	}
    	return res; 
    }
	

}
