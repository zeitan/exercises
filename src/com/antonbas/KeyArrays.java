package com.antonbas;

import java.util.Arrays;

public class KeyArrays {

        private final int[] values;

        public KeyArrays(int[] values) {
            this.values = values;
        }

        @Override
        public boolean equals(Object another) {
            if (another == this) {
                return true;
            }
            if (another == null) {
                return false;
            }
            if (another.getClass() != this.getClass()) {
                return false;
            }
            KeyArrays key = (KeyArrays) another;
            return Arrays.equals(this.values, key.values);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(this.values);
        }
    }

