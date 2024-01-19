import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Checker {


    public boolean isDayOfWeek(String string) {
        return string.matches("(?i)\\b(Mon|Tue|Wed|Thu|Fri|Sat|Sun)\\b");
    }

    public boolean allVowels(String string) {
        return Arrays.stream(string.split("")).allMatch(s -> s.matches("[aeiouAEIOU]"));
    }

    public boolean timeOfDay(String string) {
        return string.matches("^(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$");
    }

}
