package com.Day4assignment;
import java.util.*;
public class Decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		Scanner c=new Scanner(System.in);
		s=c.nextInt();
		decimaltobinary(s);

	}
	static void decimaltobinary(int s) {
		int k,l,m,i;
		i=0;
		int a[]=new int[10];
		while(s!=0) {
			k=s%2;
			s=s/2;
			a[i]=k;
			i++;
		}
		
		
	
	for(i=a.length-1;i>=0;i--) {
		System.out.print(a[i]);
	}

	}
}
