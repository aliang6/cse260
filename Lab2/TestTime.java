import java.util.Scanner;

public class TestTime{
	public static void main(String[] args){
		Time now = new Time();
		System.out.println("Hour: " + now.getHour() + " Minute: " + now.getMinute() + " Second: " + now.getSecond());
		Time time = new Time(555550000);
		System.out.println("Hour: " + time.getHour() + " Minute: " + time.getMinute() + " Second: " + time.getSecond());

	}
	
}