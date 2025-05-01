package instance;

public sealed abstract class Clock permits BRLClock, USClock {
    protected int hour;
    protected int minute;
    protected int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 24) {
            this.hour = 24;
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute >= 24) {
            this.minute = 60;
            return;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int seconds) {
        if(seconds >= 24) {
            this.second = 60;
            return;
        }
        this.second = seconds;
    }

    private String format(int value) {
        return value < 9 ? "0" + value : String.valueOf(value);
    }

    public String getTime() {
        return format(hour) + ":" + format(minute) + ":" + format(second);
    }

    abstract Clock convert(Clock clock);
}
