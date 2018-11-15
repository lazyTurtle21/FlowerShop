package containers;

import flowers.*;


public class Default_bouquets {
    public String description = "Bouquet 1: 10 peonies + 10 roses\nBouquet 2: 20 chamomiles + 10 tulips" +
                "\nBouquet 3: 10 peonies + 10 roses + 10 peonies + 10 chamomiles";

    public Bouquet firstType = new Bouquet();
    public Bouquet secondType = new Bouquet();
    public Bouquet thirdType = new Bouquet();

    public void formBouquets() {
        Peony peony = new Peony(Flower.getRandomColor(), Flower.getRandomSmell(),
                Flower.getRandomCountry(), Flower.getRandomPrice(), Flower.getRandomLength());
        Tulip tulip = new Tulip(Flower.getRandomColor(), Flower.getRandomSmell(),
                Flower.getRandomCountry(), Flower.getRandomPrice(), Flower.getRandomLength());
        Chamomile chamomile = new Chamomile(Flower.getRandomColor(), Flower.getRandomSmell(),
                Flower.getRandomCountry(), Flower.getRandomPrice(), Flower.getRandomLength());
        Rose rose = new Rose(Flower.getRandomColor(), Flower.getRandomSmell(),
                Flower.getRandomCountry(), Flower.getRandomPrice(), Flower.getRandomLength());

        for (int i = 0; i < 10; i++) {
            secondType.addFlower(chamomile);
        }
        for (int i = 0; i < 10; i++) {
            firstType.addFlower(peony); firstType.addFlower(rose);
            secondType.addFlower(chamomile);secondType.addFlower(tulip);
            thirdType.addFlower(peony);thirdType.addFlower(rose);
            thirdType.addFlower(chamomile);thirdType.addFlower(tulip);
        }
    }
}
