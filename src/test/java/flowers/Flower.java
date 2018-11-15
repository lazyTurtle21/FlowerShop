package flowers;

import base.Color;
import base.Smell;

import lombok.*;
import java.util.Random;


@Getter
@Setter
public abstract class Flower {
    protected Color color;
    protected Smell smell;
    protected float price;
    protected int length;
    protected String country;
    protected boolean spikes = false;
    private boolean available;

    protected static Random random = new Random();

    public Flower(Color color, Smell smell, String country, float price, int length) {
        this.color = color;
        this.country = country;
        this.smell = smell;
        this.price = price;
        this.length = length;
        this.available = true;
    }

    public static Color getRandomColor() {
        switch (random.nextInt(3)) {
            case 0: return Color.RED;
            case 1: return Color.GREEN;
            case 2: return Color.BLUE;
        }
        return Color.RED;
    }
    public static Smell getRandomSmell() {
        switch (random.nextInt(3)) {
            case 0: return Smell.ROSY;
            case 1: return Smell.FLORAL;
            case 2: return Smell.FRESH;
        }
        return Smell.FRESH;
    }
    public static String getRandomCountry() {
        switch (random.nextInt(5)) {
            case 0: return "USA";
            case 1: return "UK";
            case 2: return "Netherlands";
            case 3: return "France";
            case 4: return "Italy";
        }
        return "Russia";
    }

    public static float getRandomPrice() {
        return 3 + random.nextFloat() * 10;
    }

    public static int getRandomLength() {
        return (4 + random.nextInt(5)) * 10;
    }

    public void go_off(){this.available = false;}

}
