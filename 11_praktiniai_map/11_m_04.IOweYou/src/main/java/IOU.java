import java.util.HashMap;
import java.util.Map;

public class IOU {

    private HashMap<String, Double> hashmap = new HashMap<>();
    public IOU() {
    }

    public void setSum(String toWhom, double amount) {
        hashmap.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        for(Map.Entry<String, Double> e: hashmap.entrySet()) {
            if(e.getKey().contains(toWhom)) {
                return e.getValue();
            }
        }
        return 0;

    }
}
