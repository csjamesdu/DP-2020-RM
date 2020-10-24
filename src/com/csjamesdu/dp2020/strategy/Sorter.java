package com.csjamesdu.dp2020.strategy;

import java.util.Comparator;

public class Sorter<T> {

    public static Comparable[] selectionSort(Comparable[] array) {
        for(int i=0; i<array.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<array.length; j++){
                minPos = array[j].compareTo(array[minPos]) < 0 ? j : minPos;
            }
            swap(array, i, minPos);
        }

        return array;
    }

    private static void swap(Comparable[] array, int i, int minPos) {
        Comparable temp = array[i];
        array[i] = array[minPos];
        array[minPos] = temp;
    }

    public void Sort(T[] array, Comparator<T> comparator) {

        for(int i=0; i< array.length-1; i++){
            int minPos = i;
            for(int j=i+1; j< array.length; j++){
                minPos = comparator.compare(array[j], array[i])==-1?j:minPos;
            }
            T temp = array[i];
            array[i] = array[minPos];
            array[minPos] = temp;
        }
    }
}
