package com.company;

import java.util.Map;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Strobogrammatic {
    private Map<Integer, String[]> numbersGenerated = new TreeMap<>();

    public Strobogrammatic(int initialSize) {
        this();
        if (initialSize > numbersGenerated.size())
            generateNumbers(initialSize);
    }

    public Strobogrammatic() {
        String[] base1 = {"0", "1", "8"};
        String[] base2 = {"00","11" , "69", "88", "96"};
        numbersGenerated.put(1, base1);
        numbersGenerated.put(2, base2);
    }

    public String[] getWithNDigits(int digits) {
        if (!numbersGenerated.containsKey(digits))
            generateNumbers(digits);
        if (digits == 2) {
            String[] elems = numbersGenerated.get(2);
            return Arrays.copyOfRange(elems, 1, elems.length);
        }
        else
            return numbersGenerated.get(digits);
    }

    private void generateNumbers(int size) {
        final int mapSize = numbersGenerated.size() + 1;
        int cut =  (mapSize - 1) / 2;
        for (int i = mapSize; i <= size; i++) {
            Set<String> numbers = new TreeSet<>();
            int base = (i % 2 != 0) ? 1 : 2;
            for(String value : numbersGenerated.get(base)) {
                for(String number: numbersGenerated.get(i - 1)) {
                    String begin = number.substring(0, cut);
                    String end  = number.substring(number.length() - cut);
                    if (!begin.equals("0") && !end.equals("0"))
                        numbers.add(begin + value + end);
                }
            }
            if (base == 2)
                ++cut;
            numbersGenerated.put(i, numbers.toArray(new String[0]));
        }
    }

}
