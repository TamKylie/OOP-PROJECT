/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_project;

/**
 *
 * @author 60162
 */
public class Random {
    public static int randomNumAcc() {
        //instance of random class
        java.util.Random rand = new java.util.Random();
        int bound = 1000000;
        int origin = 5555555;
        return origin + rand.nextInt(bound - origin);
    }
    
    public static int randomNumCon() {
        //instance of random class
        java.util.Random rand = new java.util.Random();
        int bound = 1000000;
        int origin = 5555555;
        return origin + rand.nextInt(bound - origin);
    }
    
    public static int randomDepo() {
        java.util.Random rand = new java.util.Random();
        int bound = 300;
        int origin = 400;
        return origin + rand.nextInt(bound - origin);
    }
    
    
    public static int randomNumInvoice() {
        //instance of random class
        java.util.Random rand = new java.util.Random();
        int bound = 10000000;
        int origin = 55555555;
        return origin + rand.nextInt(bound - origin);
    }
    
    
    
}
