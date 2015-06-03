package com.dh1;

import java.util.*;

public class Demo13 {

	public static void main(String[] args) {
	      Date d1 = new Date();
	      Calendar cl = Calendar. getInstance();
	      cl.setTime(d1);
	      System.out.println("today is "+ d1.toString());
	      cl. roll(Calendar.MONTH, 100);
	      System.out.println("date after a month will be " 
		  + cl.getTime().toString() );
	      cl. roll(Calendar.HOUR, 70);
	      /*System.out.println("date after 7 hrs will be "
	      + cl.getTime().toString() );*/
	      //the code beyond has falut
	      System.out.println("date after 70 hrs will be "
	      + cl.getTime().toString() );

	}

}
