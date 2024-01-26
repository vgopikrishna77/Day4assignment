package com.Day4assignment;
import java.util.*;
public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner c=new Scanner(System.in);
		n=c.nextInt();
		percentages(n);

	}
	static void percentages(int n) {
		int max=100,min=1,k=0,l=0,s=0,t=0;
		float x,y;
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
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
		System.out.println("the average of first division"+y+"\n the average of second division"+x );

	}}
