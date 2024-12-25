package com.github.sourcefranke.podcast.ep001_fizzbuzz;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFizzBuzzImpl implements IFizzBuzz {

    public record Rule(int mod, String name) {}

    private static final List<Rule> rules = List.of(
            new Rule(3, "Fizz"),
            new Rule(5, "Buzz")
    );

    private static Predicate<Rule> modFilter(int i) {
        return rule -> i % rule.mod == 0;
    }

    @Override
    public String fizzBuzz(int i) {
        if(rules.stream().noneMatch(modFilter(i))) {
            return String.valueOf(i);
        }

        return rules.stream()
                .filter(modFilter(i))
                .map(Rule::name)
                .collect(Collectors.joining());
    }
}
