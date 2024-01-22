package farmsimulator;

import java.util.Collection;

public class CowHouse {

    private BulkTank tank;

    private MilkingRobot milkingRobot;
    public CowHouse(BulkTank tank) {
        this.tank = tank;
    }

    public BulkTank getBulkTank() {
        return tank;
    }

    public void installMilkingRobot(MilkingRobot milkingrobot) {
        this.milkingRobot = milkingrobot;
        this.milkingRobot.setBulkTank(tank);
    }

    public void takeCareOf(Cow cow) {
        if (milkingRobot == null) throw new IllegalStateException("The MilkingRobot hasn't been installed");
        milkingRobot.milk(cow);
    }

    public void takeCareOf(Collection<Cow> cows) {
        if (milkingRobot == null) throw new IllegalStateException("The MilkingRobot hasn't been installed");
        cows.forEach(cow -> milkingRobot.milk(cow));
    }

    @Override
    public String toString() {
        return tank.toString();
    }
}
