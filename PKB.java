package course;

import java.util.Scanner;

public class PKB {

	 public static void showMin( int [] pkb) {
		    int min = pkb[0];
		    for (int i = 1; i < pkb.length; i++) {
		      if (pkb[i] < min)
		        min = pkb[i];
		    }
		    System.out.println("Lowest value: " + min);
		  }
		   
		  public static void showMax( int [] pkb) {
		    int max = 0;
		    for (int i = 1; i < pkb.length; i++) {
		      if (pkb[i] > max)
		        max = pkb[i];
		    }
		    System.out.println("Highest value: " + max);
		  }
		   
		  public static void showOne(int [] pkb) {
		    Scanner read = null;
		    try {
		      read = new Scanner(System.in);
		      int year;
		      do {
		        System.out.print("Select year: 200");
		        year = read.nextInt();
		      } while (year > 9);
		       
		      if (year <= 9) {
		        System.out.println("200" + year + ": " + pkb[year]);
		      }
		      else {
		        System.out.println("Wrong value");
		      }
		    }
		    finally {
		      if (read != null) read.close();
		    }
		  }
		   
		  public static void showAll(int [] pkb) {
		    for (int i = 9; i < pkb.length && i >= 0; i--) {
		      System.out.println("200" + i + ": " + pkb[i]);
		    }
		  }
		   
		   public static void showAverage(int[] pkb) {
			   
			   int ave = (19527 + 20391 + 21203 + 22148 + 24438 + 25955 + 28056 + 31158 + 33741 + 35966) / 10;
			   
			   System.out.println("Average value: " + ave);
			   
		   }
		  public static void main(String[] args) {
		     
		    int pkb [] = {19527, 20391, 21203, 22148, 24438, 25955, 28056, 31158, 33741, 35966};
		     
		    showAll(pkb);
		    showOne(pkb);
		    showMax(pkb);
		    showMin(pkb);
		    showAverage(pkb);
		     
	}
}
	
		 
		 
	
