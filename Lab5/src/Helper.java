import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Helper {
    public static double[] readValues(String filename) throws IOException {
        var str = Files.readString(Path.of(filename));
        return Arrays.stream(str.split(" ")).mapToDouble((value -> Double.parseDouble(value))).toArray();
    }

    public static double sumOfValues(String filename) throws IOException {
        double[] arr;
        try {
            arr = readValues(filename);
        } catch (Exception e) {
            throw e;
        }

        return Arrays.stream(arr).sum();
    }
}
