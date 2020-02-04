package org.example;

import org.example.Chocolates.Chocolate;
import org.example.Chocolates.Chocolate1;
import org.example.Chocolates.Chocolate2;
import org.example.Chocolates.Chocolate3;
import org.example.Gifts.Gift;
import org.example.OtherSweets.Sweet;
import org.example.OtherSweets.Sweet1;
import org.example.OtherSweets.Sweet2;
import org.example.OtherSweets.Sweet3;

import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);

        System.out.println("Loading Predefined Chocolate Data");
        Chocolate c1=new Chocolate1("Chocolate1",50,30);
        Chocolate c2=new Chocolate2("Chocolate2",70,30);
        Chocolate c3=new Chocolate3("Chocolate3",170,60);

        System.out.println("Loading Predefined Sweet Data");
        Sweet s1=new Sweet1("Sweets1",200,300);
        Sweet s2=new Sweet2("Sweets2",300,200);
        Sweet s3=new Sweet3("Sweets3",180,100);

        System.out.println("Gift being created by Chocolate & Sweet");
        Gift gift=new Gift();
        gift.addChocolates(c1,c2,c3);
        gift.addSweets(s1,s2,s3);

        System.out.println("Sorting items in Gift according to price");
        gift.sort();

        System.out.println("Total Weight of Gifts : "+gift.findTotalWeight());

        System.out.println("Enter '1' to get all Chocolates : ");
        System.out.println("Enter '2' to get all Sweets : ");
        System.out.println("Enter '3' to get most expensive Chocolate and Sweet : ");
        System.out.println("Enter '4' to get least expensive Chocolate and Sweet : ");
        choice=sc.nextInt();

        if(choice == 1){
            ArrayList<Chocolate> arrayList=gift.getChocolates();
            for (Chocolate c:arrayList) {
                System.out.println(c.toString());
            }
        }
        else if(choice == 2){
            ArrayList<Sweet> arrayList=gift.getSweets();
            for (Sweet s:arrayList){
                System.out.println(s.toString());
            }
        }
        else if(choice == 3){
            System.out.println("Most Expensive Chocolate : "+mostExpensive(gift.getChocolates()));
            System.out.println("Most Expensive Sweet : "+mostExpensive(gift.getSweets()));
        }
        else if(choice == 4){
            System.out.println("Least Expensive Chocolate : "+leastExpensive(gift.getChocolates()));
            System.out.println("Least Expensive Sweet : "+leastExpensive(gift.getSweets()));
        }
    }

    private static <T> String mostExpensive(ArrayList<T> arrayList){
        return arrayList.get(0).toString();
    }

    private static <T> String leastExpensive(ArrayList<T> arrayList){
        return arrayList.get(arrayList.size()-1).toString();
    }
}
