package com.google.msedge.opening;

import java.util.HashMap;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String str="google logo super";
		
		int vcount=0, ccount = 0;

		for(int i=0;i<str.length();i++)
		{
		    if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')

		    {
		    vcount++;
		}
		


		else if (str.charAt(i)>='a'&& str.charAt(i)<='z');
		{
		    ccount++;
		}
		System.out.println(vcount);
		//System.out.print(ccount);

	    
		}
	}
}

	



