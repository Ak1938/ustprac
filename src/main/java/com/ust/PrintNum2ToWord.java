package com.ust;

import java.util.Scanner;
import java.util.logging.Logger;

public class PrintNum2ToWord {
	
public static void main(String[] args) {
	Logger logger = Logger.getLogger(PrintNum2ToWord.class.getName());
	logger.info("application started");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter  num");
	int a = sc.nextInt();
	logger.info("num is "+a);
	System.out.println("hi");
	switch(a)
	{
	case 1:
		System.out.println("one");
		break;
	case 2:
		System.out.println("two");
		break;
	case 3:
		System.out.println("three");
		break;
	case 4:
		System.out.println("four");
		break;
	case 5:
		System.out.println("five");
		break;
	case 6:
		System.out.println("six");
		break;
	default:
		System.out.println("invalid");
	}	
}
}

