package containers;

import java.util.LinkedList;

import base.Smell;
import flowers.*;
import base.Color;
import java.util.List;

/*
Stores same flowers
 */
public class Basket extends Container {

    public Basket() {
        super();
    }

    public Basket(List<Flower> initialFlowers) {
        super(initialFlowers);
    }

    public static Basket getRandomBasket() {
        int flowerType = Container.random.nextInt(3);
        int count = (Container.random.nextInt(2) + 1) * 10;

        Color color = Flower.getRandomColor();
        int length = Flower.getRandomLength();
        float price = Flower.getRandomPrice();
        Smell smell = Flower.getRandomSmell();
        String country = Flower.getRandomCountry();
        List<Flower> flowers = new LinkedList<>();
        for(int i = 0; i < count; i++) {
            switch (flowerType) {
                case 0: flowers.add(new Rose(color, smell, country, price, length)); break;
                case 1: flowers.add(new Chamomile(color, smell, country, price, length)); break;
                case 2: flowers.add(new Tulip(color, smell, country, price, length)); break;
            }
        }
        return new Basket(flowers);
    }

    public Flower getRandomFlower(){
        int index = Container.random.nextInt(flowers.size());
        Flower flower = flowers.get(index);
        flowers.remove(flower);
        return flower;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "flowers=" + flowers +
                ", size=" + size +
                '}';
    }
}
