public interface IntSequence {
    default boolean hasNext() {return true;}
    int next() throws Exception;
    static IntSequence of(int...numbers)
    {
        return new IntSequence() {
            private int[] array = numbers;
            private int currIndex = -1;
            @Override
            public boolean hasNext() {
                return currIndex + 1 <= array.length;
            }

            @Override
            public int next() throws Exception {
                if (!hasNext()) {
                    throw new Exception("Sequence is over");
                }
                return array[++currIndex];
            }
        };
    }

    static IntSequence constant(int a)
    {
        return () -> a;
    }
};


