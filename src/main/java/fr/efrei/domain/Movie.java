package fr.efrei.domain;

public class Movie {
    private String title;
    private int age_restriction;
    private int runningTime;
    private int scheduled;
    private int ticketPrice;
    private String description;


    public String getTitle() {
        return title;
    }

    public int getAge_restriction() {
        return age_restriction;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public int getScheduled() {
        return scheduled;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public String getDescription() {
        return description;
    }

    private Movie (){

    }
    private Movie (Builder builder){
        this.age_restriction = builder.age_restriction;
        this.runningTime = builder.runningTime;
        this.scheduled = builder.scheduled;
        this.title = builder.title;
        this.ticketPrice = builder.ticketPrice;
        this.description = builder.description;
    }

    public static class Builder{
        private String title;
        private int age_restriction;
        private int runningTime;
        private int scheduled;
        private int ticketPrice;
        private String description;


        public Builder(String title, int age_restriction, int runningTime, int scheduled, int ticketPrice, String description) {
            this.title = title;
            this.age_restriction = age_restriction;
            this.runningTime = runningTime;
            this.scheduled = scheduled;
            this.ticketPrice = ticketPrice;
            this.description = description;
        }

        public Builder(){

        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAge_restriction(int age_restriction) {
            this.age_restriction = age_restriction;
            return this;
        }

        public Builder setRunningTime(int runningTime) {
            this.runningTime = runningTime;
            return this;
        }

        public Builder setSchedule(int scheduled) {
            this.scheduled = scheduled;
            return this;
        }

        public Builder setTicketPrice(int ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Movie build(){
            return new Movie (this);
        }
    }
}