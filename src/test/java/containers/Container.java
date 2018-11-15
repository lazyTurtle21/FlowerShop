package containers;

import flowers.Flower;

import lombok.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


@Getter
@Setter
public abstract class Container {

    protected List<Flower> flowers;
    protected int size;
    protected static Random random = new Random();

    public Container() {
        flowers = new LinkedList<>();size=0;
    }

    public Container(List<Flower> initialFlowers) {
        flowers = new LinkedList<>();
        size += flowers.size();
        flowers.addAll(initialFlowers);
    }

    public void addFlower(Flower flower) {
        flowers.add(flower); size += 1;
    }

    public boolean contains(Flower item){
        return flowers.contains(item);
    }

    public float getOveralPrice() {
        float sum = 0;
        for (Flower flower : flowers)
            sum += flower.getPrice();
        return sum;
    }
}
