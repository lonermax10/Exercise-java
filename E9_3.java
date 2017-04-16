import java.util.Date;

public class E9_3 {
	public static void main(String[] args) {
		Date date = new Date();
		
		int count = 1;
		long time = 10000;
		
		while (count < 10){
			date.setTime(time);   //设置一个新的流逝时间。
			System.out.println(date.toString());  //toString 返回一个代表日期和时间的字符串表示。
			count++;
			time *=10;
		}
	}

}
