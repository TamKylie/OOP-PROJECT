/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_project;

import javafx.scene.control.TextField;

/**
 *
 * @author 60162
 */
public class Budget {
    private static double budget;
    
    //Encapsulation - setter
    public static void setBudget(int budget) {
        Budget.budget = budget;
    }
    
    //Encapsulation - getter
    public double getBudget(){
        return budget;
    }
    
    public static double compare(int hour){
        double compare;
        double kilowatt = 0.95, total=0, tariff_Price1 = 0.218, tariff_Price2 = 0.334, tariff_Price3 = 0.516, tariff_Price4 = 0.546, tariff_Price5 = 0.571;
        double usage = hour * kilowatt * 30;
        double usage_every_tariff;
        
        if (usage <= 200){
            total = usage * tariff_Price1;
        }
        else if(usage >=201){
            total = ((usage - 200)* tariff_Price2)+(200 * tariff_Price1); 
        }
        else if (usage >=301){
            total = ((usage - 300) * tariff_Price3)+(100* tariff_Price2)+(200 * tariff_Price1);
        }
        else if (usage >=601){
            total = ((usage - 600) * tariff_Price4)+(300 * tariff_Price3)+(100* tariff_Price2)+(200 * tariff_Price1);
        }
        else{
            total = ((usage - 900) * tariff_Price5)+(300 * tariff_Price4)+(300 * tariff_Price3)+(100* tariff_Price2)+(200* tariff_Price1);
        }
        
        if (budget > usage){
            compare = budget - usage;
            System.out.println("The budget still left : " + compare);
            Important.display("Good News !!!", "\nYou still have budget for this month aircond electricity bill. \nGreat job !!! \nHope you can still remain your low usage of aircond electricity. \nYou can now increase more budget for food and savings !!!");
        }  
        else{
            compare = usage - budget;
            System.out.println("Need more budget !!! : " + compare);
            Alert_Box.display("Alert !!!", "\nYour budget has exceeded !!!\nRemember to decrease the hours aircond is used. \nElse, you will need to decrease your budget for food !!! ");
        }   
        
        return total;
    }
    
    public void Usage_Display(int hour){
        
    }
    
    public static boolean isInt(TextField input, String message){
        budget = Double.parseDouble(input.getText());
        try{
            System.out.println("The budget is : " + budget);
            return true;
           
        }catch(NumberFormatException e){
            System.out.println("Error : " + message +" is not a number");
            return false;
        }   
    
    
    

    }
    

    
}
