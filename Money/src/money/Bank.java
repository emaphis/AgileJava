package money;

import java.util.Hashtable;

/**
 *
 * @author emaph
 */
public class Bank {
    private Hashtable<Pair, Integer> rates = new Hashtable();

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));
    }

    int rate(String from, String to) {
        if (from.equals(to)) return 1;
        Integer rate = rates.get(new Pair(from, to));
        return rate.intValue();
    }

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

}
