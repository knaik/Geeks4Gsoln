import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner scan = new Scanner(System.in);
	 int total = scan.nextInt();
	 String[] arr = new String[total];
	 for (int i = 0; i < total; i++){
	     arr[i] = scan.next();
	     //System.out.println(arr[i]);
	 }
	 
	 for(int i = 0; i < arr.length; i++){
	     String temp = "";
	     for (int j = 0; j < arr[i].length(); j++){
	         temp = temp + arr[i].charAt(arr[i].length()-j-1);
	     }
	     arr[i] = temp;
	     System.out.println(temp);
	 }
	 
	 
	 }
}
