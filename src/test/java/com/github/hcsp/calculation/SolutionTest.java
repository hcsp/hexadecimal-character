package com.github.hcsp.calculation;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void test() {
        Assertions.assertTrue(
                IntStream.range('0', '9' + 1)
                        .mapToObj(i -> (char) i)
                        .allMatch(Solution::isValidHexCharacter));
        Assertions.assertTrue(
                IntStream.range('A', 'G')
                        .mapToObj(i -> (char) i)
                        .allMatch(Solution::isValidHexCharacter));
        Assertions.assertTrue(
                IntStream.range('a', 'g')
                        .mapToObj(i -> (char) i)
                        .allMatch(Solution::isValidHexCharacter));
        Assertions.assertTrue(
                IntStream.range('g', 'z')
                        .mapToObj(i -> (char) i)
                        .noneMatch(Solution::isValidHexCharacter));
        Assertions.assertTrue(
                IntStream.range('G', 'Z')
                        .mapToObj(i -> (char) i)
                        .noneMatch(Solution::isValidHexCharacter));
        Assertions.assertTrue(
                IntStream.range('g', 'z')
                        .mapToObj(i -> (char) i)
                        .noneMatch(Solution::isValidHexCharacter));
        Assertions.assertTrue(
                IntStream.range('!', '0')
                        .mapToObj(i -> (char) i)
                        .noneMatch(Solution::isValidHexCharacter));
    }
}
