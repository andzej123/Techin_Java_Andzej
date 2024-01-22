package farmsimulator;

public class Main {
    public static void main(String[] args) {
        // Test your program here

        BulkTank tank = new BulkTank();

        CowHouse bar = new CowHouse(tank);
        Farm fa = new Farm("jon", bar);
        fa.installMilkingRobot(new MilkingRobot());
        fa.addCow(new Cow());
        fa.addCow(new Cow());
        fa.addCow(new Cow());
        fa.liveHour();
        fa.manageCows();
        System.out.println(tank);





    }
}
