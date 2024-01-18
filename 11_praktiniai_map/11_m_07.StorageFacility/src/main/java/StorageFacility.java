import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageUnit;

    public StorageFacility() {
        storageUnit = new HashMap<>();
    }

    public void add(String unit, String item) {

        if (!storageUnit.containsKey(unit)) {
            storageUnit.put(unit, new ArrayList<>());
        }
        ArrayList<String> list = storageUnit.get(unit);
        list.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storageUnit.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        this.storageUnit.get(storageUnit).remove(item);
        if (this.storageUnit.get(storageUnit).isEmpty()) {
            this.storageUnit.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> e : storageUnit.entrySet()) {
            list.add(e.getKey());
        }
        return list;
    }
}
