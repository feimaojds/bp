package leecode;

public class SingleNumberII {
	
public int singleNumber(int[] nums) {
	    int res = 0;
        for(int i=0;i<32;i++){
        	int sum = 0;
        	for(int j=0;j<nums.length;j++){
        		if(((nums[j]>>i) & 1) == 1){
        			sum ++;
        			sum = sum %3;
        		} 
        	}
        	if(sum!=0){
    			res = res | (1<<i) ;
    		}
        }
        return res;
    }

}
