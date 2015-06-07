package com.dh.zpf;
/*
import java.util.ArrayList;
import java.util.Vector;

public class Main {

public static void main(String[] args) {
   Object testObject = new ArrayList();
      displayObjectClass(testObject);
   }
   public static void displayObjectClass(Object o) {
      if (o instanceof Vector)
      System.out.println("Object was an instance of the class java.util.Vector");
      else if (o instanceof ArrayList)
      System.out.println("Object was an instance of the class java.util.ArrayList");
      else
      System.out.println("Object was an instance of the " + o.getClass());
   }
}

public class Main {
	   public static void main(String[] args) {
	      int[] intary = { 99,12,22,34,45,67,5678,8990 };
	      int no = 5678;
	      int i = 0;
	      boolean found = false;
	      for ( ; i < intary.length; i++) {
	         if (intary[i] == no) {
	            found = true;
	            break;
	         }
	      }
	      if (found) {
	         System.out.println("Found the no: " + no + " at  index: " + i);
	      } 
	      else {
	         System.out.println(no + "not found  in the array");
	      }
	   }//显示序号
	   
	}

public class Main {
	   public static void main(String[] args) {
	      StringBuffer searchstr = new StringBuffer(
	      "hello how are you. ");
	      int length = searchstr.length();
	      int count = 0;
	      for (int i = 0; i 7lt; length; i++) {//？？？报错不懂
	         if (searchstr.charAt(i) != 'h')
	         continue;
	         count++;
	         searchstr.setCharAt(i, 'h');
	      }
	      System.out.println("Found " + count 
	      + " h's in the string.");
	      System.out.println(searchstr);
	   }
	}

public class Main {
	   public static void main(String[] args) {
	      String strSearch = "This is the string in which you have to search for a substring.";
	      String substring = "substring";
	      boolean found = false;
	      int max = strSearch.length() - substring.length();
	      testlbl:
	      for (int i = 0; i <= max; i++) {
	         int length = substring.length();
	         int j = i;
	         int k = 0;
	         while (length-- != 0) {
	            if(strSearch.charAt(j++) != substring.charAt(k++)){
	               continue testlbl;
	            }
	         }
	         found = true;
	         break testlbl;
	      }
	      if (found) {
	         System.out.println("Found the substring .");
	      }
	      else {
	         System.out.println("did not find the substing in the string.");
	      }
	   }
	}

enum Car {
	   lamborghini,tata,audi,fiat,honda
	}
	public class Main {
	   public static void main(String args[]){
	      Car c;
	      c = Car.tata;
	      switch(c) {
	         case lamborghini:
	         System.out.println("You choose lamborghini!");
	         break;
	         case tata:
	         System.out.println("You choose tata!");
	         break;
	         case audi:
	         System.out.println("You choose audi!");
	         break;
	         case fiat:
	         System.out.println("You choose fiat!");
	         break;
	         case honda:
	         System.out.println("You choose honda!");
	         break;
	         default:
	         System.out.println("I don't know your car.");
	         break;
	      }
	   }//枚举数组
	}

enum Car {
	   lamborghini(900),tata(2),audi(50),fiat(15),honda(12);
	   private int price;
	   Car(int p) {
	      price = p;
	   }
	   int getPrice() {
	      return price;
	   } 
	}
	public class Main {
	   public static void main(String args[]){
	      System.out.println("All car prices:");
	      for (Car c : Car.values())
	      System.out.println(c + " costs " + c.getPrice() + " thousand dollars.");
	   }
	}

public class Main {
	   public static void main(String[] args) {
	      int[] intary = { 1,2,3,4};
	      forDisplay(intary);
	      foreachDisplay(intary);
	   }
	   public static void forDisplay(int[] a){  
	      System.out.println("Display an array using for loop");
	      for (int i = 0; i < a.length; i++) {
	         System.out.print(a[i] + " ");
	      }
	      System.out.println();
	   }
	   public static void foreachDisplay(int[] data){
	      System.out.println("Display an array using for each loop");
	      for (int a  : data) {
	         System.out.print(a+ " ");
	      }
	   }
	}//两种输出
	
public class Main {
	   static int  sumvarargs(int... intArrays){
	      int sum, i;
	      sum=0;
	      for(i=0; i< intArrays.length; i++) {
	         sum += intArrays[i];
	      }
	      return(sum);
	   }
	   public static void main(String args[]){
	      int sum=0;
	      sum = sumvarargs(new int[]{10,12,33});
	      System.out.println("The sum of the numbers is: " + sum);
	   }
	}//数组输入
*/
public class Main {
	   static void vaTest(int ... no) {
	      System.out.print("vaTest(int ...): " 
	      + "Number of args: " + no.length +" Contents: ");
	      for(int n : no)
	      System.out.print(n + " ");
	      System.out.println();
	   }
	   static void vaTest(boolean ... bl) {
	      System.out.print("vaTest(boolean ...) " +
	      "Number of args: " + bl.length + " Contents: ");
	      for(boolean b : bl)
	      System.out.print(b + " ");
	      System.out.println();
	   }
	   static void vaTest(String msg, int ... no) {
	      System.out.print("vaTest(String, int ...): " +
	      msg +"no. of arguments: "+ no.length +" Contents: ");
	      for(int  n : no)
	      System.out.print(n + " ");
	      System.out.println();
	   }
	   public static void main(String args[]){
	      vaTest(1, 2, 3);
	      vaTest("Testing: ", 10, 20);
	      vaTest(true, false, false);
	   }
	}