package flowers;

import base.Color;
import base.Smell;

public class Tulip extends Flower {

    public Tulip(Color color, Smell smell, String country, float price, int length) {
        super(color, smell, country, price, length);
    }

    public static Tulip getRandomTulip() {
        return new Tulip(Flower.getRandomColor(), Flower.getRandomSmell(), Flower.getRandomCountry(),
                Flower.getRandomPrice(), Flower.getRandomLength());
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "color=" + color +
                ", smell=" + smell +
                ", country=" + country +
                ", price=" + price +
                ", length=" + length +
                '}';
    }
}