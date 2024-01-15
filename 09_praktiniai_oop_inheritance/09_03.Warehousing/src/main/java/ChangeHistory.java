import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        if (!history.isEmpty()) {
            return Collections.max(history);
        }
        return 0;
    }

    public double minValue() {
        if (!history.isEmpty()) {
            return Collections.min(history);
        }
        return 0;
    }

    public double average() {
        double sum = 0;
        if (!history.isEmpty()) {
            for (double d : history) {
                sum += d;
            }
            return sum / history.size();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "" + history;
    }
}
