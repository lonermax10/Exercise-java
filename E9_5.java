import java.util.GregorianCalendar;

public class E9_5 {
	public static void main(String[] args) {
		GregorianCalendar GC = new GregorianCalendar();
		
		System.out.println("日期是： " + GC.get(GregorianCalendar.YEAR) + " " + GC.get(GregorianCalendar.MONTH) + 
				" " + GC.get(GregorianCalendar.DAY_OF_MONTH));
		long Time = 1234567898765L;
		GC.setTimeInMillis(Time);
		System.out.println("日期是： " + GC.get(GregorianCalendar.YEAR) + " " + GC.get(GregorianCalendar.MONTH) + 
				" " + GC.get(GregorianCalendar.DAY_OF_MONTH));
		
	}

}
