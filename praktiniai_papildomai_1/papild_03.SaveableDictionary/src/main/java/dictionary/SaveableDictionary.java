package dictionary;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class SaveableDictionary {


    private Map<String, String> dictionary;

    private File myFile;

    public SaveableDictionary() {
        dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        myFile = new File(file);
        dictionary = new HashMap<>();
    }

    public boolean load() {
        try {
            if (myFile.canRead()) {
                Files.lines(Paths.get(myFile.toURI()))
                        .map(f -> f.split(":"))
                        .forEach(f -> dictionary.put(f[0], f[1]));
//            Files.lines(Paths.get(myFile.toURI())).forEach(System.out::println);
                return true;
            } else {
                return false;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean save() {
//        List<String> lines = Arrays.asList("The first line", "The second line");
//        Path file = Paths.get("the-file-name.txt");
//        Files.write(file, (Iterable<? extends CharSequence>) dictionary, StandardCharsets.UTF_8);
//        for (Map.Entry<String,String> entry : dictionary.entrySet()) {
//            properties.put(entry.getKey(), entry.getValue());
//        }
        try {
            FileWriter myWriter = new FileWriter(myFile);
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                myWriter.write(entry.getKey() + ":" + entry.getValue() + "\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        return true;
    }

    public void printDic() {
        System.out.println(dictionary);
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


