package flowers;

import base.Color;
import base.Smell;

public class Chamomile extends Flower {

    public Chamomile(Color color, Smell smell, String country, float price, int length) {
        super(color, smell, country, price, length);
    }

    public static Chamomile getRandomChamomile() {
        return new Chamomile(Flower.getRandomColor(), Flower.getRandomSmell(), Flower.getRandomCountry(),
                Flower.getRandomPrice(), Flower.getRandomLength());
    }

    @Override
    public String toString() {
        return "Chamomile{" +
                "color=" + color +
                ", smell=" + smell +
                ", country=" + country +
                ", price=" + price +
                ", length=" + length +
                '}';
    }
}