import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> wordTranslations;

    public DictionaryOfManyTranslations() {
        wordTranslations = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (!wordTranslations.containsKey(word)) {
            wordTranslations.put(word, new ArrayList<>());
        }
        ArrayList<String> translationList = wordTranslations.get(word);
        translationList.add(translation);
    }

    public ArrayList<String> translate(String word) {
        if (wordTranslations.containsKey(word)) {
            return wordTranslations.get(word);
        }
        return new ArrayList<>();
    }

    public void remove(String word) {
        wordTranslations.remove(word);
    }

    public void print() {
        for (Map.Entry<String, ArrayList<String>> e : wordTranslations.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
