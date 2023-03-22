package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    private final List<Integer> in =  new ArrayList<>(List.of(1, 2, 3, 4, 5));

    @Test
    void testTakeWhenCount0() {
        List<Integer>  expected =  new ArrayList<>();
        List<Integer> result = App.take(in, 0);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void testTakeCountGreaterLength() {
        List<Integer>  expected =  new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> result = App.take(in, 10);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testTakeLengthGreaterCount() {
        List<Integer>  expected =  new ArrayList<>(List.of(1, 2, 3));
        List<Integer> result = App.take(in, 3);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testTakeListIsEmpty() {
        List<Integer>  expected =  new ArrayList<>();
        List<Integer>  actual =  new ArrayList<>();
        List<Integer> result = App.take(actual, 3);
        assertThat(result).isEqualTo(expected);
    }
}

