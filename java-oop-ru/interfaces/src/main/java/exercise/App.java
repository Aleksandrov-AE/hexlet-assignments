package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class App {
    public static List<String> buildApartmentsList(List<Home> apartment, int n) {
        return  apartment.stream()
                .sorted(Comparator.comparing(Home::getArea))
                .limit(n)
                .map(Object::toString)
                .collect(Collectors.toList());
    }
}
