 //currently times out
 import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 
	 Scanner scan = new Scanner(System.in);
	 int Cases = scan.nextInt();
	 ArrayList<int[]> arrays = new ArrayList<int[]>();
	 
	 for (int i = 0; i < Cases; i++){
	     int len = scan.nextInt();
	     arrays.add(new int[len]);
	     for (int j = 0; j < len; j++){
	         arrays.get(i)[j] = scan.nextInt();
	     }
	     //System.out.println(Arrays.toString(arrays.get(i)));
	 }
	 
	 for(int[] arrC : arrays){
	     int[] temp = arrC;
	     //int mid = temp.length/2;
	     int low = 0;
	     int hi = temp.length-1;
	     while(low < hi){
	        if (temp[(low+hi)/2] == 1 && ((low+hi)/2  == 0 || temp[(low+hi)/2 - 1] == 0)){
	             System.out.println( (low+hi)/2);
	             
	        }
	     

            else if (temp[(low+hi)/2] == 1){
                hi = (low+hi)/2 - 1; 
            }
       
            // first '1' lies to the right of 'mid' 
            else{
                low = (low+hi)/2 + 1; 
            }
        } 
       
        // 1's are not present in the array 
        System.out.println( -1); 
	     
	     
	 }
	 
	 
	 
	 
	 }
}
