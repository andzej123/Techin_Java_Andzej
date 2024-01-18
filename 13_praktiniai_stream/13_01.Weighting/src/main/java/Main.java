

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!

        Item knife = new Item("knife", 50);
        Item spoon = new Item("spoon", 3);
        Item fork = new Item("fork", 4);
        Item chair = new Item("chair", 10);
        Item table = new Item("table", 18);
        Item laptop = new Item("laptop", 4);
        Item bed = new Item("bed", 75);

        Suitcase kitchenSuitcase = new Suitcase(100);
        kitchenSuitcase.addItem(knife);
        kitchenSuitcase.addItem(fork);
        kitchenSuitcase.addItem(spoon);

        Suitcase otherSuitcase = new Suitcase(200);
        otherSuitcase.addItem(chair);
        otherSuitcase.addItem(table);
        otherSuitcase.addItem(laptop);
        otherSuitcase.addItem(bed);

        Hold hold = new Hold(100);
        hold.addSuitcase(kitchenSuitcase);
        hold.addSuitcase(otherSuitcase);
        kitchenSuitcase.printItems();


    }

}
