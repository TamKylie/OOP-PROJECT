/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_project;

import java.util.Random;

/**
 *
 * @author 60162
 */
public class hours {
    
    public static int randomhours() {
        //instance of random class
        Random rand = new Random();
        int upperbound = 25;
        int Hours = rand.nextInt(upperbound); 
        return Hours;
    }
}
