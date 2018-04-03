package jp.urgm.collectors;

import java.util.Optional;

final class FirstBox<T> {

    private boolean set;
    private T value;

    void accumulate(final T value) {
        if (set == false) {
            set = true;
            this.value = value;
        }
    }

    FirstBox<T> combine(final FirstBox<T> other) {
        return this;
    }

    Optional<T> finish() {
        if (set) {
            return Optional.of(value);
        }
        return Optional.empty();
    }
}
