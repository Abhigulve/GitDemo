package Algorithms.arrays;

public class Hourglass {

	int calHighestHourGlass(int array[][]){
		
		 int maxsum=0;
	        for(int i = 0; i < array.length-2; i++){
	        for(int j = 0; j < array.length-2; j++){
	            
	                int sum = array[i][j] + array[i][j+1] + array[i][j+2] + array[i+1][j+1] + array[i+2][j] + array[i+2][j+1] + array[i+2][j+2];
	                if(sum > maxsum)
	                {
	                    maxsum = sum;
	                }
	        }
	    }
			return maxsum;   
	}
	public static void main(String[] args) {
	
}
}
