package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> swapStorage = storage.toMap()
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Entry::getValue, Entry::getKey));
        swapStorage.forEach((key, value) -> storage.unset(value));
        swapStorage.forEach(storage::set);
    }
}

