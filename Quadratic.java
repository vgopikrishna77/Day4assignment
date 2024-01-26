package com.Day4assignment;
import java.util.*;
public class Quadratic {

	public static void main(String[] args) {
		double a,b,d;
		Scanner c=new Scanner(System.in);
		a=c.nextDouble();
		b=c.nextDouble();
		d=c.nextDouble();
		delta(a,b,d);
		roots(a,b,d);
		
		// TODO Auto-generated method stub

	}
	static double delta(double a,double b,double d) {
		double k=((b*b)-(4*a*d));
		return k;
	}
	static void roots(double a,double b,double d) {
		double k=delta(a,b,d);
		double x1,x2;
		x1=(-b+(Math.sqrt(k)))/(2*a);
		x2=(-b-(Math.sqrt(k)))/(2*a);
		System.out.print(x1+""+x2);
	}


}
