import java.math.BigInteger;

public class SquareSequence extends Sequence<BigInteger> {
    SquareSequence (BigInteger a) {
        value = a;
    }

    @Override
    BigInteger next() {
        value = value.add(BigInteger.valueOf(1));
        return value.multiply(value);
    }
}
