package instance;

public non-sealed class BRLClock extends Clock {

    @Override
    public Clock convert(final Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock.getClass().getSimpleName()) {
            case "USClock":
                USClock usClock = (USClock) clock;
                this.hour = (usClock.getPeriodIndicator().equals("PM")) ? usClock.getHour() + 12 : usClock.getHour();
                break;
            case "BRLClock":
                this.hour = ((BRLClock) clock).getHour();
                break;
        }
        return this;
    }

}
