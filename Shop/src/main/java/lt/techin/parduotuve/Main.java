package lt.techin.parduotuve;

import lt.techin.parduotuve.product.*;

public class Main {
    public static void main(String[] args) {

        Store duncans = new Store("Duncan's Store");
        duncans.add(new Standart("Limonade", 2.7));
        duncans.add(new Standart("Bread", 1.9));
        duncans.add(new Standart("Ham", 3.8));
        duncans.add(new Standart("Cheese", 3.5));

        duncans.add(new Medication("Citramon", 8.2));
        duncans.add(new Medication("Theraflu", 11.2));
        duncans.add(new Medication("Apap", 7.2));
        duncans.add(new Medication("Aspirin", 2.5));

        duncans.add(new Wine("Riesling", 10.5, 0.7, true));
        duncans.add(new Wine("Malbec", 18.7, 1, false));
        duncans.add(new Wine("White Wine", 7.7, 0.5, true));
        duncans.add(new Wine("Red WIne", 12.4, 0.12, false));

        duncans.add(new Alcohol("Beer", 1.5, 0.5, true));
        duncans.add(new Alcohol("Vodka", 15.4, 0.7, false));
        duncans.add(new Alcohol("Champagne", 6.5, 0.8, true));
        duncans.add(new Alcohol("Whisky", 20.2, 1, false));





    }
}
