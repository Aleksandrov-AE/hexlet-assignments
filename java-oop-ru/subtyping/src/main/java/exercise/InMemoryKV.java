package exercise;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

class InMemoryKV implements KeyValueStorage {
    private final Map<String, String> memoryKV;

    public InMemoryKV(Map<String, String> memoryKV) {
        this.memoryKV = new HashMap<>(memoryKV);
    }

    @Override
    public void set(String key, String value) {
        memoryKV.put(key, value);
    }

    @Override
    public void unset(String key) {
        memoryKV.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return memoryKV.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(memoryKV);
    }

}
