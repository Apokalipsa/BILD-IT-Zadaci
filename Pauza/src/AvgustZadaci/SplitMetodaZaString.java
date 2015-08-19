package AvgustZadaci;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class SplitMetodaZaString {
	
	public static String[] split(String str, String regex){ 
		String[] orig = str.split(regex); 
		String[] finalarray = new String[(orig.length*2)-1]; 
		
		//set all elements in final arrray to the regex 
		//note: you don't subtract one on the for test 
		
		for(int i=0; i<finalarray.length; i++){ 
		finalarray[i]=regex; 
		} 
		//set every even-numbered element in the final to each split 
		
		for(int i=0; i<orig.length; i++){ 
		finalarray[i*2] = orig[i]; 
		} 
		//return result 
		return finalarray; 
		} 
	public static void main(String[] args) {
	
		String[] result = split("Q?M?YT#S", "[?#]");       // invoke methonds for split string
		
		for(int i = 0; i < result.length; i++){           // print result of split in console  
			System.out.print(result[i] + " ");
		}

	}
}
