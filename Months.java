/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_project;

import java.util.Random;

public class Months {
    //class attributes
    private static int random_month;
    
    //Encapsulation - getter
    public static int getRandom_month() {
        return random_month;
    }
    
    //Encapsulation - setter
    public static void setRandom_month(int random_month) {
        Months.random_month = random_month;
    }
    
    //get random month(pretend the data is get from database)
    public static int nextInt(Random random, int origin, int bound) {
    if (origin >= bound) {
      throw new IllegalArgumentException();
    }
    random_month = origin + random.nextInt(bound - origin);
    
    return random_month;
  }
 
   
}
