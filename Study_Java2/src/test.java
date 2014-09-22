public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t=new Time(8,30,33);
		t.setHour(25);
		System.out.print(t.toString());
	}
}
////1111111111111111111111111111
class Time
{
	private int hour;
	private int minute;
	private int second;
	
	Time(int hour,int minute,int second)
	{
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public int getHour()
	{
		return hour;
	}
	public int getMinute()
	{
		return minute;
	}
	public int getSecond()
	{
		return second;
	}
	public void setHour(int hour)
	{
		if(hour<0 || hour>23)
			return;
		this.hour=hour;
	}
	public void setMinute(int minute)
	{
		if(minute<0 || minute>59)
			return;
		this.minute=minute;
	}
	public void setSecond(int second)
	{
		if(second<0 || second>59)
			return;
		this.second=second;
	}
	public String toString()
	{
		return hour+":"+minute+":"+second;
	}
}