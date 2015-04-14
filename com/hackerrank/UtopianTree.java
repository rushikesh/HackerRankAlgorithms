package com.hackerrank;

import java.util.Scanner;

public class UtopianTree {
  /**
   * https://www.hackerrank.com/challenges/utopian-tree
   */
  public static void main(String[] args) {
   Scanner scanner  = new Scanner(System.in);
   //System.out.println("Enter Number of times this program has to run");
   int num = scanner.nextInt();
   while(num>0){
     int cycle = scanner.nextInt();
     System.out.println(calUtopianTree(cycle));
     num--;
   }
   scanner.close();
  }
  
  public static int utopianTreeCycle(int cycle,int growth){

    if(cycle%2==0){
      return growth+1;
    }else{
      return growth*2;
    }
  }
  
  public static int calUtopianTree(int cycle){
    int height = 0,i=0;
    while(i<=cycle){
      height = utopianTreeCycle(i,height);
      i++;
    }
    return height;
  }
}
