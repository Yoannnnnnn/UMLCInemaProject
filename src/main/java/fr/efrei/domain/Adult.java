package fr.efrei.domain;

public class Adult extends Person {
    private int price ;

    private Adult(Builder builder) {
        this.price = builder.price;
    }

    // Getter method should be named getPrice
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Adult{" +
                "price=" + price +
                '}';
    }

    public static class Builder {
        private int price = 20;

        public Builder(int price) {
            this.price = price;
        }

        // Change the method name to something like setPrice
        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Adult build() {
            return new Adult(this);
        }
    }
}