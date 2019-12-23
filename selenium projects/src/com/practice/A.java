package com.practice;

import java.util.StringTokenizer;

public class A
{
	public static void main(String[] args) {
		
		StringTokenizer st=new StringTokenizer("java programming", " ");
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextElement());
			
			
		}
		
	}
		
	
	
		
	
}
