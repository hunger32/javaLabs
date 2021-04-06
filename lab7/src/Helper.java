import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Helper {
    public static void swap(List<?> list, int i, int j)
    {
        swapHelper(list, i, j);
    }

    public static TreeMap<String, Integer> countWordsOccurrences(String filename) throws FileNotFoundException {
        TreeMap<String, Integer> map = new TreeMap();
        Scanner fileScaner = new Scanner(new File(filename));
        while(fileScaner.hasNextLine()) // Checks if there is another line
        {
            Scanner lineScaner = new Scanner(fileScaner.nextLine());
            while(lineScaner.hasNext()){
                var word = lineScaner.next();
                if (!map.containsKey(word))

                {
                    map.put(word, 1);
                    continue;
                }

                map.put(word, map.get(word) + 1);
            }
        }

        return map;
    }

    public static Map<String, Set<Integer>> countWordOccurrencesOnLines(String filename) throws FileNotFoundException {
        Map<String, Set<Integer>> map = new TreeMap();
        Scanner fileScaner = new Scanner(new File(filename));
        int i = 1;
        while(fileScaner.hasNextLine()) // Checks if there is another line
        {
            Scanner lineScaner = new Scanner(fileScaner.nextLine());
            while(lineScaner.hasNext()){
                var word = lineScaner.next();
                Set<Integer> set = new HashSet<>(Set.of(i));
                set.addAll(map.getOrDefault(word, Set.of()));
                map.put(word, set);
            }

            i++;
        }

        return map;
    }

    private static<T> void swapHelper(List<T> list, int i, int j)
    {
        T tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }
}
