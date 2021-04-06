public class Main {
    public static void main(String[] args) {
        var generator = Helper.randomGenerator(252149039, 11, (int)Math.pow(2, 48), Long.valueOf(23));
        var filename = "D:\\Ucheba\\java\\IdeaProjects\\Lab8\\src\\123.txt";
        String str = "dkkd4";
        System.out.println(generator.skip(2).iterator().next());
        System.out.println(Helper.isAllLetters(str));
        System.out.println(String.join(" ", Helper.getFirstNWords(filename, 10)));
    }
}
