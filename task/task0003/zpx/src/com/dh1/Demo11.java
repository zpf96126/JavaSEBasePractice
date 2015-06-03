package com.dh1;

import java.text.DateFormat;
import java.util.*;

public class Demo11 {

	public static void main(String[] args) {
	      Date d1 = new Date();
	      System.out.println("today is "+ d1.toString());    
	      Locale locItalian = new Locale("it","ch");
	      DateFormat df = DateFormat.getDateInstance
	      (DateFormat.FULL, locItalian);
	      System.out.println("today is in Italian Language in Switzerland Format : "+ df.format(d1));
	}

}
