package jjjjjjj;

import java.util.Scanner;

public class program1
{
public static void main(String[] args) 
{
	char operater;
	Double number1 , number2 , result;
	Scanner input =new Scanner(System.in);
	System.out.println("Choose an operater: +, -, *, or /");
	operater=input.next().charAt(0);
	System.out.println("Enter first number");
	number1=input.nextDouble();
	System.out.println("Enter second number");
	number2=input.nextDouble();
	switch(operater)
	{
	case  '+':
		result = number1+number2;
		System.out.println(number1 + "+" + number2+ "+"+ result);
		break;
	case  '-':
		result = number1+number2;
		System.out.println(number1 + "-" + number2+ "-"+ result);
		break;
	case  '*':
		result = number1+number2;
		System.out.println(number1 + "*" + number2+ "*"+ result);
		break;
	case  '/':
		result = number1+number2;
		System.out.println(number1 + "/" + number2+ "/"+ result);
		break;
		default:
			System.out.println("invalid operator!");
			break;
	}
	input.close();

	}
};


