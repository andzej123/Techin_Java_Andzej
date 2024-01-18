import java.util.HashMap;
import java.util.Map;

public class Abbreviations {

    private Map<String, String> hm = new HashMap<>();

    public Abbreviations() {
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        hm.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return hm.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return hm.get(abbreviation);
    }
}
