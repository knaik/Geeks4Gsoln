// NOT OPTIMIZED, times out
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
	 
	 ArrayList<int[]> waves = new ArrayList<int[]>();
	 for (int k = 0; k < Cases; k++){
	     int[] temp = arrays.get(k);
	     int[] tempEven = new int[temp.length/2+1]; //add one size to not worry about even vs odd
	     int[] tempOdd = new int[temp.length/2+1];
	     int[] tempFin = new int[temp.length+1];
	     
	     for (int m = 0; m < temp.length; m++){
	         if (m % 2 == 0){
	             tempOdd[m/2] = temp[m];
	         }
	         else{
	             tempEven[m/2] = temp[m];
	         }
	     }
	    // System.out.println(Arrays.toString(tempEven));
        // System.out.println(Arrays.toString(tempOdd));
         for (int p = 0; p < temp.length+1; p++){
             if (p % 2 == 0){
                 if (tempEven[p/2] != 0){
                 tempFin[p] = tempEven[p/2];
                }
             }
             else{
                 if (p % 2 == 1){
                 tempFin[p] = tempOdd[p/2];
                }         
             }
             
        //System.out.println(Arrays.toString(tempFin));
         }
         String prn = "";
         
         for (int w = 0 ; w < tempFin.length; w++){
             if (tempFin[w] == 0 && w > 1){
                 prn += "";
             }
             else{
                 prn += tempFin[w]+" ";
             }
            
         }
         System.out.println(prn.trim());

	 }
	 }
}


//better optimized?


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
	 
	 ArrayList<int[]> waves = new ArrayList<int[]>();
	 for (int k = 0; k < Cases; k++){
	     int[] temp = arrays.get(k);
	     for (int p = 0; p < temp.length-1; p+=2){
	         int hold = temp[p+1];
	         temp[p+1]=temp[p];
	         temp[p] = hold;
	     }
	     
	     
	     System.out.println(Arrays.toString(temp));
	     
	 }
	     
	     String prn = "";
         
         for (int w = 0 ; w < temp.length; w++){
             if (temp[w] == 0 && w > 1){
                 prn += "";
             }
             else{
                 prn += temp[w]+" ";
             }
            
         }
         System.out.println(prn.trim());

	 }
	     
	 }
}






//final accepted solution
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
	 
	 ArrayList<int[]> waves = new ArrayList<int[]>();
	 for (int k = 0; k < Cases; k++){
	     int[] temp = arrays.get(k);
	     for (int p = 0; p < temp.length-1; p+=2){
	         int hold = temp[p+1];
	         temp[p+1]=temp[p];
	         temp[p] = hold;
	     }
	     
	     
	     System.out.println(Arrays.toString(temp).replace("[", "").replace("]", "").replace(",",""));
	     
	 }
	     
	     
	     
	 }
}
