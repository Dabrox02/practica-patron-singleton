package com.local;

public class Main {
    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance.obtenerId());
        System.out.println(instance2.obtenerId());

    }
}