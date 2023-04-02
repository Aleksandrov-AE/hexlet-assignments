package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class SingleTag extends Tag {
    public SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
    }

    @Override
    public String toString() {
        String split = getAttribute().size() != 0 ? " " : "";
        return "<" + getName() + split + getAttribute().entrySet().stream()
                .map(e -> e.getKey() + "=\"" + e.getValue() +"\"")
                .collect(Collectors.joining(" ")) + ">";
    }

    public static void main(String[] args) {
        SingleTag t = new SingleTag("fly" , Map.of("1", "one", "2", "rwo"));
        System.out.println(t);
    }
}