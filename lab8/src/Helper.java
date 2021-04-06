import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.LongStream.iterate;

public class Helper {
    public static Stream<Long> randomGenerator(int a, int c, int m, Long seed) {
        return Stream.iterate(seed, x -> (a*x+c)%m);
    }

    public static boolean isAllLetters(String str)
    {
        return str.codePoints().allMatch(a -> Character.isAlphabetic(a));
    }

    public static String[] getFirstNWords(String filename, int n)
    {
        return getStreamOfTokensFromFile(filename).filter(a -> isAllLetters(a)).limit(n).toArray(a -> new String[a]);
    }

    public static Stream<String> getStreamOfTokensFromFile(String filename)
    {
        Stream<String> stream = Stream.of();
        try {
            stream = Arrays.stream(Files.readString(Path.of(filename)).split(" "));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stream;
    }
}
