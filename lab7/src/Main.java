import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(Helper.countWordOccurrencesOnLines("D:\\Ucheba\\java\\IdeaProjects\\lab7\\src\\123.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
