package instance;

public non-sealed class USClock extends Clock {

    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAM() {
        this.periodIndicator = "AM";
    }

    public void setPM() {
        this.periodIndicator = "PM";
    }

    @Override
    public Clock convert(final Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock.getClass().getSimpleName()) {
            case "USClock":
                this.hour = ((USClock) clock).getHour();
                this.periodIndicator = ((USClock) clock).getPeriodIndicator();
                break;
            case "BRLClock":
                BRLClock brlClock = (BRLClock) clock;
                this.setHour(brlClock.getHour());
                break;
        }
        return this;
    }
    
    public void setHour(int hour) {
        setAM();
        if(hour > 12 && hour <= 23) {
            this.hour = hour - 12;
            setPM();
        } else if(hour >= 24) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + getPeriodIndicator();
    }
}
