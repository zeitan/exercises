package com.antonbas;

import java.util.Comparator;
import com.sun.tools.javac.util.Pair;


public class PairComparator implements Comparator<Pair<String, String>> {
    @Override
    public int compare(Pair<String, String> x, Pair<String, String>  y) {
        if (x.snd.equals(y.snd)) {
            return x.fst.compareTo(y.fst);
        }
        else {
            return x.snd.compareTo(y.snd);
        }
    }

}
