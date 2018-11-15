package containers;

import base.Color;
import base.Smell;
import flowers.*;

import java.util.LinkedList;
import java.util.List;

public class Bouquet extends Container {

    public Bouquet() {
        super();
    }

    public Bouquet(List<Flower> initialFlowers) {
        super(initialFlowers);
    }

    public static Bouquet getRandomBouquet() {
        int count = (Container.random.nextInt(2) + 1) * 10 + 1;

        List<Flower> flowers = new LinkedList<>();
        for(int i = 0; i < count; i++) {
            int flowerType = Container.random.nextInt(3);
            Color color = Flower.getRandomColor();
            int length = Flower.getRandomLength();
            float price = Flower.getRandomPrice();
            Smell smell = Flower.getRandomSmell();
            String country = Flower.getRandomCountry();

            switch (flowerType) {
                case 0: flowers.add(new Rose(color, smell, country, price, length)); break;
                case 1: flowers.add(new Chamomile(color, smell, country, price, length)); break;
                case 2: flowers.add(new Tulip(color, smell, country, price, length)); break;
            }
        }

        return new Bouquet(flowers);
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                ", size=" + size +
                '}';
    }
}
