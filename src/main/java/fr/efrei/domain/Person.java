package fr.efrei.domain;

public class Person {
    private int age;
    private Person(PersonBuilder builder){
        this.age=builder.age;
    }

    private Person(){}
    public int getAge() {
        return age;
    }

    public static class PersonBuilder{
        private int age;

        public PersonBuilder(int age) {
            this.age = age;
        }

        public PersonBuilder setAge(PersonBuilder builder) {
            this.age = builder.age;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }

}
