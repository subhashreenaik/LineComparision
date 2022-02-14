/**
 * 
 */
package com.bridgelabz.assignment;

import java.util.Scanner;

/**
 * @author subhashree
 *
 */
public class LineComparision {
	
	//This method computes the length of the line
	static void calculateLengthLine(double x1,double x2,double y1,double y2) {
 	 double length_of_line=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
	 System.out.println("Length of the line is  :"+length_of_line);
 	 
  }
	
  public static void main(String[] args) {
	 
	   //Taking inputs from system
		Scanner scan= new Scanner(System.in);
	    System.out.println("enter points of first line and second line");
	       
	       double x1=scan.nextDouble();
	       double y1=scan.nextDouble();
	       double x2=scan.nextDouble();
	       double y2=scan.nextDouble();
	       
	       //calling the method
	       calculateLengthLine(x1,x2,y1,y2);
	       
	    scan.close();
	       
 }

}
