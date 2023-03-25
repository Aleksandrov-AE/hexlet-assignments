package exercise;

import java.util.*;
import java.util.stream.Collectors;

class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        Map<String,String> NameBirthday = users.stream()
                .filter(m -> m.containsValue("male"))
                .collect(Collectors.toMap(
                        x -> x.get("birthday"),
                        x -> x.get("name")));
        Map<String, String> sortNameBirtday = new TreeMap<>(NameBirthday);
        return new ArrayList<>(sortNameBirtday.values());
    }
}