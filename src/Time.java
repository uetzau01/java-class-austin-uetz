// file Time.java
public class Time {
    final int MAX_HOURS = 23;
    final int MAX_MIN_SECS = 59;

    int hour;    // current hour in military time
    int minute;  // current minute in military time
	int second;  // current second in military time

	// set the time to the time specified by the parameters
	void setTime (int newHour, int newMinute, int newSecond) {
		hour = newHour;
		minute = newMinute;
		second = newSecond;
	}

	// return the time to the calling method in a three-membered array
	int[] getTime() {
		return new int[] {hour, minute, second};
	}

	// increment the current time by one second
	void incrementTime() {
		++second;
	}
}


