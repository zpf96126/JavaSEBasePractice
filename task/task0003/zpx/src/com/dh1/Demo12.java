package com.dh1;

import java.text.DateFormat;
import java.util.*;

public class Demo12 {

	public static void main(String[] args)throws Exception {
	      Date d1 = new Date();
	      System.out.println("today is "+ d1.toString()); 
	      Locale locItalian = new Locale("it");
	      DateFormat df = DateFormat.getDateInstance
	      (DateFormat.FULL, locItalian);
	      System.out.println("today is "+ df.format(d1));

	}

}
