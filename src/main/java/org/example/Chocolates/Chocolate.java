package org.example.Chocolates;

public class Chocolate implements Comparable<Chocolate> {
    private String name;
    private int price;
    private int weight;

    public Chocolate(String name ,int price ,int weight){
        this.name=name;
        this.price=price;
        this.weight=weight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Chocolate choco) {
        if(choco.price > price)
            return 1;
        if(choco.price < price)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Chocolate Data{" +
                "Name : '" + name + '\'' +
                ", Price : " + price +
                ", Weight : " + weight +
                '}';
    }
}
