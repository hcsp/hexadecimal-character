package com.github.hcsp.calculation;

import com.github.hcsp.test.helper.ProjectSourceFileReader;
import java.util.stream.IntStream;
import java.util.stream.Stream;
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

    @Test
    public void noMagicNumbers() {
        String sourceCode = ProjectSourceFileReader.readAsString(Solution.class);
        Assertions.assertTrue(
                Stream.of(
                                "48", "57", "65", "70", "97", "102", "0x30", "0x39", "0x41", "0x46",
                                "0x61", "0x66")
                        .noneMatch(sourceCode::contains));
    }
}
