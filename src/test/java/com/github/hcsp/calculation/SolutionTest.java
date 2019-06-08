package com.github.hcsp.calculation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void test() {
        assertTrue(
                java.util.stream.IntStream.range('0', '9' + 1)
                        .mapToObj(i -> (char) i)
                        .allMatch(Solution::isValidHexCharacter));
        assertTrue(
                java.util.stream.IntStream.range('A', 'G')
                        .mapToObj(i -> (char) i)
                        .allMatch(Solution::isValidHexCharacter));
        assertTrue(
                java.util.stream.IntStream.range('a', 'g' + 1)
                        .mapToObj(i -> (char) i)
                        .allMatch(Solution::isValidHexCharacter));
        assertTrue(
                java.util.stream.IntStream.range('g', 'z')
                        .mapToObj(i -> (char) i)
                        .noneMatch(Solution::isValidHexCharacter));
        assertTrue(
                java.util.stream.IntStream.range('G', 'Z')
                        .mapToObj(i -> (char) i)
                        .noneMatch(Solution::isValidHexCharacter));
        assertTrue(
                java.util.stream.IntStream.range('g', 'z')
                        .mapToObj(i -> (char) i)
                        .noneMatch(Solution::isValidHexCharacter));
        assertTrue(
                java.util.stream.IntStream.range('!', 'A')
                        .mapToObj(i -> (char) i)
                        .noneMatch(Solution::isValidHexCharacter));
    }
}
