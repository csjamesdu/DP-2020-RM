package com.csjamesdu.dp2020.strategy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class testSorter {

    public static void main(String[] args) {
        Cat[] arr = {new Cat(5, 5), new Cat(1,1), new Cat(6, 6)};
//        Sorter.selectionSort(arr);
        Sorter<Cat> sorter = new Sorter<>();
        sorter.Sort(arr, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                if(o1.getHeight()<o2.getHeight()) return -1;
                else if(o1.getHeight() > o2.getHeight()) return 1;
                else return 0;
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
