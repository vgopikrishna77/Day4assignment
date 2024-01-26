package com.Day4assignment;
import java.util.*;
public class MovieRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][4];
		int i,j;
		Scanner c=new Scanner(System.in);
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				a[i][j]=c.nextInt();
			}
		}
		
		moviereviews(a);
		
	}
	static void moviereviews(int[][] a) {
		int k=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				k=k+a[i][j]/3;
				
			}
			System.out.println("the average rating of movies are"+k);
			
		}
	}

}
