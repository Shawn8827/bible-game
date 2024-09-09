package com.company.GameView;

import com.company.Sprite.DisasterViewSprite.Frog;
import com.company.Sprite.DisasterViewSprite.Ice;
import com.company.Sprite.RedSeaViewSprite.Cat;
import com.company.Sprite.RedSeaViewSprite.Pharaoh;
import com.company.Sprite.TemCommandmentSprite.TenCommandment;

import javax.swing.*;
import java.util.ArrayList;

public class TenCommandmentsView extends GameView {

    private int count;

    private ArrayList<TenCommandment> stones = new ArrayList<>();
    private ArrayList<Frog> frogs = new ArrayList<>();
    private ArrayList<Pharaoh> pharaohs = new ArrayList<>();
    private ArrayList<Ice> ices = new ArrayList<>();
    private ArrayList<Cat> cats = new ArrayList<>();


    public TenCommandmentsView() {
        img = new ImageIcon("mountain.jpg");
        elements = new ArrayList<>();
        count = 0;


        stones.add(new TenCommandment(1, 5));
        stones.add(new TenCommandment(2, 9));
        stones.add(new TenCommandment(3, 7));
        stones.add(new TenCommandment(3, 10));
        stones.add(new TenCommandment(4, 2));
        stones.add(new TenCommandment(5, 7));
        stones.add(new TenCommandment(7, 5));
        stones.add(new TenCommandment(8, 4));
        stones.add(new TenCommandment(9, 1));

        stones.add(new TenCommandment(10, 9));

        frogs.add(new Frog(2, 2));
        frogs.add(new Frog(1, 6));
        frogs.add(new Frog(2, 6));
        frogs.add(new Frog(2, 5));
        frogs.add(new Frog(7, 9));
        frogs.add(new Frog(8, 9));
        frogs.add(new Frog(9, 9));
        frogs.add(new Frog(9, 10));

        ices.add(new Ice(5, 6));
        ices.add(new Ice(3, 9));
        ices.add(new Ice(4, 9));
        ices.add(new Ice(4, 10));
        ices.add(new Ice(4, 4));
        ices.add(new Ice(4, 5));
        ices.add(new Ice(4, 6));

        pharaohs.add(new Pharaoh(6, 6));
        pharaohs.add(new Pharaoh(7, 6));
        pharaohs.add(new Pharaoh(8, 6));
        pharaohs.add(new Pharaoh(9, 6));
        pharaohs.add(new Pharaoh(10, 6));

        cats.add(new Cat(4, 8));
        cats.add(new Cat(4, 3));
        cats.add(new Cat(8, 1));
        cats.add(new Cat(8, 2));
        cats.add(new Cat(9, 2));
        cats.add(new Cat(9, 7));
        cats.add(new Cat(9, 8));
        cats.add(new Cat(3, 2));

        elements.addAll(frogs);
        elements.addAll(ices);
        elements.addAll(pharaohs);
        elements.addAll(cats);
        elements.addAll(stones);
    }

    public ArrayList<TenCommandment> getStones() {
        return stones;
    }

    public ArrayList<Frog> getFrogs() {
        return frogs;
    }

    public ArrayList<Pharaoh> getPharaohs() {
        return pharaohs;
    }

    public ArrayList<Ice> getIces() {
        return ices;
    }

    public ArrayList<Cat> getCats() {
        return cats;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }

}
