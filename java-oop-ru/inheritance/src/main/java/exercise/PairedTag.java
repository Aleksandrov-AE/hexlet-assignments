package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

class PairedTag extends SingleTag {
    private String body;
    private List<Tag> child;

    public PairedTag(String name, Map<String, String> attributes, String body, List<Tag> child) {
        super(name, attributes);
        this.body = body;
        this.child = child;
    }

    @Override
    public String toString() {
        return super.toString() + body + child.stream()
                .map(Object::toString)
                .collect(Collectors.joining("")) + "</" + getName() + ">";
    }
}
