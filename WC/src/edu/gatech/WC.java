package edu.gatech;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("#wordCounter");
		
		String str = "The quick brown fox jumps over the lazy dog";
		
		spaceChars(str);
		splitWord(str);
		fromFile();


	}
	
	public static void fromFile(){
		
		System.out.println("#file");
		
		String txt = "";
		
		try {
			@SuppressWarnings("resource")
			String str = new Scanner(new File("str.txt")).useDelimiter("\\A").next();
			txt = str;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(txt);
		splitWord(txt);
		spaceChars(txt);
		
		
		
	}
	public static void splitWord(String str){
		
		System.out.println("#split");
		
		String[] split = str.split(" ");
		int wc = split.length;
		
		System.out.println("\"" + str + "\"" + " contains " + wc + " words.");
		
		
		
	}
	
	public static void spaceChars(String str){
		
		System.out.println("#spaceChars");
		
		boolean wasSpace = true;
		int wc = 0;
		
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i)== ' '){
				wasSpace = true;
			}
			else{
				if(wasSpace)
					wc++;
				wasSpace = false;
			}
		}
		
		System.out.println("\"" + str + "\"" + " contains " + wc + " words.");
		
		
	}

}
