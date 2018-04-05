package jp.urgm.collectors;

import java.util.Optional;
import java.util.stream.Collector;

/**
 * Utility class that provide {@link Collector} implementation.
 * 
 * @author backpaper0
 *
 */
public final class Collectors0 {

    private Collectors0() {
    }

    /**
     * Return first element of stream, or {@link Optional#empty()}.
     * 
     * @param <T> the type of stream elements
     * @return first element of stream, or {@link Optional#empty()}
     */
    public static <T> Collector<T, ?, Optional<T>> findFirst() {
        final Collector<T, FirstBox<T>, Optional<T>> collector = Collector.of(
                FirstBox::new,
                FirstBox::accumulate,
                FirstBox::combine,
                FirstBox::finish);
        return collector;
    }
}
