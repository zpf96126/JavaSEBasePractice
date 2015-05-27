package com.dh1;

import java.text.*;
import java.util.*;

public class demo1 {

	public static void main(String[] args) {
	      Date date = new Date();
	      String strDateFormat = "HH:mm:ss a";
	      SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
	      System.out.println(sdf.format(date));

	}

}
