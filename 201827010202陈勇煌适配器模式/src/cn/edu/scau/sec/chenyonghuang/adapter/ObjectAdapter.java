package cn.edu.scau.sec.chenyonghuang.adapter;
import java.util.Calendar;

public class ObjectAdapter implements Target{
	
	
	public void printDate(String calendarString) {
		String[] calendarStrings = calendarString.split("\\.");
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, Integer.parseInt(calendarStrings[0]));
		calendar.set(Calendar.MONTH, Integer.parseInt(calendarStrings[1])-1);
		calendar.set(Calendar.DATE, Integer.parseInt(calendarStrings[2]));
		Adaptee adaptee = new Adaptee();
		adaptee.printCalendar(calendar);
	}
}
