package com.tka;
import java.util.Scanner;
public class arrayScanner {
public static void main(String[]args) {
	
   Scanner sc = new Scanner(System.in);
	System.out.println("enter 5 names..!");
	String[] name = new String[4];
	
	
	for(int i = 0; i< name.length; i++) {
		name[i] = sc.nextLine();
	}
  }
}
