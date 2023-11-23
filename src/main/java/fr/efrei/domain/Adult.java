package fr.efrei.domain;

public class Adult  {
    private int price=20;
    private Adult(AdultBuilder builder){
        this.price=builder.price;
    }

    private Adult(){}
    public int getAge() {
        return price;
    }

    @Override
    public String toString() {
        return "Adult{" +
                "price=" + price +
                '}';
    }

    public static class AdultBuilder{
        private int price=20;

        public AdultBuilder(int price) {
            this.price = price;
        }

        public AdultBuilder setAge(AdultBuilder builder) {
            this.price = builder.price;
            return this;
        }
        public Adult build(){
            return new Adult(this);
        }
    }

}
