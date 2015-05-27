package com.dh1;

import java.util.*;

public class Demo3 {

	public static void main(String[] args) {
	      Formatter fmt = new Formatter();
	      Calendar cal = Calendar.getInstance();
	      fmt = new Formatter();
	      fmt.format("%tl:%tM", cal, cal);
	      System.out.println(fmt);

	}

}
