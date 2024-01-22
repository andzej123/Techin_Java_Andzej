package farmsimulator;

import java.util.Random;

public class Cow implements Milkable,Alive {

    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    private String name;

    private double udderCapacity;

    private double udder = 0;
    public Cow() {
        udderCapacity = 15 + new Random().nextInt(26);
        this.name = NAMES[new Random().nextInt(NAMES.length)];
    }

    public Cow(String name) {
        this.name = name;
        udderCapacity = 15 + new Random().nextInt(26);
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return udderCapacity;
    }

    public double getAmount() {
        return udder;
    }

    @Override
    public void liveHour() {
        double randomNum = 0.7 + (2 - 0.7) * Math.random();
        udder += randomNum;
        if (udder > udderCapacity) {
            udder = udderCapacity;
        }
    }

    @Override
    public double milk() {
        double num = udder;
        udder = 0;
        return num;
    }

    @Override
    public String toString() {
        double a = Math.ceil(udder);
        double b = Math.ceil(udderCapacity);
        return String.format("%s %.1f/%.1f",name,a,b);

    }

}
