package calculator.model;

import java.util.List;

import java.util.List;

public class Calculator {
    public int add(List<Integer> numbers) {
        validate(numbers);
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    private void validate(List<Integer> numbers) {
        if (numbers.stream().anyMatch(n -> n < 0)) {
            throw new IllegalArgumentException();
        }

        if (numbers.stream().mapToLong(n -> n).sum() > Integer.MAX_VALUE) {
            throw new IllegalArgumentException();
        }
    }
}
