package com.hackerrank;

import java.util.Scanner;

public class SolveMeSecond {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of lines");
    int numLines = scanner.nextInt();
    int i = 1;
    while(i<=numLines){
      System.out.println("Enter two numbers Seperated by space");
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      System.out.println(SolveMeSecond.add(a,b));
      i++;
    }
    scanner.close();
  }
  
  public static int add(int i, int j) {
    return i + j;
  }
}
