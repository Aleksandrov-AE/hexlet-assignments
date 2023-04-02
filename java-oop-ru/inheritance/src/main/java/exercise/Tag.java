package exercise;

import java.util.stream.Collectors;
import java.util.Map;

public abstract class Tag {
    private String name;
    private Map<String, String> attribute;

    public Tag(String name, Map<String, String> attribute) {
        this.name = name;
        this.attribute = attribute;
    }
    public String getName() {
        return name;
    }

    public Map<String, String> getAttribute() {
        return attribute;
    }
}

