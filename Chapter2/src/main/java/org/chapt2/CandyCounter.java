package org.chapt2;

public class CandyCounter {
 static long addCandy(double fruit, float vegetables) {
 return (long) ((int)fruit+vegetables);
 }
 public static void main(String[] args) {
// System.out.print(addCandy(1.4, 2.4f) + ", ");
//  System.out.print(addCandy(1.9, (float)4) + ", ");
//  System.out.print(addCandy((long)(int)(short)2, (float)4));

 int a = 2, b = 4, c = 2;
 System.out.println(a > 2 ? --c : b++);
 System.out.println(b = (a!=c ? a : b++));
 System.out.println(a > b ? b < c ? b : 2 : 1);}}