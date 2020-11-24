package cn.edu.scau.sec.chenyonghuang.adapter;

import java.util.Calendar;
public class Adaptee {
	
	public void printCalendar(Calendar calendar) {
		System.out.println(calendar.get(Calendar.YEAR) + "Äê" + (calendar.get(Calendar.MONTH)+1) + "ÔÂ" + calendar.get(Calendar.DATE) + "ÈÕ");
		
	}
}
