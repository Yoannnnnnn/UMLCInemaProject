package fr.efrei.domain;

public class Child {
    private int price=20;
    private Child(Child.Builder builder){
        this.price=builder.price;
    }

    private Child(){}
    public int getAge() {
        return price;
    }

    @Override
    public String toString() {
        return "Child{" +
                "price=" + price +
                '}';
    }

    public static class Builder{
        private int price=20;

        public Builder(int price) {
            this.price = price;
        }

        public Child.Builder setAge(Child.Builder builder) {
            this.price = builder.price;
            return this;
        }
        public Child build(){
            return new Child(this);
        }
    }

}
