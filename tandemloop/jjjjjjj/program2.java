package jjjjjjj;

import java.util.Scanner;

public class program2 
{
public static void main(String[] args) 
{
	  Scanner sc = new Scanner(System.in);

	  System.out.println("enter the number");
	  int n=sc.nextInt();
	  int m=n*2;
	  for(int i=1; i<=m;i++)
	  {
		   if(i % 2 !=0)
		  {
			  System.out.print(i+"\t");
		  }
	  }
}}

