import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        IntSequence seq = IntSequence.of(1, 2, 3);
        IntSequence constSeq = IntSequence.constant(99);
        constSeq = IntSequence.constant(999);
        SquareSequence squareSequence = new SquareSequence(BigInteger.valueOf(2));
        try {
            System.out.println(seq.next());
            System.out.println(seq.next());
            System.out.println(seq.next());
            System.out.println(squareSequence.next());
            System.out.println(constSeq.next());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
