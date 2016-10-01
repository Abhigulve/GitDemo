package Algorithms.arrays;

import java.util.ArrayList;
import java.util.List;



public class DuplicateNumbers
{
    void printRepeating(int arr[], int size)
    {
    	List<Integer>list=new ArrayList<Integer>();
        int count=0, i,array[]=new int[size];
        
      //String[] array=new String[size];
        for(i = 0; i < size; i++)
        {
        	if(array[arr[i]]==-9999){
        		list.add(arr[i]);
        	}else{
        		array[arr[i]]=-9999;
        	}
        }
        System.out.println("repeated numbers"+list);
    } 
    
public static int repeatedNumber(final List<Integer> a) {
	int array[]=new int[a.size()];
	if(a.size()==0){
		return -1;
	}
	for (int i = 0; i < a.size(); i++) {
		 if(array[a.get(i)]==-1){
			
			 return a.get(i);
		 }else{
			 array[a.get(i)]=-1; 
		 }
	}
	return -1;
	}
    
    
    /* Driver program to test the above function */
    public static void main(String[] args) 
    {
        //DuplicateNumbers duplicate = new DuplicateNumbers();
        //int arr[] = {4, 2, -4, 5, 2, 3, 1,0,0};
        //int arr_size = arr.length;
        //duplicate.printRepeating(arr, arr_size);
        ArrayList<Integer>list=new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        System.out.println( repeatedNumber(list));
        
    }
}