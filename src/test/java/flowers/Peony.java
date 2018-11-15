package flowers;

import base.Color;
import base.Smell;

public class Peony extends Flower {

    public Peony(Color color, Smell smell, String country, float price, int length) {
        super(color, smell, country, price, length);
    }

    public static Peony getRandomPeony() {
        return new Peony(Flower.getRandomColor(), Flower.getRandomSmell(), Flower.getRandomCountry(),
                Flower.getRandomPrice(), Flower.getRandomLength());
    }

    @Override
    public String toString() {
        return "Peony{" +
                "color=" + color +
                ", smell=" + smell +
                ", country=" + country +
                ", price=" + price +
                ", length=" + length +
                '}';
    }
}