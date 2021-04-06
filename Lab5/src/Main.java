import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            double sum = Helper.sumOfValues("D:\\Ucheba\\java\\IdeaProjects\\Lab5\\src\\123.txt");
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
