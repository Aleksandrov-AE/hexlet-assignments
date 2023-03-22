package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

class App {
    public static List<Map<String, String>> findWhere(List<Map<String,String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        boolean isPresent = false;
        for (Map<String, String> book: books) {
            for (Map.Entry<String, String> entryWhere: where.entrySet()) {
                isPresent = book.containsKey(entryWhere.getKey())
                        && book.get(entryWhere.getKey()).equals(entryWhere.getValue());
                if (!isPresent) {
                    break;
                }
            }
            if (isPresent) {
                result.add(book);
            }
        }
        return result;
    }

}

