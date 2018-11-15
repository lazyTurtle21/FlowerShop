import containers.Bouquet;
import containers.Default_bouquets;
import containers.Storage;
import flowers.*;

import java.util.Scanner;

public class Main {
    private static Bouquet getBouquet() {
        Bouquet userBouquet = new Bouquet();
        Scanner reader = new Scanner(System.in);
        System.out.println("Hi! Do you want to form your own bouquet\n    or choose" +
                " from default ones?\n1 - for first option, 2 - for the second one");
        int n;
        try {n = reader.nextInt();}
        catch (Exception e){
            System.out.println("Sorry, we can't help you");
            return userBouquet;
        }
        switch (n) {
            case 1: userBouquet = getUserBouquet(reader);break;
            case 2: userBouquet = getDefaultBouquet(reader);break;
            default: System.out.println("Sorry, we can't help you");
        }
        return userBouquet;
    }

    private static Bouquet getDefaultBouquet(Scanner reader){
        Default_bouquets dayFlowers = new Default_bouquets();
        dayFlowers.formBouquets();
        System.out.println(dayFlowers.description);
        System.out.println("Please choose from these options and enter a number");
        int m;
        try{m = reader.nextInt();}
        catch (Exception e) {
            System.out.println("Sorry, we can't help you");
            return new Bouquet();
        }
        switch (m) {
            case 1: return dayFlowers.firstType;
            case 2: return  dayFlowers.secondType;
            case 3: return dayFlowers.thirdType;
            default: System.out.println("Sorry, we can't help you :=("); return new Bouquet();
        }
    }
    private static Bouquet getUserBouquet(Scanner reader) {
        Bouquet userBouquet = new Bouquet();
        System.out.println("Enter 1 - to add a Rose,\n2 - to add a Tulip,\n" +
                "3 - to add a Chamomile,\n4 - for a Peony\nand 0 to end creating your Bouquet.");
        int flower = 1;
        while(flower != 0){
            flower = reader.nextInt();
            switch (flower){
                case 1: userBouquet.addFlower(Rose.getRandomRose());break;
                case 2: userBouquet.addFlower(Tulip.getRandomTulip());break;
                case 3: userBouquet.addFlower(Chamomile.getRandomChamomile());break;
                case 4: userBouquet.addFlower(Peony.getRandomPeony());break;
                default: System.out.println("You inputted an invalid number");
            }
        }
        return userBouquet;
    }

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addData();
        Bouquet userBouquet = getBouquet();
        System.out.println("Your order: " + userBouquet + "\nThere are " + userBouquet.getSize() +
                " flowers in your bouquet" + "\nPrice: " + userBouquet.getOveralPrice());

    }
}