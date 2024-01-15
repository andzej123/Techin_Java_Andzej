import java.util.ArrayList;

public class Herd implements Movable{

    private ArrayList<Movable> herd;

    public Herd() {
        herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable m : herd) {
            m.move(dx,dy);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for(Movable h : herd) {
            s += h.toString() + "\n";
        }
        return s;
    }
}
