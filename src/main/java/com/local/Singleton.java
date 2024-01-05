package com.local;

// CONTADOR SINGLETON
public class Singleton {

    private static Singleton instancia;

    private int id;

    private Singleton() {
        this.id = 1;
    }

    public static Singleton getInstance() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public int obtenerId() {
        return id++;
    }

}
