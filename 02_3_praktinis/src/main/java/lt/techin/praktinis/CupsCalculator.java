package lt.techin.praktinis;

public class CupsCalculator {

    public void calculateCups(int numberOfCups) {
        int numOfCups = numberOfCups;
        int boxes = numOfCups / 3;
        int leftCups = numOfCups % 3;

        System.out.println("Dėžių: " + boxes + "\nLiko puodelių: " + leftCups);

    }

    public static void main(String[] args) {
        CupsCalculator cc = new CupsCalculator();
        cc.calculateCups(10);
    }

}
