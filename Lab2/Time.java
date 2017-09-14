import java.util.Calendar;

public class Time{
	private int hour, minute, second;

	public Time(){
		Calendar cal = Calendar.getInstance();
		hour = cal.get(Calendar.HOUR_OF_DAY);
		minute = cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
	}

	public Time(long elapseTime){
		setTime(elapseTime);
	}

	public Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour(){
		return hour;
	}

	public int getMinute(){
		return minute;
	}

	public int getSecond(){
		return second;
	}

	public void setTime(long elapseTime){
		elapseTime /= 1000;
		second = (int)(elapseTime % 60);
		elapseTime /= 60;
		minute = (int)(elapseTime % 60);
		elapseTime /= 60;
		hour = (int)(elapseTime % 24);
	}
}