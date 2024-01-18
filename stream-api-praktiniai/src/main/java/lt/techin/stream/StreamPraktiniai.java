package lt.techin.stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPraktiniai {

    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        return numbers.stream().map(m -> (int) Math.sqrt(m)).toList();
    }

    public static List<Integer> getAgeFromUsers(List<User> users) {
        return users.stream().map(User::getAge).toList();
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        return users.stream().map(User::getAge).distinct().toList();
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream().limit(limit).toList();
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        return (int) users.stream().filter(s -> s.getAge() > 25).count();
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).toList();
    }

    public static Integer sum(List<Integer> integers) {
        return integers.stream().mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream().skip(toSkip).collect(Collectors.toList());
    }

    public static List<String> getFirstNames(List<String> names) {
        return names.stream().map(s -> s.split(" ")[0]).toList();
    }

    public static List<String> getDistinctLetters(List<String> names) {
        //return names.stream().flatMapToInt(CharSequence::chars).mapToObj(c -> String.valueOf((char) c)).distinct().toList();
        return names.stream().flatMap(s -> Arrays.stream(s.split("")).distinct()).distinct().toList();
    }


    public static String separateNamesByComma(List<User> users) {
        return users.stream().map(User::getName).collect(Collectors.joining(", "));

    }

    public static double getAverageAge(List<User> users) {
        return users.stream().mapToDouble(User::getAge).average().orElseThrow();
    }

    public static Integer getMaxAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).max().orElseThrow();
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream().map(User::getAge).min((o1, o2) -> o1 - o2).orElseThrow();
    }

    public static boolean anyMatch(List<User> users, int age) {
        return users.stream().map(User::getAge).anyMatch(a -> a == age);
    }

    public static boolean noneMatch(List<User> users, int age) {
        return users.stream().map(User::getAge).noneMatch(s -> s == age);
    }

    public static Optional<User> findAny(List<User> users, String name) {
        return users.stream().findAny();
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream().sorted(((o1, o2) -> o1.getAge() - o2.getAge())).toList();
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        return Stream.iterate(2, n -> n + 1).filter(StreamPraktiniai::isPrime).limit(10).toList();
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        return IntStream.rangeClosed(1, 1000).boxed().limit(10).collect(Collectors.toList());
    }

    public static User findOldest(List<User> users) {
        return users.stream().max(((o1, o2) -> o1.getAge() - o2.getAge())).orElseThrow();
    }

    public static int sumAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).sum();
    }

    //Pvz.:
    //Java 8 Streams API: Grouping and Partitioning a Stream
    //https://www.javacodegeeks.com/2015/11/java-8-streams-api-grouping-partitioning-stream.html

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::isMale));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::isMale, Collectors.groupingBy(User::getAge)));
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        return users.stream().collect(Collectors.partitioningBy(User::isMale, Collectors.counting()));
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
//        IntSummaryStatistics statistics = new IntSummaryStatistics();
//        for(User d: users) statistics.accept(d.getAge());
//        return statistics;
        return users.stream()
                .mapToInt(User::getAge)
                .summaryStatistics();
    }

}
