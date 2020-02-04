package org.example.Gifts;

import org.example.Chocolates.Chocolate;
import org.example.OtherSweets.Sweet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Gift {
    private ArrayList<Chocolate> chocolates;
    private ArrayList<Sweet> sweets;

    public Gift(){
        chocolates=new ArrayList<>();
        sweets=new ArrayList<>();
    }

    public void addChocolates(Chocolate... chocolates){
        this.chocolates.addAll(Arrays.asList(chocolates));
    }

    public void addSweets(Sweet... sweets){
        this.sweets.addAll(Arrays.asList(sweets));
    }

    public void sort(){
        Collections.sort(chocolates);
        Collections.sort(sweets);
    }

    public ArrayList<Chocolate> getChocolates() {
        return chocolates;
    }

    public ArrayList<Sweet> getSweets() {
        return sweets;
    }

    public int findTotalWeight(){
        int weight=0;

        for(Chocolate c: this.chocolates)
            weight+=c.getWeight();
        for(Sweet s: this.sweets)
            weight+=s.getWeight();

        return weight;
    }
}
