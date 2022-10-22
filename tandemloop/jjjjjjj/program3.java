package jjjjjjj;

import java.util.Scanner;

public class program3 {
	public static void main(String[] args) 
{
	  Scanner sc= new Scanner(System.in);
	  System.out.println("enter number");
	  int n=sc.nextInt();
	  
	  int m=n*2;
	  if(n%2==0)
	  {
	  m=(n-1)*2;
	  }
	  else
	  {
		  m=n*2;
	  }
	  for(int i=1; i<=m;i++)
	  {
		   if(i % 2 !=0)
		  {
			  System.out.print(i+"\t");
		  }
	  }
}}




