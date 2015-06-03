package com.dh1;

import java.util.*;

public class Demo4 {

	public static void main(String[] args) {
	      Formatter fmt = new Formatter();
	      Calendar cal = Calendar.getInstance();
	      fmt = new Formatter();
	      fmt.format("%tc", cal);
	      System.out.println(fmt);

	}

}
