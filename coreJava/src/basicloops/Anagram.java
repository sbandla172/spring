package basicloops;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {

    public static Map<Integer,String> sortByValue(final Map<Integer,String> wordCounts) {

        return wordCounts.entrySet()
                .stream()
                .sorted((Map.Entry.<Integer, String>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    public static void main(String[] args) {
        final Map<Integer,String> wordCounts = new HashMap<>();
        wordCounts.put(100,"USA");
        wordCounts.put(200,"jobs");
        wordCounts.put(40,"software");
        wordCounts.put(5,"technology");
        wordCounts.put(65,"opportunity");

//        final Map<Integer,String> sortedByCount = sortByValue(wordCounts);

        System.out.println(sortByValue(wordCounts));
    }
}