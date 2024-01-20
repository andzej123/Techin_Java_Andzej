package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // You can test your dictionary here

        SaveableDictionary dictionary = new SaveableDictionary("C:\\Users\\Andzej\\Desktop\\java\\praktiniai_papildomai_1\\papild_03.SaveableDictionary\\words.txt");
        boolean wasSuccessful = dictionary.load();
        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        dictionary.load();
        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
//        dictionary.printDic();
//        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("ohjelmonti", "programming");
        dictionary.printDic();
//        dictionary.delete("apina");
//        dictionary.delete("banana");
        dictionary.save();


    }
}
