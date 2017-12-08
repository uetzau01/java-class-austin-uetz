


// file Main.java
public class Main {
	public static void main(String[] args) {
		Time currTime = new Time();  // object that stores the current time
		int hr;         // current hour obtained from currTime
		int min;        // current minute obtained from currTime
		int sec;        // current second obtained from currTime
		
		int[] temp;		// for using getTime()

		currTime.setTime(-55, 99, 1025);
		temp = currTime.getTime();
		hr = temp[0];
		min = temp[1];
		sec = temp[2];
		
		System.out.println(
				"The current military time is set to: "
						+ hr + ":" + min + ":" + sec
				);

		
		currTime.incrementTime();
		temp = currTime.getTime();
		hr = temp[0];
		min = temp[1];
		sec = temp[2];
		currTime.hour = 31;
		currTime.minute = -10;
		currTime.second = 450;
		
		temp = currTime.getTime();
		hr = temp[0];
		min = temp[1];
		sec = temp[2];
		
		System.out.println(
				"After direct assignment, the current military time is: "
						+ hr + ":" + min + ":" + sec
				);
		System.out.println(
				"After incrementing the time, the current military time is: "
						+ hr + ":" + min + ":" + sec
				);
	}
}