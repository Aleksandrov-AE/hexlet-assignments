package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class App {
    public static LinkedHashMap<String, String> genDiff(Map<String,Object> map1, Map<String, Object> map2) {
        Stream<Map.Entry<String,Object>> concatMap = Stream
                .concat(map1.entrySet().stream(), map2.entrySet().stream());
        LinkedHashMap<String, String> result = concatMap.sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, (entry) -> {
                    boolean map1Present = map1.containsKey(entry.getKey());
                    boolean map2Present = map2.containsKey(entry.getKey());
                    if (map1Present && map2Present) {
                        return map1.get(entry.getKey()).equals(map2.get(entry.getKey()))? "unchanged" : "changed";
                    }
                    if (map1Present) {
                        return "deleted";
                    } else {
                        return "added";
                    }
                }, (value1, value2) -> value1, LinkedHashMap::new));
        return result;
    }
}
