package com.Day4assignment;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		int n;
		n=c.nextInt();
		int[] a=series(n);
		everyfive(a);
		evenodd(a);//program 4

	}
	static int[] series(int n) {
		int n1,n2,n3;
		n1=0;
		n2=1;
		int[] a=new int[n];
		a[0]=n1;
		a[1]=n2;
		int i;
		for(i=2;i<n;i++) {
			n3=n1+n2;
			a[i]=n3;
			
			n1=n2;
			n2=n3;
			
		
		
		}
		return a;
	}
	static void everyfive(int[] a) {
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");

			if((i+1)%5==0 || i==a.length-1) {
				System.out.println();
			}
			
		}
	}
	static void evenodd(int[] a) {
		int b[]=new int[a.length];
		int d[]=new int[a.length];
		int k=0,m=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				b[i]=a[i];
				k++;
			}
			else {
				d[i]=a[i];
				m++;
			}
			
		}
		for(int i=0;i<b.length;i++) {
			if(b[i]!=0) {
				
			
			System.out.print(b[i]);
			}
		}
		System.out.println();
		for(int i=0;i<d.length;i++) {
			if(d[i]!=0) {
				
			
			System.out.print(d[i]);
		}}
		System.out.println();
		System.out.println("even numbres total are:"+k+"\n odd numbers total are"+m);
	}

}
