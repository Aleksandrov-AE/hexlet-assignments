package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

class App {
    public static String getForwardedVariables(String s) {
        String prefix = "X_FORWARDED_";
        String environment = "environment=";
        List<String> environmentStr = new ArrayList<>();
        int start = 0;
        int end = 0;
        int indexPrefix = s.indexOf(environment);
        while(indexPrefix != -1) {
            start = indexPrefix + environment.length() + 1;
            end = s.indexOf("\"", start);
            environmentStr.add(s.substring(start, end));
            indexPrefix = s.indexOf(environment, end);
        }
        String result = environmentStr.stream()
                .flatMap(str -> Arrays.stream(str.split(","))
                        .filter(sub -> sub.startsWith(prefix))
                        .map(sub -> sub.substring(prefix.length())))
                .collect(Collectors.joining(","));
        return result;
     }
}