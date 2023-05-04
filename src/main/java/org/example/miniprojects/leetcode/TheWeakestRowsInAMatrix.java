package org.example.miniprojects.leetcode;

import java.util.*;

public class TheWeakestRowsInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        int value = 0;
        TreeSet<Row> rows = new TreeSet<>(new Comparator<Row>() {
            @Override
            public int compare(Row o1, Row o2) {
                int result = o1.getValue() - o2.getValue();
                if (result == 0) {
                    return o1.getIndex() - o2.getIndex();
                } else return result;
            }
        });

        for (int i = 0; i < mat.length; i++) {
            value = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != 1) {
                    break;
                }
                value++;
            }
            rows.add(new Row(i, value));
        }

        int[] result = new int[k];
        int index = 0;
        while (index < k) {
            result[index] = rows.first().getIndex();
            rows.remove(rows.first());
            index++;
        }

        return result;
    }

    public class Row {
        private int index;
        private int value;

        public Row(int index, int value) {
            this.index = index;
            this.value = value;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
