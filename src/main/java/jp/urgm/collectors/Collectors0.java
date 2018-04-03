package jp.urgm.collectors;

import java.util.Optional;
import java.util.stream.Collector;

/**
 * 
 * @author backpaper0
 *
 */
public final class Collectors0 {

    private Collectors0() {
    }

    public static <T> Collector<T, ?, Optional<T>> findFirst() {
        final Collector<T, FirstBox<T>, Optional<T>> collector = Collector.of(
                FirstBox::new,
                FirstBox::accumulate,
                FirstBox::combine,
                FirstBox::finish);
        return collector;
    }
}
