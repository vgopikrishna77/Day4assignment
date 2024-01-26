package com.Day4assignment;

import java.util.Scanner;

public class Boygirlsaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner c=new Scanner(System.in);
		n=c.nextInt();
		percentages(n);

	}
	static void percentages(int n) {
		int max=100,min=1,k=0,l=0,s=0,t=0,z=0,w=0,u=0,v=0;
		float x,y,j,f,di,sdif;
		int a[]=new int[n];
		int b=(n*55)/100;
		int g=(n*45)/100;
		for(int i=0;i<b;i++) {
			a[i]=(int) (Math.random()*(max-min))+min;
			
			if(a[i]>=60 && a[i]<90) {k++;
				System.out.println("they are first division"+a[i]);
				s=s+a[i];
			}
			else if(a[i]>=45 && a[i]<60) {
				t=t+a[i];
				l++;
				System.out.println("second division"+a[i]);
			}
			else if(a[i]>=90) {
				
				System.out.println("90 above"+a[i]);
			}
		}
		x=t/l;
		y=s/k;
		System.out.println("the average of first division boys"+y+"\n the average of second division boys"+x );
		for(int i=0;i<g;i++) {
			a[i]=(int) (Math.random()*(max-min))+min;
			
			if(a[i]>=60 && a[i]<90) {u++;
				System.out.println("they are first division"+a[i]);
				v=v+a[i];
			}
			else if(a[i]>=45 && a[i]<60) {
				w=w+a[i];
				z++;
				System.out.println("second division"+a[i]);
			}
			else if(a[i]>=90) {
				
				System.out.println("90 above"+a[i]);
			}
		}
		j=v/u;
		f=w/z;
		System.out.println("the average of first division"+j+"\n the average of second division"+f );
		System.out.println("the average of first division"+y+"\n the average of second division"+x);

di=Math.abs(y-j);
 sdif=Math.abs(x-f);
System.out.println("the difference of first division boys and girls"+di+"\n the difference of second division boys and girls"+sdif );


	}

}
