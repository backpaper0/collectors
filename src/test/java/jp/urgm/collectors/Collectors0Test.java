package jp.urgm.collectors;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class Collectors0Test {

    @Test
    void findFirst() {
        final Optional<String> actual = Stream.of("foo", "bar", "baz")
                .collect(Collectors0.findFirst());
        assertEquals(Optional.of("foo"), actual);
    }
}
