package fr.efrei.domain;

public class Person {
    private int age;
    private Person(Builder builder){
        this.age=builder.age;
    }

    private Person(Builder builder){}

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + '}';
    }

    public static class Builder{
        private int age;

        public Builder(int age) {
            this.age = age;
        }

        public Builder() {
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }

}

