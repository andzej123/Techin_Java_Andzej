package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {


    Map<String, String> dictionary = new HashMap<>();

    File myFile;

    public SaveableDictionary(String file) {
        myFile = new File(file);
    }

    public boolean load() throws IOException {
        if (myFile.canRead()) {
            Files.lines(Paths.get(myFile.toURI()))
                    .map(f -> f.split(":"))
                    .map(f -> dictionary.put(f[0], f[1]));
            return true;
        } else {
            return false;
        }
    }

    public void add(String words, String translation) {
        if (!dictionary.containsKey(words)) {
            dictionary.put(words, translation);
        }
    }

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        }
        if (dictionary.containsValue(word)) {
            return dictionary.entrySet()
                    .stream()
                    .filter(entry -> word.equals(entry.getValue()))
                    .map(Map.Entry::getKey).findFirst().orElse(null);
        }
        return null;
    }

    public void delete(String word) {
        dictionary.remove(word);
        if (dictionary.containsValue(word)) {
            dictionary.values().remove(word);
        }
    }

}


