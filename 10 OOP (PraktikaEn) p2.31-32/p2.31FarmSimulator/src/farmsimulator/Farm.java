package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private List<Cow> cows = new ArrayList<>();

    private String owner;
    private CowHouse cowhouse;

    public Farm(String owner, CowHouse cowhouse) {
        this.owner = owner;
        this.cowhouse = cowhouse;
    }
    public void installMilkingRobot(MilkingRobot milkingrobot) {
        cowhouse.installMilkingRobot(milkingrobot);
    }

    public String getOwner() {
        return owner;
    }

    public void liveHour() {
        cows.forEach(Cow::liveHour);
    }

    public void addCow(Cow cow) {
        cows.add(cow);
    }
    public void manageCows() {
        cowhouse.takeCareOf(cows);

    }
}
