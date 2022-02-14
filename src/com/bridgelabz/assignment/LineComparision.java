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
	static double calculateLengthLine(double x1,double x2,double y1,double y2) {
 	 double length_of_line=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
	 return length_of_line;
	 
 	 
  }
	
  public static void main(String[] args) {
	 
	   //Taking inputs from system
		Scanner scan= new Scanner(System.in);
	    System.out.println("enter points of first line and second line");
	       
	       double x1=scan.nextDouble();
	       double y1=scan.nextDouble();
	       double x2=scan.nextDouble();
	       double y2=scan.nextDouble();
	       
	     System.out.println("enter points of second line and second line");
	     
	       double x3=scan.nextDouble();
	       double y3=scan.nextDouble();
	       double x4=scan.nextDouble();
	       double y4=scan.nextDouble();
	       
	       //calling the method
	       double length1 = calculateLengthLine(x1,x2,y1,y2);
	       double length2 = calculateLengthLine(x3,x4,y3,y4);
	       
	       //check equality
	       if(length1 == length2) {
	    	   System.out.println("Two line are equal");
	       }
	       else if(length1>length2){
        	   System.out.println("length of line1 is greater than line2");
           }
	       else {
	    	   System.out.println("length of line2 is greater than line1");
	       }
	       
	    scan.close();
	       
 }

}
