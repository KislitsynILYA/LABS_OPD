package lesson1.task1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Matrix {
    private final int[][] array;

    public Matrix(int[][] array) {
        this.array = array;
    }

    public void sortByLine() {
        this.sort(this::getSumLen);
    }

    public void sortByMinElement() {
        this.sort(this::getMin);
    }

    public void sortByMaxElement() {
        this.sort(this::getMax);
    }

    private void sort(Function<? super int[], ? extends Integer> mappingFunction) {
        Map<int[], Integer> map = new HashMap();
        boolean sorted = false;

        while(!sorted) {
            sorted = true;

            for(int i = 0; i < this.array.length - 1; ++i) {
                if ((Integer)map.computeIfAbsent(this.array[i], mappingFunction) > (Integer)map.computeIfAbsent(this.array[i + 1], mappingFunction)) {
                    this.swap(i, i + 1);
                    sorted = false;
                }
            }
        }

    }

    private Integer getMin(int[] ints) {
        int min = Integer.MAX_VALUE;
        int[] var3 = ints;
        int var4 = ints.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int anInt = var3[var5];
            if (anInt < min) {
                min = anInt;
            }
        }

        return min;
    }

    private Integer getMax(int[] ints) {
        int max = Integer.MIN_VALUE;
        int[] var3 = ints;
        int var4 = ints.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int j = var3[var5];
            if (j > max) {
                max = j;
            }
        }

        return max;
    }

    private void swap(int i, int i1) {
        int[] temp = this.array[i];
        this.array[i] = this.array[i1];
        this.array[i1] = temp;
    }

    private int getSumLen(int[] array) {
        int count = 0;
        int[] var3 = array;
        int var4 = array.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int j = var3[var5];
            count += j;
        }

        return count;
    }

    public String toString() {
        return Arrays.deepToString(this.array);
    }

    public int[][] getArray() {
        return this.array;
    }
}
