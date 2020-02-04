package org.example.OtherSweets;

public class Sweet implements Comparable<Sweet>{
    private String name;
    private int price;
    private int weight;

    public Sweet(String name,int price,int weight){
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
    public int compareTo(Sweet s) {
        if(s.price > price)
            return 1;
        if(s.price < price)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Sweet Data{" +
                "Name : '" + name + '\'' +
                ", Price : " + price +
                ", Weight : " + weight +
                '}';
    }
}
