import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> hashmap = new HashMap<>();

    public VehicleRegistry() {
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (hashmap.containsKey(licensePlate)) {
            return false;
        }
        hashmap.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        if (hashmap.containsKey(licensePlate)) {
            return hashmap.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (hashmap.containsKey(licensePlate)) {
            hashmap.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (Map.Entry<LicensePlate, String> e : hashmap.entrySet()) {
            System.out.println(e.getKey());
        }
    }

    public void printOwners() {
        List<String> list = new ArrayList<>();
        for (Map.Entry<LicensePlate, String> e : hashmap.entrySet()) {
            if (!list.contains(e.getValue())) {
                System.out.println(e.getValue());
                list.add(e.getValue());
            }
        }
    }

}
