package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class App {
    public static int getCountOfFreeEmails(List<String> email) {
        return (int)email.stream().filter(s -> s.contains("@gmail.com")
                || s.contains("@yandex.ru")
                || s.contains("@hotmail.com")).count();
    }
}

