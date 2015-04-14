package com.hackerrank;

import java.util.Scanner;

public class SolveMeFirst {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please Enter First Number");
    int firstNum = scanner.nextInt();
    System.out.println("Please Enter Second Number");
    int seconfNum = scanner.nextInt();
    scanner.close();
    System.out.println(SolveMeFirst.add(firstNum, seconfNum));
  }
  
  public static int add(int i, int j) {
    return i + j;
  }
}
