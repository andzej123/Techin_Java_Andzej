package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> list = new ArrayList<>();
    private ArrayList<Integer> reading = new ArrayList<>();

    public List<Integer> readings() {
        return reading;
    }


    @Override
    public boolean isOn() {
        return list.stream().allMatch(Sensor::isOn);
    }

    public void printSensor() {
        list.forEach(System.out::println);
    }

    @Override
    public void setOn() {
        list.forEach(Sensor::setOn);

    }

    @Override
    public void setOff() {
        list.forEach(Sensor::setOff);

    }

    @Override
    public int read() {
        if (!isOn()) throw new IllegalStateException();
        if (list.isEmpty()) throw new IllegalStateException();
        int result = (int)list.stream().mapToInt(Sensor::read).average().orElseThrow();
        reading.add(result);
        return result;

    }

    public void addSensor(Sensor toAdd) {
        list.add(toAdd);
    }
}
