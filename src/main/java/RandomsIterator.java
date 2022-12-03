import java.util.Iterator;
import java.util.Random;

public class RandomsIterator implements Iterator<Integer> {
    protected Randoms randoms;

    public RandomsIterator(Randoms randoms) {
        this.randoms = randoms;
    }

    @Override
    public Integer next() {
        randoms.random = new Random();
        return randoms.min + randoms.random.nextInt(randoms.max - randoms.min);
    }

    @Override
    public boolean hasNext() {
        return true;
    }
}
