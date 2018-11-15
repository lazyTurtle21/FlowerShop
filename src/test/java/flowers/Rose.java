package flowers;

import base.Color;
import base.Smell;

public class Rose extends Flower {

    public Rose(Color color, Smell smell, String country, float price, int length) {
        super(color, smell, country, price, length);
        this.spikes = true;
    }

    public static Rose getRandomRose() {
        return new Rose(Flower.getRandomColor(), Flower.getRandomSmell(), Flower.getRandomCountry(),
                    Flower.getRandomPrice(), Flower.getRandomLength());
    }

    @Override
    public String toString() {
        return "Rose{" +
                "color=" + color +
                ", smell=" + smell +
                ", country=" + country +
                ", price=" + price +
                ", length=" + length +
                ", has spikes"+
                '}';
    }
}