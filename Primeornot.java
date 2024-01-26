package com.Day4assignment;
import java.util.*;
public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,u,n;
		Scanner c=new Scanner(System.in);
		l=c.nextInt();
		u=c.nextInt();
		n=c.nextInt();
		primeornot(l,u,n);
		

	}
	static void primeornot(int l,int u,int n){
		int r=(int) ((Math.random()*(u-l))+l);
		int a[]=new int[n];
		int b[]=new int[n];
		int d[]=new int[n];
		int flag=0,y=0,m;
		for(int i=0;i<n;i++) {
			r=(int) ((Math.random()*(u-l))+l);
		     a[i]=r;
		m=1;
		for(int j=1;j<r;j++) {
			
			if(r%j==0) {
				m++;
				
				
				}
			
			}
		if(m==2) {
			b[i]=a[i];
			y++;
			System.out.println(b[i]);
		}
		else {
			d[i]=a[i];
			
			System.out.println("not prime number"+d[i]);
		}
		
		}
		System.out.println("total prime numbers areSa are "+y);
	}

}
