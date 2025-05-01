package instance;

public class Menu {
    public static void main(String[] args) {
        Clock brlclock = new BRLClock();
        brlclock.setHour(13);
        brlclock.setMinute(0);
        brlclock.setSecond(0);

        System.out.println(brlclock.getTime());

        System.out.println(new USClock().convert(brlclock).getTime());
    }
}
