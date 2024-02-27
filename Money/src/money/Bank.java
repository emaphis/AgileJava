package money;

import java.util.HashMap;

/**
 *
 * @author emaph
 */
public class Bank {
    private final HashMap<Pair, Integer> rates = new HashMap<>();
    
    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    int rate(String from, String to) {
        if (from.equals(to)) return 1;
        return rates.get(new Pair(from, to));
    }

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

}
