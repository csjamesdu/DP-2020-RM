package com.csjamesdu.dp2020.strategy;

public class Cat implements Comparable<Cat> {
    private int height;
    private int weight;

    public Cat(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Cat c) {
        if(this.height < c.height) return -1;
        else if(this.height > c.height) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
