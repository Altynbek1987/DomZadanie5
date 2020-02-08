package com.company;

public class Hero {
    int zdorove;
    int damak;
    String superSposob;

    public Hero() {
    }

    public Hero(int zdorove, int damak, String superSposob) {
        this.zdorove = zdorove;
        this.damak = damak;
        this.superSposob = superSposob;
    }

    public Hero( int zdorove, String superSposob, int damak){
        this.zdorove = zdorove;
        this.damak = damak;
        this.superSposob = superSposob;

    }
    public Hero(String superSposob, int damak,int zdorove){
        this.zdorove = zdorove;
        this.damak = damak;
        this.superSposob = superSposob;


    }



}
