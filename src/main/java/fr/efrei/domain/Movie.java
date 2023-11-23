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
    private Movie (MovieBuilder builder){
        this.age_restriction = builder.age_restriction;
        this.duration = builder.duration;
        this.schedule = builder.schedule;
        this.title = builder.title;
    }

    public static class MovieBuilder{
        private String title;
        private int age_restriction;
        private int duration;
        private int schedule;

        public MovieBuilder(String title, int age_restriction, int duration, int schedule) {
            this.title = title;
            this.age_restriction = age_restriction;
            this.duration = duration;
            this.schedule = schedule;
        }

        public MovieBuilder setTitle(MovieBuilder builder) {
            this.title = builder.title;
            return this;
        }

        public MovieBuilder setAge_restriction(MovieBuilder builder) {
            this.age_restriction = builder.age_restriction;
            return this;
        }

        public MovieBuilder setDuration(MovieBuilder builder) {
            this.duration = builder.duration;
            return this;
        }

        public MovieBuilder setSchedule(MovieBuilder builder) {
            this.schedule = builder.schedule;
            return this;
        }

        public Movie build(){
            return new Movie (this);
        }
    }
}