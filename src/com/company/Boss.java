package com.company;

import java.util.Random;

public class Boss {
    private int zdorove = 500;
    private int damak = 50;
    private int zashita = 2;


    public int getZdorove() {
        return zdorove;
    }

    public void setZdorove(int zdorove) {
        this.zdorove = zdorove;
    }

    public int getDamak() {
        return damak;
    }

    public void setDamak(int damak) {
        this.damak = damak;
    }

    public int getZashita() {
        return zashita;
    }

    public void setZashita(int zashita) {
        this.zashita = zashita;
    }


    public  void changeBossDefense() {
       Random r = new Random();
       int defence = r.nextInt(2);
        zashita = defence;
   }

}
