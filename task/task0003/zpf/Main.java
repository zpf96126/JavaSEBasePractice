package com.dh.zpf;
import java.util.*;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormatSymbols;
import java.text.DateFormat;
/*
public class Main{
   public static void main(String[] args){
      Date date = new Date();
      String strDateFormat = "HH:mm:ss a";
      SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
      System.out.println(sdf.format(date));
   }
}

public class Main {
	   public static void main(String[] args) {
	      Date date = new Date();
	      SimpleDateFormat sdf = new SimpleDateFormat("h");
	      System.out.println("hour in h format : "+ sdf.format(date));
	   }
	}//显示整点

public class Main{
	   public static void main(String[] args){
	      Date date = new Date();
	      SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
	      System.out.println("Current Month in MMMM format : "
	      + sdf.format(date));
	   }
	}//显示月份

public class Main{
	   public static void main(String[] args){
	      Date date = new Date();
	      SimpleDateFormat sdf = new SimpleDateFormat("ss");
	      System.out.println("seconds in ss format : "
	      + sdf.format(date));
	   }//显示秒
	}
	
public class Main {
	   public static void main(String[] args) {
	      String[] shortMonths = new DateFormatSymbols()
	      .getShortMonths();
	      for (int i = 0; i < (shortMonths.length-1); i++) {
	         String shortMonth = shortMonths[i];
	         System.out.println("shortMonth = " + shortMonth);
	      }
	   }//显示月份缩写
	}
	
public class Main {
	   public static void main(String[] args) {
	      String[] weekdays = new DateFormatSymbols().getWeekdays();
	      for (int i = 2; i < (weekdays.length-1); i++) {
	         String weekday = weekdays[i];
	         System.out.println("weekday = " + weekday);
	      }
	   }
	}//显示工作日

public class Main {
	   public static void main(String[] args) throws Exception {
	      Date d1 = new Date();
	      Calendar cl = Calendar. getInstance();
	      cl.setTime(d1);
	      System.out.println("today is " + d1.toString());cl. add(Calendar.MONTH, 1);
	      System.out.println("date after a month will be " + cl.getTime().toString() );cl. add(Calendar.HOUR, 70);
	      System.out.println("date after 7 hrs will be " + cl.getTime().toString() );cl. add(Calendar.YEAR, 3);
	      System.out.println("date after 3 years will be "  + cl.getTime().toString() );
	   }
	}//显示多久多久后的时间

public class Main {
	   public static void main(String[] args) throws Exception {
	      Date d1 = new Date();
	      System.out.println("today is "+ d1.toString());    
	      Locale locItalian = new Locale("it","ch");
	      DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItalian);
	      System.out.println("today is in Italian Language in Switzerland Format : "+ df.format(d1));
	   }
	}//显示其他地区的时间

public class Main {
	   public static void main(String[] args) throws Exception {
	      Date d1 = new Date();
	      System.out.println("today is "+ d1.toString()); 
	      Locale locItalian = new Locale("it");
	      DateFormat df = DateFormat.getDateInstance
	      (DateFormat.FULL, locItalian);
	      System.out.println("today is "+ df.format(d1));
	   }
	}//用其他语言显示时间

public class Main {
	   public static void main(String[] args) throws Exception {
	      Date d1 = new Date();
	      Calendar cl = Calendar. getInstance();
	      cl.setTime(d1);
	      System.out.println("today is "+ d1.toString());
	      cl. roll(Calendar.MONTH, 100);
	      System.out.println("date after a month will be " + cl.getTime().toString() );
	      cl. roll(Calendar.HOUR, 70);
	      System.out.println("date after 7 hrs will be "+ cl.getTime().toString() );
	   }
	}//显示一段时间后的时间

public class Main {
	   public static void main(String[] args) throws Exception {
	      Date d1 = new Date();
	      Calendar cl = Calendar. getInstance();
	      cl.setTime(d1);
	      System.out.println("today is " + cl.WEEK_OF_YEAR+ " week of the year");
	      System.out.println("today is a "+cl.DAY_OF_MONTH + "month of the year");
	      System.out.println("today is a "+cl.WEEK_OF_MONTH +"week of the month");
	   }
	}//显示第几周第几个月
*/
public class Main {
	   public static void main(String[] args) {
	      Date dt = new Date(1000000000000L);

	      DateFormat[] dtformat = new DateFormat[6];
	      dtformat[0] = DateFormat.getInstance();
	      dtformat[1] = DateFormat.getDateInstance();
	      dtformat[2] = DateFormat.getDateInstance(DateFormat.MEDIUM);
	      dtformat[3] = DateFormat.getDateInstance(DateFormat.FULL);
	      dtformat[4] = DateFormat.getDateInstance(DateFormat.LONG);
	      dtformat[5] = DateFormat.getDateInstance(DateFormat.SHORT);

	      for(DateFormat dateform : dtformat)
	         System.out.println(dateform.format(dt));
	  }
	}//用不同的方式显示时间