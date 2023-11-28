package fr.efrei.domain;

public class Movie {
    private String title;
    private int age_restriction;
    private int duration;
    private int schedule;


    public String getTitle() {
        return title;
    }

    public int getAge_restriction() {
        return age_restriction;
    }

    public int getDuration() {
        return duration;
    }

    public int getSchedule() {
        return schedule;
    }

    private Movie (){

    }
    private Movie (Builder builder){
        this.age_restriction = builder.age_restriction;
        this.duration = builder.duration;
        this.schedule = builder.schedule;
        this.title = builder.title;
    }

    public static class Builder{
        private String title;
        private int age_restriction;
        private int duration;
        private int schedule;

        public Builder(String title, int age_restriction, int duration, int schedule) {
            this.title = title;
            this.age_restriction = age_restriction;
            this.duration = duration;
            this.schedule = schedule;
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

        public Builder setDuration(int duration) {
            this.duration = duration;
            return this;
        }

        public Builder setSchedule(int schedule) {
            this.schedule = schedule;
            return this;
        }

        public Movie build(){
            return new Movie (this);
        }
    }
}