# FizzBuzz kata

## General decription
The FizzBuzz Kata is a classic coding exercise that consists of writing a program that prints numbers from 1 to n
(usually n = 100) and replaces certain numbers with a specific sequence:

- If the number is divisible by 3, print "Fizz" instead
- If the number is divisible by 5, print "Buzz" instead
- If the number is divisible by both 3 and 5, print "FizzBuzz" instead

The resulting output should look like this:
```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
```

The FizzBuzz Kata is often used as a simple test of basic programming skills, such as control structures (loops),
conditional statements, and string manipulation. It's usually intended to be a beginner-friendly exercise.

## Variants

I have implemented two different solutions for the kata:
one simple one, and one based on Java Streams.

For both I have written [one single interface](src/main/java/com/github/sourcefranke/podcast/ep001_fizzbuzz/IFizzBuzz.java).

### SimpleFizzBuzzImpl

Very basic solution with many **if blocks**, like e.g.:

```java
if(i % 3 == 0 && i % 5 == 0) {
    return "FizzBuzz";
}
```

#### Why this approach is bad

Imagine, you want to add further "transforming rules", e.g.:

```java
if(i % 7 == 0) return "Foo";
```

Then, you also have to take care for all the possible combinations with all the other numbers, that already exist!
So, adding one more "rule" doesn't let the number of if-blocks increase in a linear way, but exponentially!

#### Source files

[>> to the source file](src/main/java/com/github/sourcefranke/podcast/ep001_fizzbuzz/SimpleFizzBuzzImpl.java)

[>> to the unit test](src/test/java/com/github/sourcefranke/podcast/ep001_fizzbuzz/SimpleFizzBuzzImplTest.java)

### StreamFizzBuzzImpl

Solution based on the Java Stream API.

Rules are defined within a List - like this:

```java
public record Rule(int mod, String name) {}

private static final List<Rule> rules = List.of(
    new Rule(3, "Fizz"),
    new Rule(5, "Buzz")
);
```

#### Benefit

So, adding one rule here just leads to adding one more entry to this list shown above -
and all the rest of the source code will be able to handle it.

#### Source files

[>> to the source file](src/main/java/com/github/sourcefranke/podcast/ep001_fizzbuzz/StreamFizzBuzzImpl.java)

[>> to the unit test](src/test/java/com/github/sourcefranke/podcast/ep001_fizzbuzz/StreamFizzBuzzImplTest.java)
