package fr.efrei.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movie {
    private String title;
    private int age_restriction;
    private int runningTime;
    private String releaseDate;
    private int ticketPrice2D;
    private int ticketPrice3D;
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

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getTicketPrice2D() {
        return ticketPrice2D;
    }

    public int getTicketPrice3D() {
        return ticketPrice3D;
    }

    public String getDescription() {
        return description;
    }

    private Movie (){

    }
    private Movie (Builder builder){
        this.age_restriction = builder.age_restriction;
        this.runningTime = builder.runningTime;
        this.releaseDate = builder.releaseDate;
        this.title = builder.title;
        this.ticketPrice2D = builder.ticketPrice2D;
        this.ticketPrice3D = builder.ticketPrice3D;
        this.description = builder.description;
    }

    public static class Builder{
        private String title;
        private int age_restriction;
        private int runningTime;
        private String releaseDate;
        private int ticketPrice2D;
        private int ticketPrice3D;
        private String description;


        public Builder(String title, int age_restriction, int runningTime, String releaseDate, int ticketPrice2D, int ticketPrice3D, String description) {
            this.title = title;
            this.age_restriction = age_restriction;
            this.runningTime = runningTime;
            this.releaseDate = releaseDate;
            this.ticketPrice2D = ticketPrice2D;
            this.ticketPrice3D = ticketPrice3D;
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

        public Builder setReleaseDate(String releaseDate) {
            this.releaseDate = String.valueOf(LocalDate.parse(releaseDate, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            return this;
        }

        public Builder setTicketPrice2D(int ticketPrice2D) {
            this.ticketPrice2D = ticketPrice2D;
            return this;
        }
        public Builder setTicketPrice3D(int ticketPrice3D) {
            this.ticketPrice3D = ticketPrice3D;
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