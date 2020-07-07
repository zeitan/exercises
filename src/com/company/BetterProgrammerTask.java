package com.company;

import java.util.Set;
import java.util.TreeSet;

public class BetterProgrammerTask {

    public static Object[] reverseArray(Object[] a) {
        if (a == null)
            return null;
        if (a.length == 1)
            return a;
        Object[] b = new Object[a.length];
        int i =0;
        for(int j= a.length - 1; j >= 0; j-- ) {
            b[i] = a[j];
            ++i;
        }
        return b;
    }

    public static int[] removeDuplicates(int[] a) {
        if (a == null )
            return a;
        if (a.length < 2)
            return  a;
        Set<Integer> aSet = new TreeSet<>();
        for (int i : a)
            aSet.add(i);
        int[] b = new int[aSet.size()];
        int i = 0;
        for(int elem: aSet)
            b[i++] = elem;
        return b;
    }


    public static Change getCorrectChange(int cents) {
        if ( cents <= 0)
            return null;
        int dollars = cents / 100;
        int remanent = cents % 100;
        int quarters = remanent / 25;
        remanent = remanent % 25;
        int dimes = remanent / 10;
        remanent = remanent % 10;
        int nickels = remanent / 5;
        remanent = remanent % 5;
        return new Change(dollars, quarters, dimes, nickels, remanent);
    }

    public static void sortIgnoringSpaces(String[] a) {
        /*
          Please implement this method to
          sort a given array of Strngs in alphabetical order
          ignoring spaces (' ' symbols) within the strings.
         */
    }






    // Please do not change this class
    static class Change {
        private final int _dollars;
        private final int _quarters; //25 cents
        private final int _dimes; // 10 cents
        private final int _nickels; // 5 cents
        private final int _cents; // 1 cent


        public Change(int dollars, int quarters, int dimes, int nickels, int cents) {
            _dollars = dollars;
            _quarters = quarters;
            _dimes = dimes;
            _nickels = nickels;
            _cents = cents;
        }


        public int getDollars() {
            return _dollars;
        }


        public int getQuarters() {
            return _quarters;
        }


        public int getDimes() {
            return _dimes;
        }


        public int getNickels() {
            return _nickels;
        }


        public int getCents() {
            return _cents;
        }
    }
}
