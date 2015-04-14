package com.hackerrank;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/is-fibo
public class IsFibo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numCycles = scanner.nextInt();
    while (numCycles >= 1) {
      int fib = scanner.nextInt();
      System.out.println(isFib(fib));
      numCycles--;
    }
    scanner.close();
  }
  
  public static String isFib(int fib) {
    if (calFib(fib)) {
      return "IsFibo";
    } else {
      return "IsNotFibo";
    }
  }
  
  public static boolean calFib(int fib) {
    int i = 3, tmp = 0, num1 = 0, num2 = 1;
    boolean returnVal = false;
    while (true) {
      if (num1 == fib || num2 == fib) {
        returnVal = true;
        break;
      }
      if (num2 > fib) {
        returnVal = false;
        break;
      }
      tmp = num2;
      num2 = num1 + num2;
      num1 = tmp;
      i++;
    }
    return returnVal;
  }
}
