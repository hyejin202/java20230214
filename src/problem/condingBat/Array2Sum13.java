package problem.condingBat;

public class Array2Sum13 {
	public int sum13(int[] nums) {
		  int answer = 0;
		 
		  for (int i=0; i<nums.length; i++) {
		    if (nums[i] == 13) {
		      i++;
		    
		    } else {
		       answer += nums[i];
		    }
		   
		  }
		  
		  return answer;
		}

}
