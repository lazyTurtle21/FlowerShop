package containers;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Storage {
    List<Basket> baskets;
    List<Bouquet> bouquets;

    public Storage() {
        baskets = new LinkedList<>();
        bouquets = new LinkedList<>();
    }

    public void addData() {
        Random random = new Random();
        int basketsCount = random.nextInt(4) + 1;
        for (int i = 0; i < basketsCount; i++) {
            baskets.add(Basket.getRandomBasket());
        }
        Default_bouquets defaultik = new Default_bouquets();
        defaultik.formBouquets();
        bouquets.add(defaultik.firstType);
        bouquets.add(defaultik.secondType);
        bouquets.add(defaultik.thirdType);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "baskets=" + baskets +
                ", bouquets=" + bouquets +
                '}';
    }
}
