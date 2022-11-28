/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_project;

import java.util.Random;

public class hours {
    //class attributes
    private static int Hours;
    
    //Encapsulation - getter
    public static int getHours() {
        return Hours;
    }
    
    //Encapsulation - setter
    public static void setHours(int Hours) {
        hours.Hours = Hours;
    }
    
    //random hours(pretend the data is get from database)
    public static int randomhours() {
        //instance of random class
        Random rand = new Random();
        Hours = rand.nextInt(25); 
        return Hours;
    }
    
}
