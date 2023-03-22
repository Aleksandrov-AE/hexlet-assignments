package exercise;

import java.util.HashMap;
import java.util.Map;

class App {
    public static Map<String, Integer> getWordCount(String str) {
        Map<String, Integer> result = new HashMap<>();
        if (str.isEmpty()) {
            return result;
        }
        String[] substrings = str.split(" ");
        for (String substring: substrings) {
            result.put(substring, result.getOrDefault(substring, 0) + 1);
        }
        return result;
    }
    public static String toString(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder result = new StringBuilder("{");
        for (Map.Entry<String, Integer> pairs: map.entrySet()) {
            result.append("\n  " + pairs.getKey() + ":" + " " + pairs.getValue());
        }
        result.append("\n}");
        return  result.toString();
    }
}
